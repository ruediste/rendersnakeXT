package com.github.ruediste.rendersnakeXT.canvas;

import org.owasp.encoder.Encode;

public interface HtmlCanvasTarget {

    void writeUnescapedWithoutAttributeCommitting(String str);

    /**
     * Commit the attributes and write the given string to the output
     */
    void writeUnescaped(String str);

    default void tag(String displayName, String tagName) {
        if (tagName == null)
            throw new RuntimeException("tagName is null");
        writeUnescaped("<" + tagName);
        tagStarted(displayName, ">", "</" + tagName + ">");
    }

    void tagStartedWithoutEndTag(String postAttributesFragment);

    void tagStarted(String display, String postAttributesFragment, String closeFragment);

    default void addAttribute(String key, String value) {
        checkAttributesUncommited();
        writeUnescapedWithoutAttributeCommitting(" " + key + "=\"");
        writeUnescapedWithoutAttributeCommitting(Encode.forHtmlAttribute(value));
        writeUnescapedWithoutAttributeCommitting("\"");
    }

    default void addAttribute(String key, int value) {
        checkAttributesUncommited();
        writeUnescapedWithoutAttributeCommitting(" " + key + "=\"" + value + "\"");
    }

    void commitAttributes();

    void CLASS(String class_);

    void checkAttributesUncommited();

    void close();

    void close(String expectedDisplay);

    /**
     * Flush the state of this target, such that the produced result can be used
     */
    void flush();

}