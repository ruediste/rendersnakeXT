package com.github.ruediste.rendersnakeXT.canvas;

/**
 * {@link HtmlConsumer} building a string
 */
public class StringHtmlConsumer implements HtmlConsumer {

    private StringBuilder sb = new StringBuilder();

    @Override
    public void accept(String html) {
        sb.append(html);
    }

    public String getString() {
        return sb.toString();
    }
}
