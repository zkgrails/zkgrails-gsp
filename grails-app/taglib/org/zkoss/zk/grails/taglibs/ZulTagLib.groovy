package org.zkoss.zk.grails.taglibs

import org.grails.plugins.zkui.ZKAbstractTagLib

class ZulTagLib extends ZKAbstractTagLib {

    static namespace = "z"

    def button = { attr, b ->
        doTag(attrs, b, org.zkoss.zul.Button, servletContext, request, response, pageScope, out)
    }    

    def window = { attr, b ->
        doTag(attrs, b, org.zkoss.zul.Window, servletContext, request, response, pageScope, out)
    }
}