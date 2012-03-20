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
    def version = "1.0.0.BUILD-SNAPSHOT"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.0 > *"
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
    }

    def onChange = { event ->
    }

    def onConfigChange = { event ->
    }
}