
package org.zkoss.zk.grails.taglibs

import org.grails.plugins.zkui.ZKAbstractTagLib
import org.zkoss.zk.fn.JspFns

class ZhtmlTagLib extends ZKAbstractTagLib {

    static namespace = "h"


    def a = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.A, servletContext, request, response, pageScope, out)
    }
    

    def abbr = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Abbr, servletContext, request, response, pageScope, out)
    }
    

    def acronym = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Acronym, servletContext, request, response, pageScope, out)
    }
    

    def address = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Address, servletContext, request, response, pageScope, out)
    }
    

    def area = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Area, servletContext, request, response, pageScope, out)
    }
    

    def b = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.B, servletContext, request, response, pageScope, out)
    }
    

    def base = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Base, servletContext, request, response, pageScope, out)
    }
    

    def big = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Big, servletContext, request, response, pageScope, out)
    }
    

    def blockquote = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Blockquote, servletContext, request, response, pageScope, out)
    }
    

    def body = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Body, servletContext, request, response, pageScope, out)
    }
    

    def br = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Br, servletContext, request, response, pageScope, out)
    }
    

    def button = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Button, servletContext, request, response, pageScope, out)
    }
    

    def caption = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Caption, servletContext, request, response, pageScope, out)
    }
    

    def center = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Center, servletContext, request, response, pageScope, out)
    }
    

    def cite = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Cite, servletContext, request, response, pageScope, out)
    }
    

    def code = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Code, servletContext, request, response, pageScope, out)
    }
    

    def col = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Col, servletContext, request, response, pageScope, out)
    }
    

    def colgroup = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Colgroup, servletContext, request, response, pageScope, out)
    }
    

    def dd = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Dd, servletContext, request, response, pageScope, out)
    }
    

    def del = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Del, servletContext, request, response, pageScope, out)
    }
    

    def dfn = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Dfn, servletContext, request, response, pageScope, out)
    }
    

    def dir = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Dir, servletContext, request, response, pageScope, out)
    }
    

    def div = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Div, servletContext, request, response, pageScope, out)
    }
    

    def dl = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Dl, servletContext, request, response, pageScope, out)
    }
    

    def dt = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Dt, servletContext, request, response, pageScope, out)
    }
    

    def em = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Em, servletContext, request, response, pageScope, out)
    }
    

    def embed = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Embed, servletContext, request, response, pageScope, out)
    }
    

    def fieldset = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Fieldset, servletContext, request, response, pageScope, out)
    }
    

    def font = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Font, servletContext, request, response, pageScope, out)
    }
    

    def form = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Form, servletContext, request, response, pageScope, out)
    }
    

    def h1 = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.H1, servletContext, request, response, pageScope, out)
    }
    

    def h2 = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.H2, servletContext, request, response, pageScope, out)
    }
    

    def h3 = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.H3, servletContext, request, response, pageScope, out)
    }
    

    def h4 = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.H4, servletContext, request, response, pageScope, out)
    }
    

    def head = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Head, servletContext, request, response, pageScope, out)
    }
    

    def hr = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Hr, servletContext, request, response, pageScope, out)
    }
    

    def html = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Html, servletContext, request, response, pageScope, out)
    }
    

    def i = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.I, servletContext, request, response, pageScope, out)
    }
    

    def iframe = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Iframe, servletContext, request, response, pageScope, out)
    }
    

    def img = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Img, servletContext, request, response, pageScope, out)
    }
    

    def input = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Input, servletContext, request, response, pageScope, out)
    }
    

    def ins = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Ins, servletContext, request, response, pageScope, out)
    }
    

    def isindex = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Isindex, servletContext, request, response, pageScope, out)
    }
    

    def kbd = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Kbd, servletContext, request, response, pageScope, out)
    }
    

    def label = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Label, servletContext, request, response, pageScope, out)
    }
    

    def legend = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Legend, servletContext, request, response, pageScope, out)
    }
    

    def li = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Li, servletContext, request, response, pageScope, out)
    }
    

    def link = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Link, servletContext, request, response, pageScope, out)
    }
    

    def map = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Map, servletContext, request, response, pageScope, out)
    }
    

    def menu = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Menu, servletContext, request, response, pageScope, out)
    }
    

    def meta = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Meta, servletContext, request, response, pageScope, out)
    }
    

    def nobr = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Nobr, servletContext, request, response, pageScope, out)
    }
    

    def object = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Object, servletContext, request, response, pageScope, out)
    }
    

    def ol = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Ol, servletContext, request, response, pageScope, out)
    }
    

    def optgroup = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Optgroup, servletContext, request, response, pageScope, out)
    }
    

    def option = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Option, servletContext, request, response, pageScope, out)
    }
    

    def p = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.P, servletContext, request, response, pageScope, out)
    }
    

    def pre = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Pre, servletContext, request, response, pageScope, out)
    }
    

    def q = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Q, servletContext, request, response, pageScope, out)
    }
    

    def raw = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Raw, servletContext, request, response, pageScope, out)
    }
    

    def s = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.S, servletContext, request, response, pageScope, out)
    }
    

    def samp = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Samp, servletContext, request, response, pageScope, out)
    }
    

    def script = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Script, servletContext, request, response, pageScope, out)
    }
    

    def select = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Select, servletContext, request, response, pageScope, out)
    }
    

    def small = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Small, servletContext, request, response, pageScope, out)
    }
    

    def span = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Span, servletContext, request, response, pageScope, out)
    }
    

    def strong = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Strong, servletContext, request, response, pageScope, out)
    }
    

    def style = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Style, servletContext, request, response, pageScope, out)
    }
    

    def sub = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Sub, servletContext, request, response, pageScope, out)
    }
    

    def sup = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Sup, servletContext, request, response, pageScope, out)
    }
    

    def table = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Table, servletContext, request, response, pageScope, out)
    }
    

    def tbody = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Tbody, servletContext, request, response, pageScope, out)
    }
    

    def td = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Td, servletContext, request, response, pageScope, out)
    }
    

    def text = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Text, servletContext, request, response, pageScope, out)
    }
    

    def textarea = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Textarea, servletContext, request, response, pageScope, out)
    }
    

    def tfoot = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Tfoot, servletContext, request, response, pageScope, out)
    }
    

    def th = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Th, servletContext, request, response, pageScope, out)
    }
    

    def thead = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Thead, servletContext, request, response, pageScope, out)
    }
    

    def title = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Title, servletContext, request, response, pageScope, out)
    }
    

    def tr = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Tr, servletContext, request, response, pageScope, out)
    }
    

    def tt = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Tt, servletContext, request, response, pageScope, out)
    }
    

    def ul = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Ul, servletContext, request, response, pageScope, out)
    }
    

    def var = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Var, servletContext, request, response, pageScope, out)
    }
    

    def zkhead = { attrs, body ->
        doTag(attrs, body, org.zkoss.zhtml.Zkhead, servletContext, request, response, pageScope, out)
    }
    
}
