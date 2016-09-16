package com.github.ruediste.rendersnakeXT.canvas;

/**
 * {@link HtmlCanvasTarget} swallowing all invocations
 */
public class HtmlCanvasTargetNop implements HtmlCanvasTarget {

    @Override
    public void writeUnescapedWithoutAttributeCommitting(String str) {

    }

    @Override
    public void writeUnescaped(String str) {

    }

    @Override
    public void tagStartedWithoutEndTag(String postAttributesFragment) {

    }

    @Override
    public void tagStarted(String display, String postAttributesFragment, String closeFragment) {

    }

    @Override
    public void commitAttributes() {

    }

    @Override
    public void CLASS(String class_) {

    }

    @Override
    public void checkAttributesUncommited() {

    }

    @Override
    public void close() {

    }

    @Override
    public void close(String expectedDisplay) {

    }

    @Override
    public void flush() {

    }

}
