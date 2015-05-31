package com.github.ruediste.rendersnakeXT.canvas;

import java.io.IOException;

import org.owasp.encoder.Encode;

public interface HtmlCanvas<TSelf extends HtmlCanvas<TSelf>> {

    HtmlCanvasTarget internal_target();

    /**
     * Return {@code this} with the right type. To be implemented by the leaf
     * class to simply {@code return this;}.
     */
    TSelf self();

    /**
     * Start a tag, but keep the attributes open. All methods except
     * {@link #writeToAttributes(String)} and {@link #CLASS(String)} will commit
     * the attributes, causing the postAttributesFragment to be written.
     */
    default TSelf startTag(String display, String postAttributesFragment,
            String closeFragment) {
        internal_target().startTag(display, postAttributesFragment,
                closeFragment);
        return self();
    }

    /**
     * Write the class and the postAttributes fragment of the last started tag (
     * {@link #startTag(String, String, String)}).
     */
    default void commitAttributes() {
        internal_target().commitAttributes();
    }

    /**
     * Close the most recent opened tag.
     * 
     * @return the receiver, a HtmlCanvas @ * , RenderException
     */
    default TSelf close() {
        internal_target().close();
        return self();
    }

    /**
     * Close the most recent opened tag and expect it to be #expectedDisplay
     * 
     * @return the receiver, a HtmlCanvas @ * , RenderException
     */
    default TSelf close(String expectedDisplay) {
        internal_target().close(expectedDisplay);
        return self();
    }

    /**
     * Check that the attributes are uncommited. Throw an error otherwise
     */
    default void checkAttributesUncommited() {
        internal_target().checkAttributesUncommited();
    }

    default void internal_writeUnescaped(String str) {
        internal_target().internal_writeUnescaped(out -> out.write(str));
    }

    /**
     * Write some text without escaping it. commits the current attributes
     * 
     * @param text
     *            String , HTML or plain text
     * @return HTMLCanvas , the receiver
     */
    default TSelf writeUnescaped(CharactersWriteable str) {
        commitAttributes();
        internal_target().internal_writeUnescaped(str);
        return self();
    }

    /**
     * Write some text without escaping it
     * 
     * @param text
     *            String , HTML or plain text
     * @return HTMLCanvas , the receiver
     */
    default TSelf writeUnescaped(String str) {
        return writeUnescaped(out -> out.write(str));
    }

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
     * Write text after HTML escaping it and close the current tag
     * 
     * @param unescapedString
     *            String , HTML or plain text or null
     * @return HTMLCanvas , the receiver
     * @throws IOException
     */
    default TSelf content(String str) {
        return write(str).close();
    }

    /**
     * Write the opening of a CDATA section (not really a HTML element).
     */
    default TSelf cdata() {
        writeUnescaped("/*<![CDATA[*/");
        return startTag("cdata", null, "/*]]>*/");
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
        writeUnescaped("<" + tagName);
        return startTag(tagName, ">", "</" + tagName + ">");
    }

    /**
     * Write the open tag &lt;{tagName}>. Requires close() or close with the
     * given display name
     */
    default TSelf tag(String tagName, String displayName) {
        if (tagName == null)
            throw new RuntimeException("tagName is null");
        writeUnescaped("<" + tagName);
        return startTag(displayName, ">", "</" + tagName + ">");
    }

    /**
     * Start a tag which does not have a corresponding end tag.
     */
    default TSelf tagWithoutEndTag(String tagName) {
        if (tagName == null)
            throw new RuntimeException("tagName is null");
        writeUnescaped("<" + tagName);
        internal_target().startTagWithoutEndTag(">");
        return self();
    }

    /**
     * Add a key=value pair to the receiver. XML escape the value.
     * 
     * @param key
     *            String (not-null)
     * @param value
     *            String | null
     * @return the receiver, an HtmlAttributes
     */
    default TSelf addAttribute(String key, String value) {
        internal_target().addAttribute(key, value);
        return self();
    }

    /**
     * Add a key=value pair to the receiver. The value is an integer, which will
     * be enclosed with double quotes in the output.
     * 
     * @param key
     *            String (not-null)
     * @return the receiver, an HtmlAttributes
     */
    default TSelf addAttribute(String key, int value) {
        checkAttributesUncommited();
        internal_writeUnescaped(" " + key + "=\"" + value + "\"");
        return self();
    }

    default TSelf render(Renderable<? super TSelf> r) {
        TSelf self = self();
        r.renderOn(self);
        return self;
    }

}
