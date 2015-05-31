package com.github.ruediste.rendersnakeXT.canvas;

public interface Html5CanvasBase<TSelf extends Html5Canvas<TSelf>> extends
        HtmlCanvas<TSelf> {
    /**
     * Add a class attribute. Multiple calls to this method are allowed. The
     * supplied classes will be combined to one single attribute.
     * */
    default TSelf CLASS(String class_) {
        internal_target().CLASS(class_);
        return self();
    }

    /**
     * Write the HTML5 doctype declaration
     */
    default TSelf doctypeHtml5() {
        writeUnescaped("<!DOCTYPE html>");
        return self();
    }

    /**
     * Append the generic <em>data</em> attribute with the given String
     * parameter as its value.
     *
     * <p>
     * The value of data will be XML escaped.
     * </p>
     */
    default TSelf DATA(String extension, String data) {
        return this.addAttribute("data-" + extension, data);
    }

    default TSelf ROLE(String value) {
        return addAttribute("role", value);
    }

    default TSelf ARIA_EXPANDED(String value) {
        return addAttribute("aria-expanded", value);
    }
}
