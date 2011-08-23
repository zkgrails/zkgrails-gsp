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

    def button = { attrs, b ->
        doTag(attrs, b, org.zkoss.zul.Button, servletContext, request, response, pageScope, out)
    }    

    def window = { attrs, b ->
        doTag(attrs, b, org.zkoss.zul.Window, servletContext, request, response, pageScope, out)
    }
}