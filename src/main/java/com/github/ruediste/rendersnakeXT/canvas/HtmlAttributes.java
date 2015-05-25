package com.github.ruediste.rendersnakeXT.canvas;

import org.owasp.encoder.Encode;

public interface HtmlAttributes<TAttr> extends CharactersWriteable {
    TAttr self();

    /**
     * Write the supplied string directly to the output, without escaping
     */
    void writeUnescaped(String str);

    /**
     * Add a key=value pair to the receiver. XML escape the value.
     * 
     * @param key
     *            String (not-null)
     * @param value
     *            String | null
     * @return the receiver, an HtmlAttributes
     */
    default TAttr add(String key, String value) {
        writeUnescaped(" " + key + "=\"");
        writeUnescaped(Encode.forHtmlAttribute(value));
        writeUnescaped("\"");
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
    default TAttr add(String key, int value) {
        writeUnescaped(" " + key + "=\"" + value + "\"");
        return self();
    }

    /**
     * Add a class attribute. Multiple calls to this method are allowed. The
     * supplied classes will be combined to one single attribute.
     * */
    TAttr class_(String class_);
}
