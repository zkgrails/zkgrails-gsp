import org.springframework.web.context.request.RequestContextHolder as RCH

import org.codehaus.groovy.grails.commons.DomainClassArtefactHandler
import org.codehaus.groovy.grails.commons.GrailsClassUtils
import org.codehaus.groovy.grails.web.metaclass.BindDynamicMethod
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.pages.TagLibraryLookup
import org.codehaus.groovy.grails.web.util.TypeConvertingMap

import org.grails.plugins.zkui.jsoup.select.Selector
import org.grails.plugins.zkui.metaclass.RedirectDynamicMethod
import org.grails.plugins.zkui.util.UriUtil
import org.zkoss.zk.ui.Executions
import org.zkoss.zul.impl.InputElement

class ZkGspGrailsPlugin {
    // the plugin version
    def version = "1.1.M2"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.2 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]

    def loadAfter = ['core', 'controllers']

    // resources that are excluded from plugin packaging
    def pluginExcludes = [
            "grails-app/views/error.gsp",
            "src/docs/**",
            "scripts/_Events.groovy",
            "web-app/**"
    ]

    // TODO Fill in these fields
    def author = "Chanwit Kaewkasi"
    def authorEmail = "chanwit@gmail.com"
    def title = "GSP TagLibs for ZK"
    def description = '''\\
ZK-GSP TagLibs for ZKGrails.
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/plugin/zk-gsp"

    def doWithWebDescriptor = { webXml ->
    }

    def doWithSpring = {
        "webManagerInit"(org.grails.plugins.zkui.WebManagerInit)
    }

    def doWithDynamicMethods = { ctx ->
        //Inject taglib namespace to Composer
        TagLibraryLookup gspTagLibraryLookup = ctx.getBean("gspTagLibraryLookup")

        CharSequence.metaClass.fixToZkUri = {String contextPath ->
            return UriUtil.fixToZk(delegate?.toString(), contextPath)
        }

        org.zkoss.zk.ui.Component.metaClass.appendChild = {Closure closure ->
            def builder = ctx.getBean('zkComponentBuilder')
            closure.resolveStrategy = Closure.DELEGATE_FIRST
            builder.build(delegate, closure)
        }
        org.zkoss.zk.ui.Component.metaClass.leftShift = {Object value ->
            delegate.appendChild(value)
        }
        org.zkoss.zk.ui.Component.metaClass.select = {String query ->
            return Selector.select(query, delegate)
        }

        org.zkoss.zk.ui.Component.metaClass.getParams = {
            return delegate.select("[name]").inject(new TypeConvertingMap()) {s, c ->
                def e = s.get(c.name)
                def value
                if (c instanceof org.zkoss.zul.Combobox) {
                    value = c.selectedItem?.value
                } else if (c instanceof org.zkoss.zul.Checkbox) {
                    value = c.value ?: c.isChecked()
                } else if (c instanceof org.zkoss.zul.Listbox) {
                    value = c.getSelectedItems()?.value as String[]
                } else {
                    value = c.value
                }
                if (value == null) {
                    value = ''
                }
                if (e == null) {
                    s.put(c.name, value)
                } else if (e instanceof Collection) {
                    e << value
                } else {
                    s.put(c.name, [s.remove(c.name), value])
                }
                return s
            }
        }

        def gDispatcher = gspTagLibraryLookup.lookupNamespaceDispatcher(GroovyPage.DEFAULT_NAMESPACE)
        org.zkoss.zk.ui.Component.metaClass.renderErrors = {Map args ->
            if (!args.bean) {
                throw new IllegalArgumentException("[bean] attribute must be specified!")
            }
            if (!application.isArtefactOfType(DomainClassArtefactHandler.TYPE, args.bean.class)) {
                throw new IllegalArgumentException("[bean] attribute must be Domain class!")
            }
            def domainClass = application.getDomainClass(args.bean.class.name)
            args.bean.errors.fieldErrors.each {
                def p = domainClass.getPropertyByName(it.field)
                def name
                if (p.manyToOne || p.oneToOne) {
                    name = "${p.referencedDomainClass.propertyName}.id"
                } else {
                    name = it.field
                }
                def selectedComponentList = delegate.select("[name=${name}]")
                String errorMessage = gDispatcher.message(error: it)
                if (selectedComponentList.size() > 0 && selectedComponentList[0] instanceof InputElement) {
                    selectedComponentList[0].setErrorMessage(errorMessage)
                } else {
                    //todo the remaining errorMessage
                }
            }
        }    
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def onChange = { event ->
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}