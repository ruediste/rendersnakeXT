package com.github.ruediste.rendersnakeXT.canvas;

import java.util.function.Supplier;

public interface HtmlCanvasTarget {

    void writeUnescapedWithoutAttributeCommitting(String str);

    void writeUnescapedWithoutAttributeCommitting(Supplier<String> str);

    void writeUnescaped(String str);

    default void tag(String displayName, String tagName) {
        if (tagName == null)
            throw new RuntimeException("tagName is null");
        writeUnescaped("<" + tagName);
        startTag(displayName, ">", "</" + tagName + ">");
    }

    void startTagWithoutEndTag(String postAttributesFragment);

    void startTag(String display, String postAttributesFragment, String closeFragment);

    void addAttribute(String key, String value);

    void addAttribute(String key, Supplier<String> value);

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