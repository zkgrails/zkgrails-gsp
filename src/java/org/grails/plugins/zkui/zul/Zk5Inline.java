/* Inline.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Thu Jul 19 18:05:01     2007, Created by tomyeh
}}IS_NOTE

Copyright (C) 2007 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.grails.plugins.zkui.zul;

import java.io.Writer;
import java.io.IOException;

import org.zkoss.zk.ui.AbstractComponent;

/**
 * A comonent used to embed the browser native content (i.e., HTML tags)
 * into the output sent to the browser without additional HTML SPAN.
 * The browser native content is specified by {@link #setContent}.
 *
 * <p>Since the content is sent to client directly, {@link Zk5Inline}
 * has some limitations:
 *
 * <ol>
 * <li>The content cannot be changed dynamically. In other words,
 * once the output of {@link Zk5Inline} is sent to the client,
 * calling {@link #setContent} won't cause the client to change
 * the content accordingly. 
 * Rather, you have to invalidate its parent, such that the new
 * content will be sent to the client with its parent's content.</li>
 * <li>No style, no tooltip or others to control the look of {@link Zk5Inline}.</li>
 * </ol>
 *
 * @author tomyeh
 * @see org.zkoss.zul.Html
 */
public class Zk5Inline extends Inline {
	/** Contructs a {@link Inline} component to embed HTML tags
	 * with the specified content.
	 */
	public Zk5Inline(String content) {
		super(content);
	}	
	public String getWidgetClass() { //ZK 5.0
		return "zk.Native";
	}
	protected void renderProperties(org.zkoss.zk.ui.sys.ContentRenderer renderer)
	throws java.io.IOException { //ZK 5.0
		super.renderProperties(renderer);
		render(renderer, "prolog", getContent());
	}
	
	protected void draw(Writer out) throws IOException {		
		if (getParent() != null)
			redraw(out); //callback
		else
			out.write(getContent()); //directly output
	} 
}
