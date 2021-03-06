package com.github.ruediste.rendersnakeXT.canvas;

public abstract class DelegatingHtmlCanvasTarget implements HtmlCanvasTarget {

    @Override
    public void writeUnescapedWithoutAttributeCommitting(String str) {
        getDelegate().writeUnescapedWithoutAttributeCommitting(str);
    }

    @Override
    public void writeUnescaped(String str) {
        getDelegate().writeUnescaped(str);
    }

    @Override
    public void tagStartedWithoutEndTag(String postAttributesFragment) {
        getDelegate().tagStartedWithoutEndTag(postAttributesFragment);
    }

    @Override
    public void tagStarted(String display, String postAttributesFragment, String closeFragment) {
        getDelegate().tagStarted(display, postAttributesFragment, closeFragment);
    }

    @Override
    public void addAttribute(String key, String value) {
        getDelegate().addAttribute(key, value);
    }

    @Override
    public void commitAttributes() {
        getDelegate().commitAttributes();
    }

    @Override
    public void CLASS(String class_) {
        getDelegate().CLASS(class_);
    }

    @Override
    public void checkAttributesUncommited() {
        getDelegate().checkAttributesUncommited();
    }

    @Override
    public void close() {
        getDelegate().close();
    }

    @Override
    public void close(String expectedDisplay) {
        getDelegate().close(expectedDisplay);
    }

    @Override
    public void flush() {
        getDelegate().flush();
    }

    protected abstract HtmlCanvasTarget getDelegate();

}
