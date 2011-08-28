import groovy.util.*

def lang = new XmlSlurper().parse("zul-lang.xml")

def head = '''
package org.zkoss.zk.grails.taglibs

import org.grails.plugins.zkui.ZKAbstractTagLib
import org.zkoss.zk.fn.JspFns

class ZulTagLib extends ZKAbstractTagLib {

    static namespace = "z"

    def head = {attrs, b ->
        out << '<head>'
        out << '<meta http-equiv="Pragma" content="no-cache"/>'
        out << '<meta http-equiv="Expires" content="-1"/>'
        out << JspFns.outZkHtmlTags(servletContext, request, response, null)
        out << b.call()
        out << '</head>'
    }
'''

print head

lang.component.each {
    def name  = it.'component-name'.text()
    def klass = it.'component-class'.text()
    println """
    def $name = { attrs, body ->
        doTag(attrs, body, $klass, servletContext, request, response, pageScope, out)
    }
    """
}

println "}"