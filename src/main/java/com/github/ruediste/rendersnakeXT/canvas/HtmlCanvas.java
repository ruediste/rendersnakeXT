package com.github.ruediste.rendersnakeXT.canvas;

import java.io.IOException;

import org.owasp.encoder.Encode;

public interface HtmlCanvas<TSelf extends HtmlCanvas<TSelf>> {
	/**
	 * Return {@code this} with the right type. To be implemented by the leaf
	 * class to simply {@code return this;}.
	 */
	TSelf self();

	/**
	 * Internal method directly writing to the output buffer, without any bells
	 * and whistles.
	 */
	void internal_writeUnescaped(CharactersWriteable writeable);

	/**
	 * Add a class attribute. Multiple calls to this method are allowed. The
	 * supplied classes will be combined to one single attribute.
	 * */
	TSelf CLASS(String class_);

	/**
	 * Start a tag, but keep the attributes open. All methods except
	 * {@link #writeToAttributes(String)} and {@link #CLASS(String)} will commit
	 * the attributes, causing the postAttributesFragment to be written.
	 */
	TSelf startTag(String display, String postAttributesFragment,
			String closeFragment);

	/**
	 * Write the class and the postAttributes fragment of the last started tag (
	 * {@link #startTag(String, String, String)}).
	 */
	void commitAttributes();

	/**
	 * Close the most recent opened tag.
	 * 
	 * @return the receiver, a HtmlCanvas @ * , RenderException
	 */
	TSelf close();

	/**
	 * Close the most recent opened tag and expect it to be #expectedDisplay
	 * 
	 * @return the receiver, a HtmlCanvas @ * , RenderException
	 */
	TSelf close(String expectedDisplay);

	/**
	 * Check that the attributes are uncommited. Throw an error otherwise
	 */
	void checkAttributesUncommited();

	default void internal_writeUnescaped(String str) {
		internal_writeUnescaped(out -> out.write(str));
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
		internal_writeUnescaped(str);
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
	 * Write the HTML5 doctype declaration
	 */
	default TSelf doctypeHtml5() {
		writeUnescaped("<!DOCTYPE html>");
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
	TSelf addAttribute(String key, String value);

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

	/**
	 * Opens the <em>meta</em> tag, with the specified attributes.
	 *
	 * <p>
	 * This tag must not be closed, an end tag is forbidden.
	 *
	 * <p>
	 * This tag supports the following attributes:
	 * <dl>
	 * <dt>name
	 * <dd>metainformation name
	 * <dt>content
	 * <dd>associated information
	 * <dt>scheme
	 * <dd>select form of content
	 * <dt>http-equiv
	 * <dd>HTTP response header name
	 * <dt>lang
	 * <dd>language code
	 * <dt>dir
	 * <dd>direction for weak/neutral text
	 * </dl>
	 *
	 */
	default TSelf meta() {
		writeUnescaped("<meta");
		startTag(null, null, null)
		if (attrs != null)
			attrs.writeCharsOn(out);
		out.write('/');
		out.write('>');
		return self();
	}
}
