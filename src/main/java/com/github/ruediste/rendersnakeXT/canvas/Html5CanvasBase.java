package com.github.ruediste.rendersnakeXT.canvas;

/**
 * Additional methods which are not generated automatically
 */
public interface Html5CanvasBase<TSelf extends Html5Canvas<TSelf>> extends HtmlCanvas<TSelf> {
    /**
     * Add a class attribute. Multiple calls to this method are allowed. The
     * supplied classes will be combined to one single attribute.
     */
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

    /** These elements represent headings for their sections. */
    default TSelf h2() {
        return tag("h2");
    }

    default TSelf _h2() {
        return close("h2");
    }

    /** These elements represent headings for their sections. */
    default TSelf h3() {
        return tag("h3");
    }

    default TSelf _h3() {
        return close("h3");
    }

    /** These elements represent headings for their sections. */
    default TSelf h4() {
        return tag("h4");
    }

    default TSelf _h4() {
        return close("h4");
    }

    /** These elements represent headings for their sections. */
    default TSelf h5() {
        return tag("h5");
    }

    default TSelf _h5() {
        return close("h5");
    }

    /** These elements represent headings for their sections. */
    default TSelf h6() {
        return tag("h6");
    }

    default TSelf _h6() {
        return close("h6");
    }

    default TSelf ARIA_HIDDEN() {
        return addAttribute("aria-hidden", "true");
    }
}
