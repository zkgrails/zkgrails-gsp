import groovy.util.*

def lang = new XmlSlurper().parse("zhtml-lang.xml")

def head = '''
package org.zkoss.zk.grails.taglibs

import org.grails.plugins.zkui.ZKAbstractTagLib
import org.zkoss.zk.fn.JspFns

class ZhtmlTagLib extends ZKAbstractTagLib {

    static namespace = "h"

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