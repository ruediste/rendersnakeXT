package com.github.ruediste.rendersnakeXT.canvas;

import java.io.IOException;

import org.owasp.encoder.Encode;

public interface HtmlCanvas<TSelf> {
    TSelf self();

    /**
     * Write some text without escaping it
     * 
     * @param text
     *            String , HTML or plain text
     * @return HTMLCanvas , the receiver
     */
    TSelf writeUnescaped(String str);

    /**
     * Write some text without escaping it
     * 
     * @param text
     *            String , HTML or plain text
     * @return HTMLCanvas , the receiver
     */
    TSelf writeUnescaped(CharactersWriteable str);

    TSelf pushTag(String expectedClose);

    /**
     * Close the most recent opened tag.
     * 
     * @return the receiver, a HtmlCanvas @ * , RenderException
     */
    TSelf close();

    /**
     * Close the most recent opened tag and expect it to be #expectedTag
     * 
     * @return the receiver, a HtmlCanvas @ * , RenderException
     */
    TSelf close(String tag);

    /**
     * Write text after HTML escaping it. No need to close().
     * 
     * @param unescapedString
     *            String , HTML or plain text or null
     * @return HTMLCanvas , the receiver
     * @throws IOException
     */
    default TSelf write(String str) {
        return writeUnescaped(Encode.forHtmlContent(str));
    }

    /**
     * Write the opening of a CDATA section (not really a HTML element).
     */
    default TSelf cdata() {
        return open("/*<![CDATA[*/", "/*]]>*/");
    }

    /**
     * Write the closing of a CDATA section (not really a HTML element).
     * 
     * @return HTMLCanvas , the receiver @
     */
    default TSelf _cdata() {
        return close("/*]]>*/");
    }

    /**
     * Write the open tag &lt;{tagName}>. Requires close().
     * 
     * @param tagName
     *            String, cannot be null
     * @return the receiver, a HtmlCanvas
     * 
     * @see #close()
     */
    default TSelf tag(String tagName) {
        if (tagName == null)
            throw new RuntimeException("tagName is null");
        writeUnescaped("<" + tagName + ">");
        return pushTag("</" + tagName + ">");
    }

    /**
     * Write the open tag with attributes {attrs}. Requires close().
     * 
     * @param tagName
     *            String, cannot be null
     * @param attrs
     *            ToAttributesString, cannot be null
     * @return the receiver, aHtmlCanvas
     * @throws IOException
     * 
     * @see #close()
     */
    default TSelf tag(String tagName, CharactersWriteable attrs) {
        if (tagName == null)
            throw new RuntimeException("tagName is null");
        writeUnescaped("<" + tagName);
        writeUnescaped(attrs);
        writeUnescaped(">");
        return pushTag("</" + tagName + '>');
    }

    default TSelf tag_close(String tagName) {
        if (tagName == null)
            throw new RuntimeException("tagName is null");
        StringBuilder buffer = new StringBuilder(tagName.length() + 3);
        buffer.append('<').append('/').append(tagName).append('>');
        return this.close(buffer.toString());
    }

    /**
     * Write the open tag {open} and push {close} to the open tag stack
     * 
     * @param open
     *            string to be written unescaped
     * @param close
     *            expected close tag
     */
    default TSelf open(String open, String close) {
        if (open == null)
            throw new RuntimeException("open is null");
        if (close == null)
            throw new RuntimeException("close is null");
        writeUnescaped(open);
        pushTag(close);
        return self();
    }

}
