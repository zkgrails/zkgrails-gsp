
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

    def layoutregion = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.LayoutRegion, servletContext, request, response, pageScope, out)
    }
    

    def a = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.A, servletContext, request, response, pageScope, out)
    }
    

    def applet = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Applet, servletContext, request, response, pageScope, out)
    }
    

    def area = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Area, servletContext, request, response, pageScope, out)
    }
    

    def audio = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Audio, servletContext, request, response, pageScope, out)
    }
    

    def auxhead = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Auxhead, servletContext, request, response, pageScope, out)
    }
    

    def auxheader = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Auxheader, servletContext, request, response, pageScope, out)
    }
    

    def bandbox = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Bandbox, servletContext, request, response, pageScope, out)
    }
    

    def bandpopup = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Bandpopup, servletContext, request, response, pageScope, out)
    }
    

    def borderlayout = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Borderlayout, servletContext, request, response, pageScope, out)
    }
    

    def button = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Button, servletContext, request, response, pageScope, out)
    }
    

    def box = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Box, servletContext, request, response, pageScope, out)
    }
    

    def calendar = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Calendar, servletContext, request, response, pageScope, out)
    }
    

    def captcha = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Captcha, servletContext, request, response, pageScope, out)
    }
    

    def caption = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Caption, servletContext, request, response, pageScope, out)
    }
    

    def cell = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Cell, servletContext, request, response, pageScope, out)
    }
    

    def center = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Center, servletContext, request, response, pageScope, out)
    }
    

    def chart = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Chart, servletContext, request, response, pageScope, out)
    }
    

    def checkbox = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Checkbox, servletContext, request, response, pageScope, out)
    }
    

    def column = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Column, servletContext, request, response, pageScope, out)
    }
    

    def columns = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Columns, servletContext, request, response, pageScope, out)
    }
    

    def combobox = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Combobox, servletContext, request, response, pageScope, out)
    }
    

    def comboitem = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Comboitem, servletContext, request, response, pageScope, out)
    }
    

    def datebox = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Datebox, servletContext, request, response, pageScope, out)
    }
    

    def decimalbox = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Decimalbox, servletContext, request, response, pageScope, out)
    }
    

    def div = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Div, servletContext, request, response, pageScope, out)
    }
    

    def doublebox = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Doublebox, servletContext, request, response, pageScope, out)
    }
    

    def doublespinner = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Doublespinner, servletContext, request, response, pageScope, out)
    }
    

    def east = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.East, servletContext, request, response, pageScope, out)
    }
    

    def fileupload = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Fileupload, servletContext, request, response, pageScope, out)
    }
    

    def flash = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Flash, servletContext, request, response, pageScope, out)
    }
    

    def flashchart = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Flashchart, servletContext, request, response, pageScope, out)
    }
    

    def foot = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Foot, servletContext, request, response, pageScope, out)
    }
    

    def footer = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Footer, servletContext, request, response, pageScope, out)
    }
    

    def frozen = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Frozen, servletContext, request, response, pageScope, out)
    }
    

    def grid = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Grid, servletContext, request, response, pageScope, out)
    }
    

    def groupbox = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Groupbox, servletContext, request, response, pageScope, out)
    }
    

    def hbox = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Hbox, servletContext, request, response, pageScope, out)
    }
    

    def hlayout = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Hlayout, servletContext, request, response, pageScope, out)
    }
    

    def html = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Html, servletContext, request, response, pageScope, out)
    }
    

    def iframe = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Iframe, servletContext, request, response, pageScope, out)
    }
    

    def image = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Image, servletContext, request, response, pageScope, out)
    }
    

    def imagemap = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Imagemap, servletContext, request, response, pageScope, out)
    }
    

    def include = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Include, servletContext, request, response, pageScope, out)
    }
    

    def intbox = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Intbox, servletContext, request, response, pageScope, out)
    }
    

    def label = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Label, servletContext, request, response, pageScope, out)
    }
    

    def listbox = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Listbox, servletContext, request, response, pageScope, out)
    }
    

    def listcell = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Listcell, servletContext, request, response, pageScope, out)
    }
    

    def listfoot = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Listfoot, servletContext, request, response, pageScope, out)
    }
    

    def listfooter = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Listfooter, servletContext, request, response, pageScope, out)
    }
    

    def listhead = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Listhead, servletContext, request, response, pageScope, out)
    }
    

    def listheader = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Listheader, servletContext, request, response, pageScope, out)
    }
    

    def listitem = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Listitem, servletContext, request, response, pageScope, out)
    }
    

    def longbox = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Longbox, servletContext, request, response, pageScope, out)
    }
    

    def macro = { attrs, body ->
        doTag(attrs, body, org.zkoss.zk.ui.HtmlMacroComponent, servletContext, request, response, pageScope, out)
    }
    

    def menu = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Menu, servletContext, request, response, pageScope, out)
    }
    

    def menubar = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Menubar, servletContext, request, response, pageScope, out)
    }
    

    def menuitem = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Menuitem, servletContext, request, response, pageScope, out)
    }
    

    def menupopup = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Menupopup, servletContext, request, response, pageScope, out)
    }
    

    def menuseparator = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Menuseparator, servletContext, request, response, pageScope, out)
    }
    

    def north = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.North, servletContext, request, response, pageScope, out)
    }
    

    def paging = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Paging, servletContext, request, response, pageScope, out)
    }
    

    def panel = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Panel, servletContext, request, response, pageScope, out)
    }
    

    def panelchildren = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Panelchildren, servletContext, request, response, pageScope, out)
    }
    

    def popup = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Popup, servletContext, request, response, pageScope, out)
    }
    

    def progressmeter = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Progressmeter, servletContext, request, response, pageScope, out)
    }
    

    def radio = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Radio, servletContext, request, response, pageScope, out)
    }
    

    def radiogroup = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Radiogroup, servletContext, request, response, pageScope, out)
    }
    

    def row = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Row, servletContext, request, response, pageScope, out)
    }
    

    def rows = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Rows, servletContext, request, response, pageScope, out)
    }
    

    def script = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Script, servletContext, request, response, pageScope, out)
    }
    

    def separator = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Separator, servletContext, request, response, pageScope, out)
    }
    

    def slider = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Slider, servletContext, request, response, pageScope, out)
    }
    

    def space = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Space, servletContext, request, response, pageScope, out)
    }
    

    def span = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Span, servletContext, request, response, pageScope, out)
    }
    

    def spinner = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Spinner, servletContext, request, response, pageScope, out)
    }
    

    def splitter = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Splitter, servletContext, request, response, pageScope, out)
    }
    

    def south = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.South, servletContext, request, response, pageScope, out)
    }
    

    def style = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Style, servletContext, request, response, pageScope, out)
    }
    

    def tabbox = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Tabbox, servletContext, request, response, pageScope, out)
    }
    

    def tabs = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Tabs, servletContext, request, response, pageScope, out)
    }
    

    def tab = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Tab, servletContext, request, response, pageScope, out)
    }
    

    def tabpanels = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Tabpanels, servletContext, request, response, pageScope, out)
    }
    

    def tabpanel = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Tabpanel, servletContext, request, response, pageScope, out)
    }
    

    def textbox = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Textbox, servletContext, request, response, pageScope, out)
    }
    

    def timebox = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Timebox, servletContext, request, response, pageScope, out)
    }
    

    def timer = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Timer, servletContext, request, response, pageScope, out)
    }
    

    def toolbar = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Toolbar, servletContext, request, response, pageScope, out)
    }
    

    def toolbarbutton = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Toolbarbutton, servletContext, request, response, pageScope, out)
    }
    

    def tree = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Tree, servletContext, request, response, pageScope, out)
    }
    

    def treecell = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Treecell, servletContext, request, response, pageScope, out)
    }
    

    def treechildren = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Treechildren, servletContext, request, response, pageScope, out)
    }
    

    def treecol = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Treecol, servletContext, request, response, pageScope, out)
    }
    

    def treecols = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Treecols, servletContext, request, response, pageScope, out)
    }
    

    def treefoot = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Treefoot, servletContext, request, response, pageScope, out)
    }
    

    def treefooter = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Treefooter, servletContext, request, response, pageScope, out)
    }
    

    def treeitem = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Treeitem, servletContext, request, response, pageScope, out)
    }
    

    def treerow = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Treerow, servletContext, request, response, pageScope, out)
    }
    

    def vbox = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Vbox, servletContext, request, response, pageScope, out)
    }
    

    def vlayout = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Vlayout, servletContext, request, response, pageScope, out)
    }
    

    def west = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.West, servletContext, request, response, pageScope, out)
    }
    

    def window = { attrs, body ->
        doTag(attrs, body, org.zkoss.zul.Window, servletContext, request, response, pageScope, out)
    }
    
}
