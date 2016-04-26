package com.github.ruediste.rendersnakeXT.canvas;

import java.util.function.Supplier;

public abstract class DelegatingHtmlCanvasTarget implements HtmlCanvasTarget {

    @Override
    public void writeUnescapedWithoutAttributeCommitting(String str) {
        getDelegate().writeUnescapedWithoutAttributeCommitting(str);
    }

    @Override
    public void writeUnescapedWithoutAttributeCommitting(Supplier<String> str) {
        getDelegate().writeUnescapedWithoutAttributeCommitting(str);
    }

    @Override
    public void writeUnescaped(String str) {
        getDelegate().writeUnescaped(str);
    }

    @Override
    public void startTagWithoutEndTag(String postAttributesFragment) {
        getDelegate().startTagWithoutEndTag(postAttributesFragment);
    }

    @Override
    public void startTag(String display, String postAttributesFragment, String closeFragment) {
        getDelegate().startTag(display, postAttributesFragment, closeFragment);
    }

    @Override
    public void addAttribute(String key, String value) {
        getDelegate().addAttribute(key, value);
    }

    @Override
    public void addAttribute(String key, Supplier<String> value) {
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
