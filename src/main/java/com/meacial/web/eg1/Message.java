package com.meacial.web.eg1;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Serical the object with json as default.
 *
 * When we wish to serial it as xml ,we should add the annonation of <tt>@XmlRootElement</tt>
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/11/18 0018 下午 1:53
 */
@XmlRootElement
public class Message {
    private String name;
    private String text;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
