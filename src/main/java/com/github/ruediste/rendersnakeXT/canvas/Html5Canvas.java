package com.github.ruediste.rendersnakeXT.canvas;
import java.util.function.Function;
public interface Html5Canvas<TSelf extends Html5Canvas<TSelf, TAttr>, TAttr extends Html5Attributes<TAttr>>
        extends HtmlCanvas<TSelf> {
    TAttr internal_attr();
/** The html element represents the root of an HTML document.*/
    default TSelf html() {
        return html(a -> a);
    }

/** The html element represents the root of an HTML document.*/
    default TSelf html(Function<TAttr, TAttr> a) {
        return tag("html", a.apply(internal_attr()));
    }
    default TSelf _html() {
        return tag_close("html");
    }/** The head element represents a collection of metadata for the Document.*/
    default TSelf head() {
        return head(a -> a);
    }

/** The head element represents a collection of metadata for the Document.*/
    default TSelf head(Function<TAttr, TAttr> a) {
        return tag("head", a.apply(internal_attr()));
    }
    default TSelf _head() {
        return tag_close("head");
    }/** The title element represents the document's title or name. Authors should use titles that identify their documents even when they are used out of context, for example in a user's history or bookmarks, or in search results. The document's title is often different from its first heading, since the first heading does not have to stand alone when taken out of context.*/
    default TSelf title() {
        return title(a -> a);
    }

/** The title element represents the document's title or name. Authors should use titles that identify their documents even when they are used out of context, for example in a user's history or bookmarks, or in search results. The document's title is often different from its first heading, since the first heading does not have to stand alone when taken out of context.*/
    default TSelf title(Function<TAttr, TAttr> a) {
        return tag("title", a.apply(internal_attr()));
    }
    default TSelf _title() {
        return tag_close("title");
    }/** The base element allows authors to specify the document base URL for the purposes of resolving relative URLs, and the name of the default browsing context for the purposes of following hyperlinks. The element does not represent any content beyond this information.*/
    default TSelf base() {
        return base(a -> a);
    }

/** The base element allows authors to specify the document base URL for the purposes of resolving relative URLs, and the name of the default browsing context for the purposes of following hyperlinks. The element does not represent any content beyond this information.*/
    default TSelf base(Function<TAttr, TAttr> a) {
        return tag("base", a.apply(internal_attr()));
    }
    default TSelf _base() {
        return tag_close("base");
    }/** The link element allows authors to link their document to other resources.*/
    default TSelf link() {
        return link(a -> a);
    }

/** The link element allows authors to link their document to other resources.*/
    default TSelf link(Function<TAttr, TAttr> a) {
        return tag("link", a.apply(internal_attr()));
    }
    default TSelf _link() {
        return tag_close("link");
    }/** The meta element represents various kinds of metadata that cannot be expressed using the title, base, link, style, and script elements.*/
    default TSelf meta() {
        return meta(a -> a);
    }

/** The meta element represents various kinds of metadata that cannot be expressed using the title, base, link, style, and script elements.*/
    default TSelf meta(Function<TAttr, TAttr> a) {
        return tag("meta", a.apply(internal_attr()));
    }
    default TSelf _meta() {
        return tag_close("meta");
    }/** The style element allows authors to embed style information in their documents. The style element is one of several inputs to the styling processing model. The element does not represent content for the user.*/
    default TSelf style() {
        return style(a -> a);
    }

/** The style element allows authors to embed style information in their documents. The style element is one of several inputs to the styling processing model. The element does not represent content for the user.*/
    default TSelf style(Function<TAttr, TAttr> a) {
        return tag("style", a.apply(internal_attr()));
    }
    default TSelf _style() {
        return tag_close("style");
    }/** The body element represents the main content of the document.*/
    default TSelf body() {
        return body(a -> a);
    }

/** The body element represents the main content of the document.*/
    default TSelf body(Function<TAttr, TAttr> a) {
        return tag("body", a.apply(internal_attr()));
    }
    default TSelf _body() {
        return tag_close("body");
    }/** The article element represents a complete, or self-contained, composition in a document, page, application, or site and that is, in principle, independently distributable or reusable, e.g. in syndication. This could be a forum post, a magazine or newspaper article, a blog entry, a user-submitted comment, an interactive widget or gadget, or any other independent item of content.*/
    default TSelf article() {
        return article(a -> a);
    }

/** The article element represents a complete, or self-contained, composition in a document, page, application, or site and that is, in principle, independently distributable or reusable, e.g. in syndication. This could be a forum post, a magazine or newspaper article, a blog entry, a user-submitted comment, an interactive widget or gadget, or any other independent item of content.*/
    default TSelf article(Function<TAttr, TAttr> a) {
        return tag("article", a.apply(internal_attr()));
    }
    default TSelf _article() {
        return tag_close("article");
    }/** The section element represents a generic section of a document or application. A section, in this context, is a thematic grouping of content, typically with a heading.*/
    default TSelf section() {
        return section(a -> a);
    }

/** The section element represents a generic section of a document or application. A section, in this context, is a thematic grouping of content, typically with a heading.*/
    default TSelf section(Function<TAttr, TAttr> a) {
        return tag("section", a.apply(internal_attr()));
    }
    default TSelf _section() {
        return tag_close("section");
    }/** The nav element represents a section of a page that links to other pages or to parts within the page: a section with navigation links.*/
    default TSelf nav() {
        return nav(a -> a);
    }

/** The nav element represents a section of a page that links to other pages or to parts within the page: a section with navigation links.*/
    default TSelf nav(Function<TAttr, TAttr> a) {
        return tag("nav", a.apply(internal_attr()));
    }
    default TSelf _nav() {
        return tag_close("nav");
    }/** The aside element represents a section of a page that consists of content that is tangentially related to the content around the aside element, and which could be considered separate from that content. Such sections are often represented as sidebars in printed typography.*/
    default TSelf aside() {
        return aside(a -> a);
    }

/** The aside element represents a section of a page that consists of content that is tangentially related to the content around the aside element, and which could be considered separate from that content. Such sections are often represented as sidebars in printed typography.*/
    default TSelf aside(Function<TAttr, TAttr> a) {
        return tag("aside", a.apply(internal_attr()));
    }
    default TSelf _aside() {
        return tag_close("aside");
    }/** These elements represent headings for their sections.*/
    default TSelf h1() {
        return h1(a -> a);
    }

/** These elements represent headings for their sections.*/
    default TSelf h1(Function<TAttr, TAttr> a) {
        return tag("h1", a.apply(internal_attr()));
    }
    default TSelf _h1() {
        return tag_close("h1");
    }/** The hgroup element represents the heading of a section, which consists of all the h1–h6 element children of the hgroup element. The element is used to group a set of h1–h6 elements when the heading has multiple levels, such as subheadings, alternative titles, or taglines.*/
    default TSelf hgroup() {
        return hgroup(a -> a);
    }

/** The hgroup element represents the heading of a section, which consists of all the h1–h6 element children of the hgroup element. The element is used to group a set of h1–h6 elements when the heading has multiple levels, such as subheadings, alternative titles, or taglines.*/
    default TSelf hgroup(Function<TAttr, TAttr> a) {
        return tag("hgroup", a.apply(internal_attr()));
    }
    default TSelf _hgroup() {
        return tag_close("hgroup");
    }/** The header element represents a group of introductory or navigational aids.*/
    default TSelf header() {
        return header(a -> a);
    }

/** The header element represents a group of introductory or navigational aids.*/
    default TSelf header(Function<TAttr, TAttr> a) {
        return tag("header", a.apply(internal_attr()));
    }
    default TSelf _header() {
        return tag_close("header");
    }/** The footer element represents a footer for its nearest ancestor sectioning content or sectioning root element. A footer typically contains information about its section such as who wrote it, links to related documents, copyright data, and the like.*/
    default TSelf footer() {
        return footer(a -> a);
    }

/** The footer element represents a footer for its nearest ancestor sectioning content or sectioning root element. A footer typically contains information about its section such as who wrote it, links to related documents, copyright data, and the like.*/
    default TSelf footer(Function<TAttr, TAttr> a) {
        return tag("footer", a.apply(internal_attr()));
    }
    default TSelf _footer() {
        return tag_close("footer");
    }/** The address element represents the contact information for its nearest article or body element ancestor. If that is the body element, then the contact information applies to the document as a whole.*/
    default TSelf address() {
        return address(a -> a);
    }

/** The address element represents the contact information for its nearest article or body element ancestor. If that is the body element, then the contact information applies to the document as a whole.*/
    default TSelf address(Function<TAttr, TAttr> a) {
        return tag("address", a.apply(internal_attr()));
    }
    default TSelf _address() {
        return tag_close("address");
    }/** The p element represents a paragraph.*/
    default TSelf p() {
        return p(a -> a);
    }

/** The p element represents a paragraph.*/
    default TSelf p(Function<TAttr, TAttr> a) {
        return tag("p", a.apply(internal_attr()));
    }
    default TSelf _p() {
        return tag_close("p");
    }/** The hr element represents a paragraph-level thematic break, e.g. a scene change in a story, or a transition to another topic within a section of a reference book.*/
    default TSelf hr() {
        return hr(a -> a);
    }

/** The hr element represents a paragraph-level thematic break, e.g. a scene change in a story, or a transition to another topic within a section of a reference book.*/
    default TSelf hr(Function<TAttr, TAttr> a) {
        return tag("hr", a.apply(internal_attr()));
    }
    default TSelf _hr() {
        return tag_close("hr");
    }/** The pre element represents a block of preformatted text, in which structure is represented by typographic conventions rather than by elements.*/
    default TSelf pre() {
        return pre(a -> a);
    }

/** The pre element represents a block of preformatted text, in which structure is represented by typographic conventions rather than by elements.*/
    default TSelf pre(Function<TAttr, TAttr> a) {
        return tag("pre", a.apply(internal_attr()));
    }
    default TSelf _pre() {
        return tag_close("pre");
    }/** The blockquote element represents a section that is quoted from another source.*/
    default TSelf blockquote() {
        return blockquote(a -> a);
    }

/** The blockquote element represents a section that is quoted from another source.*/
    default TSelf blockquote(Function<TAttr, TAttr> a) {
        return tag("blockquote", a.apply(internal_attr()));
    }
    default TSelf _blockquote() {
        return tag_close("blockquote");
    }/** The ol element represents a list of items, where the items have been intentionally ordered, such that changing the order would change the meaning of the document.*/
    default TSelf ol() {
        return ol(a -> a);
    }

/** The ol element represents a list of items, where the items have been intentionally ordered, such that changing the order would change the meaning of the document.*/
    default TSelf ol(Function<TAttr, TAttr> a) {
        return tag("ol", a.apply(internal_attr()));
    }
    default TSelf _ol() {
        return tag_close("ol");
    }/** The ul element represents a list of items, where the order of the items is not important — that is, where changing the order would not materially change the meaning of the document.*/
    default TSelf ul() {
        return ul(a -> a);
    }

/** The ul element represents a list of items, where the order of the items is not important — that is, where changing the order would not materially change the meaning of the document.*/
    default TSelf ul(Function<TAttr, TAttr> a) {
        return tag("ul", a.apply(internal_attr()));
    }
    default TSelf _ul() {
        return tag_close("ul");
    }/** The li element represents a list item. If its parent element is an ol, ul, or menu element, then the element is an item of the parent element's list, as defined for those elements. Otherwise, the list item has no defined list-related relationship to any other li element.*/
    default TSelf li() {
        return li(a -> a);
    }

/** The li element represents a list item. If its parent element is an ol, ul, or menu element, then the element is an item of the parent element's list, as defined for those elements. Otherwise, the list item has no defined list-related relationship to any other li element.*/
    default TSelf li(Function<TAttr, TAttr> a) {
        return tag("li", a.apply(internal_attr()));
    }
    default TSelf _li() {
        return tag_close("li");
    }/** The dl element represents an association list consisting of zero or more name-value groups (a description list). A name-value group consists of one or more names (dt elements) followed by one or more values (dd elements), ignoring any nodes other than dt and dd elements. Within a single dl element, there should not be more than one dt element for each name.*/
    default TSelf dl() {
        return dl(a -> a);
    }

/** The dl element represents an association list consisting of zero or more name-value groups (a description list). A name-value group consists of one or more names (dt elements) followed by one or more values (dd elements), ignoring any nodes other than dt and dd elements. Within a single dl element, there should not be more than one dt element for each name.*/
    default TSelf dl(Function<TAttr, TAttr> a) {
        return tag("dl", a.apply(internal_attr()));
    }
    default TSelf _dl() {
        return tag_close("dl");
    }/** The dt element represents the term, or name, part of a term-description group in a description list (dl element).*/
    default TSelf dt() {
        return dt(a -> a);
    }

/** The dt element represents the term, or name, part of a term-description group in a description list (dl element).*/
    default TSelf dt(Function<TAttr, TAttr> a) {
        return tag("dt", a.apply(internal_attr()));
    }
    default TSelf _dt() {
        return tag_close("dt");
    }/** The dd element represents the description, definition, or value, part of a term-description group in a description list (dl element).*/
    default TSelf dd() {
        return dd(a -> a);
    }

/** The dd element represents the description, definition, or value, part of a term-description group in a description list (dl element).*/
    default TSelf dd(Function<TAttr, TAttr> a) {
        return tag("dd", a.apply(internal_attr()));
    }
    default TSelf _dd() {
        return tag_close("dd");
    }/** The figure element represents some flow content, optionally with a caption, that is self-contained (like a complete sentence) and is typically referenced as a single unit from the main flow of the document.*/
    default TSelf figure() {
        return figure(a -> a);
    }

/** The figure element represents some flow content, optionally with a caption, that is self-contained (like a complete sentence) and is typically referenced as a single unit from the main flow of the document.*/
    default TSelf figure(Function<TAttr, TAttr> a) {
        return tag("figure", a.apply(internal_attr()));
    }
    default TSelf _figure() {
        return tag_close("figure");
    }/** The figcaption element represents a caption or legend for the rest of the contents of the figcaption element's parent figure element, if any.*/
    default TSelf figcaption() {
        return figcaption(a -> a);
    }

/** The figcaption element represents a caption or legend for the rest of the contents of the figcaption element's parent figure element, if any.*/
    default TSelf figcaption(Function<TAttr, TAttr> a) {
        return tag("figcaption", a.apply(internal_attr()));
    }
    default TSelf _figcaption() {
        return tag_close("figcaption");
    }/** The main element can be used as a container for the dominant contents of another element. It represents its children.*/
    default TSelf main() {
        return main(a -> a);
    }

/** The main element can be used as a container for the dominant contents of another element. It represents its children.*/
    default TSelf main(Function<TAttr, TAttr> a) {
        return tag("main", a.apply(internal_attr()));
    }
    default TSelf _main() {
        return tag_close("main");
    }/** The div element has no special meaning at all. It represents its children. It can be used with the class, lang, and title attributes to mark up semantics common to a group of consecutive elements.*/
    default TSelf div() {
        return div(a -> a);
    }

/** The div element has no special meaning at all. It represents its children. It can be used with the class, lang, and title attributes to mark up semantics common to a group of consecutive elements.*/
    default TSelf div(Function<TAttr, TAttr> a) {
        return tag("div", a.apply(internal_attr()));
    }
    default TSelf _div() {
        return tag_close("div");
    }/** If the a element has an href attribute, then it represents a hyperlink (a hypertext anchor) labeled by its contents.*/
    default TSelf a() {
        return a(a -> a);
    }

/** If the a element has an href attribute, then it represents a hyperlink (a hypertext anchor) labeled by its contents.*/
    default TSelf a(Function<TAttr, TAttr> a) {
        return tag("a", a.apply(internal_attr()));
    }
    default TSelf _a() {
        return tag_close("a");
    }/** The em element represents stress emphasis of its contents.*/
    default TSelf em() {
        return em(a -> a);
    }

/** The em element represents stress emphasis of its contents.*/
    default TSelf em(Function<TAttr, TAttr> a) {
        return tag("em", a.apply(internal_attr()));
    }
    default TSelf _em() {
        return tag_close("em");
    }/** The strong element represents strong importance, seriousness, or urgency for its contents.*/
    default TSelf strong() {
        return strong(a -> a);
    }

/** The strong element represents strong importance, seriousness, or urgency for its contents.*/
    default TSelf strong(Function<TAttr, TAttr> a) {
        return tag("strong", a.apply(internal_attr()));
    }
    default TSelf _strong() {
        return tag_close("strong");
    }/** The small element represents side comments such as small print.*/
    default TSelf small() {
        return small(a -> a);
    }

/** The small element represents side comments such as small print.*/
    default TSelf small(Function<TAttr, TAttr> a) {
        return tag("small", a.apply(internal_attr()));
    }
    default TSelf _small() {
        return tag_close("small");
    }/** The s element represents contents that are no longer accurate or no longer relevant.*/
    default TSelf s() {
        return s(a -> a);
    }

/** The s element represents contents that are no longer accurate or no longer relevant.*/
    default TSelf s(Function<TAttr, TAttr> a) {
        return tag("s", a.apply(internal_attr()));
    }
    default TSelf _s() {
        return tag_close("s");
    }/** The cite element represents the title of a work (e.g. a book, a paper, an essay, a poem, a score, a song, a script, a film, a TV show, a game, a sculpture, a painting, a theatre production, a play, an opera, a musical, an exhibition, a legal case report, a computer program, etc). This can be a work that is being quoted or referenced in detail (i.e. a citation), or it can just be a work that is mentioned in passing.*/
    default TSelf cite() {
        return cite(a -> a);
    }

/** The cite element represents the title of a work (e.g. a book, a paper, an essay, a poem, a score, a song, a script, a film, a TV show, a game, a sculpture, a painting, a theatre production, a play, an opera, a musical, an exhibition, a legal case report, a computer program, etc). This can be a work that is being quoted or referenced in detail (i.e. a citation), or it can just be a work that is mentioned in passing.*/
    default TSelf cite(Function<TAttr, TAttr> a) {
        return tag("cite", a.apply(internal_attr()));
    }
    default TSelf _cite() {
        return tag_close("cite");
    }/** The q element represents some phrasing content quoted from another source.*/
    default TSelf q() {
        return q(a -> a);
    }

/** The q element represents some phrasing content quoted from another source.*/
    default TSelf q(Function<TAttr, TAttr> a) {
        return tag("q", a.apply(internal_attr()));
    }
    default TSelf _q() {
        return tag_close("q");
    }/** The dfn element represents the defining instance of a term. The paragraph, description list group, or section that is the nearest ancestor of the dfn element must also contain the definition(s) for the term given by the dfn element.*/
    default TSelf dfn() {
        return dfn(a -> a);
    }

/** The dfn element represents the defining instance of a term. The paragraph, description list group, or section that is the nearest ancestor of the dfn element must also contain the definition(s) for the term given by the dfn element.*/
    default TSelf dfn(Function<TAttr, TAttr> a) {
        return tag("dfn", a.apply(internal_attr()));
    }
    default TSelf _dfn() {
        return tag_close("dfn");
    }/** The abbr element represents an abbreviation or acronym, optionally with its expansion. The title attribute may be used to provide an expansion of the abbreviation. The attribute, if specified, must contain an expansion of the abbreviation, and nothing else.*/
    default TSelf abbr() {
        return abbr(a -> a);
    }

/** The abbr element represents an abbreviation or acronym, optionally with its expansion. The title attribute may be used to provide an expansion of the abbreviation. The attribute, if specified, must contain an expansion of the abbreviation, and nothing else.*/
    default TSelf abbr(Function<TAttr, TAttr> a) {
        return tag("abbr", a.apply(internal_attr()));
    }
    default TSelf _abbr() {
        return tag_close("abbr");
    }/** The ruby element allows one or more spans of phrasing content to be marked with ruby annotations. Ruby annotations are short runs of text presented alongside base text, primarily used in East Asian typography as a guide for pronunciation or to include other annotations. In Japanese, this form of typography is also known as furigana.*/
    default TSelf ruby() {
        return ruby(a -> a);
    }

/** The ruby element allows one or more spans of phrasing content to be marked with ruby annotations. Ruby annotations are short runs of text presented alongside base text, primarily used in East Asian typography as a guide for pronunciation or to include other annotations. In Japanese, this form of typography is also known as furigana.*/
    default TSelf ruby(Function<TAttr, TAttr> a) {
        return tag("ruby", a.apply(internal_attr()));
    }
    default TSelf _ruby() {
        return tag_close("ruby");
    }/** The rt element marks the ruby text component of a ruby annotation. When it is the child of a ruby element, it doesn't represent anything itself, but the ruby element uses it as part of determining what it represents.*/
    default TSelf rt() {
        return rt(a -> a);
    }

/** The rt element marks the ruby text component of a ruby annotation. When it is the child of a ruby element, it doesn't represent anything itself, but the ruby element uses it as part of determining what it represents.*/
    default TSelf rt(Function<TAttr, TAttr> a) {
        return tag("rt", a.apply(internal_attr()));
    }
    default TSelf _rt() {
        return tag_close("rt");
    }/** The rp element can be used to provide parentheses or other content around a ruby text component of a ruby annotation, to be shown by user agents that don't support ruby annotations.*/
    default TSelf rp() {
        return rp(a -> a);
    }

/** The rp element can be used to provide parentheses or other content around a ruby text component of a ruby annotation, to be shown by user agents that don't support ruby annotations.*/
    default TSelf rp(Function<TAttr, TAttr> a) {
        return tag("rp", a.apply(internal_attr()));
    }
    default TSelf _rp() {
        return tag_close("rp");
    }/** The data element represents its contents, along with a machine-readable form of those contents in the value attribute.*/
    default TSelf data() {
        return data(a -> a);
    }

/** The data element represents its contents, along with a machine-readable form of those contents in the value attribute.*/
    default TSelf data(Function<TAttr, TAttr> a) {
        return tag("data", a.apply(internal_attr()));
    }
    default TSelf _data() {
        return tag_close("data");
    }/** The time element represents its contents, along with a machine-readable form of those contents in the datetime attribute. The kind of content is limited to various kinds of dates, times, time-zone offsets, and durations, as described below.*/
    default TSelf time() {
        return time(a -> a);
    }

/** The time element represents its contents, along with a machine-readable form of those contents in the datetime attribute. The kind of content is limited to various kinds of dates, times, time-zone offsets, and durations, as described below.*/
    default TSelf time(Function<TAttr, TAttr> a) {
        return tag("time", a.apply(internal_attr()));
    }
    default TSelf _time() {
        return tag_close("time");
    }/** The code element represents a fragment of computer code. This could be an XML element name, a file name, a computer program, or any other string that a computer would recognize.*/
    default TSelf code() {
        return code(a -> a);
    }

/** The code element represents a fragment of computer code. This could be an XML element name, a file name, a computer program, or any other string that a computer would recognize.*/
    default TSelf code(Function<TAttr, TAttr> a) {
        return tag("code", a.apply(internal_attr()));
    }
    default TSelf _code() {
        return tag_close("code");
    }/** The var element represents a variable. This could be an actual variable in a mathematical expression or programming context, an identifier representing a constant, a symbol identifying a physical quantity, a function parameter, or just be a term used as a placeholder in prose.*/
    default TSelf var() {
        return var(a -> a);
    }

/** The var element represents a variable. This could be an actual variable in a mathematical expression or programming context, an identifier representing a constant, a symbol identifying a physical quantity, a function parameter, or just be a term used as a placeholder in prose.*/
    default TSelf var(Function<TAttr, TAttr> a) {
        return tag("var", a.apply(internal_attr()));
    }
    default TSelf _var() {
        return tag_close("var");
    }/** The samp element represents sample or quoted output from another program or computing system.*/
    default TSelf samp() {
        return samp(a -> a);
    }

/** The samp element represents sample or quoted output from another program or computing system.*/
    default TSelf samp(Function<TAttr, TAttr> a) {
        return tag("samp", a.apply(internal_attr()));
    }
    default TSelf _samp() {
        return tag_close("samp");
    }/** The kbd element represents user input (typically keyboard input, although it may also be used to represent other input, such as voice commands).*/
    default TSelf kbd() {
        return kbd(a -> a);
    }

/** The kbd element represents user input (typically keyboard input, although it may also be used to represent other input, such as voice commands).*/
    default TSelf kbd(Function<TAttr, TAttr> a) {
        return tag("kbd", a.apply(internal_attr()));
    }
    default TSelf _kbd() {
        return tag_close("kbd");
    }/** The sup element represents a superscript and the sub element represents a subscript.*/
    default TSelf sub() {
        return sub(a -> a);
    }

/** The sup element represents a superscript and the sub element represents a subscript.*/
    default TSelf sub(Function<TAttr, TAttr> a) {
        return tag("sub", a.apply(internal_attr()));
    }
    default TSelf _sub() {
        return tag_close("sub");
    }/** The i element represents a span of text in an alternate voice or mood, or otherwise offset from the normal prose in a manner indicating a different quality of text, such as a taxonomic designation, a technical term, an idiomatic phrase from another language, transliteration, a thought, or a ship name in Western texts.*/
    default TSelf i() {
        return i(a -> a);
    }

/** The i element represents a span of text in an alternate voice or mood, or otherwise offset from the normal prose in a manner indicating a different quality of text, such as a taxonomic designation, a technical term, an idiomatic phrase from another language, transliteration, a thought, or a ship name in Western texts.*/
    default TSelf i(Function<TAttr, TAttr> a) {
        return tag("i", a.apply(internal_attr()));
    }
    default TSelf _i() {
        return tag_close("i");
    }/** The b element represents a span of text to which attention is being drawn for utilitarian purposes without conveying any extra importance and with no implication of an alternate voice or mood, such as key words in a document abstract, product names in a review, actionable words in interactive text-driven software, or an article lede.*/
    default TSelf b() {
        return b(a -> a);
    }

/** The b element represents a span of text to which attention is being drawn for utilitarian purposes without conveying any extra importance and with no implication of an alternate voice or mood, such as key words in a document abstract, product names in a review, actionable words in interactive text-driven software, or an article lede.*/
    default TSelf b(Function<TAttr, TAttr> a) {
        return tag("b", a.apply(internal_attr()));
    }
    default TSelf _b() {
        return tag_close("b");
    }/** The u element represents a span of text with an unarticulated, though explicitly rendered, non-textual annotation, such as labeling the text as being a proper name in Chinese text (a Chinese proper name mark), or labeling the text as being misspelt.*/
    default TSelf u() {
        return u(a -> a);
    }

/** The u element represents a span of text with an unarticulated, though explicitly rendered, non-textual annotation, such as labeling the text as being a proper name in Chinese text (a Chinese proper name mark), or labeling the text as being misspelt.*/
    default TSelf u(Function<TAttr, TAttr> a) {
        return tag("u", a.apply(internal_attr()));
    }
    default TSelf _u() {
        return tag_close("u");
    }/** The mark element represents a run of text in one document marked or highlighted for reference purposes, due to its relevance in another context. When used in a quotation or other block of text referred to from the prose, it indicates a highlight that was not originally present but which has been added to bring the reader's attention to a part of the text that might not have been considered important by the original author when the block was originally written, but which is now under previously unexpected scrutiny. When used in the main prose of a document, it indicates a part of the document that has been highlighted due to its likely relevance to the user's current activity.*/
    default TSelf mark() {
        return mark(a -> a);
    }

/** The mark element represents a run of text in one document marked or highlighted for reference purposes, due to its relevance in another context. When used in a quotation or other block of text referred to from the prose, it indicates a highlight that was not originally present but which has been added to bring the reader's attention to a part of the text that might not have been considered important by the original author when the block was originally written, but which is now under previously unexpected scrutiny. When used in the main prose of a document, it indicates a part of the document that has been highlighted due to its likely relevance to the user's current activity.*/
    default TSelf mark(Function<TAttr, TAttr> a) {
        return tag("mark", a.apply(internal_attr()));
    }
    default TSelf _mark() {
        return tag_close("mark");
    }/** The bdi element represents a span of text that is to be isolated from its surroundings for the purposes of bidirectional text formatting. [BIDI]*/
    default TSelf bdi() {
        return bdi(a -> a);
    }

/** The bdi element represents a span of text that is to be isolated from its surroundings for the purposes of bidirectional text formatting. [BIDI]*/
    default TSelf bdi(Function<TAttr, TAttr> a) {
        return tag("bdi", a.apply(internal_attr()));
    }
    default TSelf _bdi() {
        return tag_close("bdi");
    }/** The bdo element represents explicit text directionality formatting control for its children. It allows authors to override the Unicode bidirectional algorithm by explicitly specifying a direction override. [BIDI]*/
    default TSelf bdo() {
        return bdo(a -> a);
    }

/** The bdo element represents explicit text directionality formatting control for its children. It allows authors to override the Unicode bidirectional algorithm by explicitly specifying a direction override. [BIDI]*/
    default TSelf bdo(Function<TAttr, TAttr> a) {
        return tag("bdo", a.apply(internal_attr()));
    }
    default TSelf _bdo() {
        return tag_close("bdo");
    }/** The span element doesn't mean anything on its own, but can be useful when used together with the global attributes, e.g. class, lang, or dir. It represents its children.*/
    default TSelf span() {
        return span(a -> a);
    }

/** The span element doesn't mean anything on its own, but can be useful when used together with the global attributes, e.g. class, lang, or dir. It represents its children.*/
    default TSelf span(Function<TAttr, TAttr> a) {
        return tag("span", a.apply(internal_attr()));
    }
    default TSelf _span() {
        return tag_close("span");
    }/** The br element represents a line break.*/
    default TSelf br() {
        return br(a -> a);
    }

/** The br element represents a line break.*/
    default TSelf br(Function<TAttr, TAttr> a) {
        return tag("br", a.apply(internal_attr()));
    }
    default TSelf _br() {
        return tag_close("br");
    }/** The wbr element represents a line break opportunity.*/
    default TSelf wbr() {
        return wbr(a -> a);
    }

/** The wbr element represents a line break opportunity.*/
    default TSelf wbr(Function<TAttr, TAttr> a) {
        return tag("wbr", a.apply(internal_attr()));
    }
    default TSelf _wbr() {
        return tag_close("wbr");
    }/** The ins element represents an addition to the document.*/
    default TSelf ins() {
        return ins(a -> a);
    }

/** The ins element represents an addition to the document.*/
    default TSelf ins(Function<TAttr, TAttr> a) {
        return tag("ins", a.apply(internal_attr()));
    }
    default TSelf _ins() {
        return tag_close("ins");
    }/** The del element represents a removal from the document.*/
    default TSelf del() {
        return del(a -> a);
    }

/** The del element represents a removal from the document.*/
    default TSelf del(Function<TAttr, TAttr> a) {
        return tag("del", a.apply(internal_attr()));
    }
    default TSelf _del() {
        return tag_close("del");
    }/** The picture element is a container which provides multiple sources to its contained img element to allow authors to declaratively control or give hints to the user agent about which image resource to use, based on the screen pixel density, viewport size, image format, and other factors. It represents its children.*/
    default TSelf picture() {
        return picture(a -> a);
    }

/** The picture element is a container which provides multiple sources to its contained img element to allow authors to declaratively control or give hints to the user agent about which image resource to use, based on the screen pixel density, viewport size, image format, and other factors. It represents its children.*/
    default TSelf picture(Function<TAttr, TAttr> a) {
        return tag("picture", a.apply(internal_attr()));
    }
    default TSelf _picture() {
        return tag_close("picture");
    }/** The authoring requirements in this section only apply if the source element has a parent that is a picture element.*/
    default TSelf source() {
        return source(a -> a);
    }

/** The authoring requirements in this section only apply if the source element has a parent that is a picture element.*/
    default TSelf source(Function<TAttr, TAttr> a) {
        return tag("source", a.apply(internal_attr()));
    }
    default TSelf _source() {
        return tag_close("source");
    }/** An img element represents an image.*/
    default TSelf img() {
        return img(a -> a);
    }

/** An img element represents an image.*/
    default TSelf img(Function<TAttr, TAttr> a) {
        return tag("img", a.apply(internal_attr()));
    }
    default TSelf _img() {
        return tag_close("img");
    }/** The iframe element represents a nested browsing context.*/
    default TSelf iframe() {
        return iframe(a -> a);
    }

/** The iframe element represents a nested browsing context.*/
    default TSelf iframe(Function<TAttr, TAttr> a) {
        return tag("iframe", a.apply(internal_attr()));
    }
    default TSelf _iframe() {
        return tag_close("iframe");
    }/** The embed element provides an integration point for an external (typically non-HTML) application or interactive content.*/
    default TSelf embed() {
        return embed(a -> a);
    }

/** The embed element provides an integration point for an external (typically non-HTML) application or interactive content.*/
    default TSelf embed(Function<TAttr, TAttr> a) {
        return tag("embed", a.apply(internal_attr()));
    }
    default TSelf _embed() {
        return tag_close("embed");
    }/** The object element can represent an external resource, which, depending on the type of the resource, will either be treated as an image, as a nested browsing context, or as an external resource to be processed by a plugin.*/
    default TSelf object() {
        return object(a -> a);
    }

/** The object element can represent an external resource, which, depending on the type of the resource, will either be treated as an image, as a nested browsing context, or as an external resource to be processed by a plugin.*/
    default TSelf object(Function<TAttr, TAttr> a) {
        return tag("object", a.apply(internal_attr()));
    }
    default TSelf _object() {
        return tag_close("object");
    }/** The param element defines parameters for plugins invoked by object elements. It does not represent anything on its own.*/
    default TSelf param() {
        return param(a -> a);
    }

/** The param element defines parameters for plugins invoked by object elements. It does not represent anything on its own.*/
    default TSelf param(Function<TAttr, TAttr> a) {
        return tag("param", a.apply(internal_attr()));
    }
    default TSelf _param() {
        return tag_close("param");
    }/** A video element is used for playing videos or movies, and audio files with captions.*/
    default TSelf video() {
        return video(a -> a);
    }

/** A video element is used for playing videos or movies, and audio files with captions.*/
    default TSelf video(Function<TAttr, TAttr> a) {
        return tag("video", a.apply(internal_attr()));
    }
    default TSelf _video() {
        return tag_close("video");
    }/** An audio element represents a sound or audio stream.*/
    default TSelf audio() {
        return audio(a -> a);
    }

/** An audio element represents a sound or audio stream.*/
    default TSelf audio(Function<TAttr, TAttr> a) {
        return tag("audio", a.apply(internal_attr()));
    }
    default TSelf _audio() {
        return tag_close("audio");
    }/** The track element allows authors to specify explicit external timed text tracks for media elements. It does not represent anything on its own.*/
    default TSelf track() {
        return track(a -> a);
    }

/** The track element allows authors to specify explicit external timed text tracks for media elements. It does not represent anything on its own.*/
    default TSelf track(Function<TAttr, TAttr> a) {
        return tag("track", a.apply(internal_attr()));
    }
    default TSelf _track() {
        return tag_close("track");
    }/** The map element, in conjunction with an img element and any area element descendants, defines an image map. The element represents its children.*/
    default TSelf map() {
        return map(a -> a);
    }

/** The map element, in conjunction with an img element and any area element descendants, defines an image map. The element represents its children.*/
    default TSelf map(Function<TAttr, TAttr> a) {
        return tag("map", a.apply(internal_attr()));
    }
    default TSelf _map() {
        return tag_close("map");
    }/** The area element represents either a hyperlink with some text and a corresponding area on an image map, or a dead area on an image map.*/
    default TSelf area() {
        return area(a -> a);
    }

/** The area element represents either a hyperlink with some text and a corresponding area on an image map, or a dead area on an image map.*/
    default TSelf area(Function<TAttr, TAttr> a) {
        return tag("area", a.apply(internal_attr()));
    }
    default TSelf _area() {
        return tag_close("area");
    }/** The table element represents data with more than one dimension, in the form of a table.*/
    default TSelf table() {
        return table(a -> a);
    }

/** The table element represents data with more than one dimension, in the form of a table.*/
    default TSelf table(Function<TAttr, TAttr> a) {
        return tag("table", a.apply(internal_attr()));
    }
    default TSelf _table() {
        return tag_close("table");
    }/** The caption element represents the title of the table that is its parent, if it has a parent and that is a table element.*/
    default TSelf caption() {
        return caption(a -> a);
    }

/** The caption element represents the title of the table that is its parent, if it has a parent and that is a table element.*/
    default TSelf caption(Function<TAttr, TAttr> a) {
        return tag("caption", a.apply(internal_attr()));
    }
    default TSelf _caption() {
        return tag_close("caption");
    }/** The colgroup element represents a group of one or more columns in the table that is its parent, if it has a parent and that is a table element.*/
    default TSelf colgroup() {
        return colgroup(a -> a);
    }

/** The colgroup element represents a group of one or more columns in the table that is its parent, if it has a parent and that is a table element.*/
    default TSelf colgroup(Function<TAttr, TAttr> a) {
        return tag("colgroup", a.apply(internal_attr()));
    }
    default TSelf _colgroup() {
        return tag_close("colgroup");
    }/** If a col element has a parent and that is a colgroup element that itself has a parent that is a table element, then the col element represents one or more columns in the column group represented by that colgroup.*/
    default TSelf col() {
        return col(a -> a);
    }

/** If a col element has a parent and that is a colgroup element that itself has a parent that is a table element, then the col element represents one or more columns in the column group represented by that colgroup.*/
    default TSelf col(Function<TAttr, TAttr> a) {
        return tag("col", a.apply(internal_attr()));
    }
    default TSelf _col() {
        return tag_close("col");
    }/** The tbody element represents a block of rows that consist of a body of data for the parent table element, if the tbody element has a parent and it is a table.*/
    default TSelf tbody() {
        return tbody(a -> a);
    }

/** The tbody element represents a block of rows that consist of a body of data for the parent table element, if the tbody element has a parent and it is a table.*/
    default TSelf tbody(Function<TAttr, TAttr> a) {
        return tag("tbody", a.apply(internal_attr()));
    }
    default TSelf _tbody() {
        return tag_close("tbody");
    }/** The thead element represents the block of rows that consist of the column labels (headers) for the parent table element, if the thead element has a parent and it is a table.*/
    default TSelf thead() {
        return thead(a -> a);
    }

/** The thead element represents the block of rows that consist of the column labels (headers) for the parent table element, if the thead element has a parent and it is a table.*/
    default TSelf thead(Function<TAttr, TAttr> a) {
        return tag("thead", a.apply(internal_attr()));
    }
    default TSelf _thead() {
        return tag_close("thead");
    }/** The tfoot element represents the block of rows that consist of the column summaries (footers) for the parent table element, if the tfoot element has a parent and it is a table.*/
    default TSelf tfoot() {
        return tfoot(a -> a);
    }

/** The tfoot element represents the block of rows that consist of the column summaries (footers) for the parent table element, if the tfoot element has a parent and it is a table.*/
    default TSelf tfoot(Function<TAttr, TAttr> a) {
        return tag("tfoot", a.apply(internal_attr()));
    }
    default TSelf _tfoot() {
        return tag_close("tfoot");
    }/** The tr element represents a row of cells in a table.*/
    default TSelf tr() {
        return tr(a -> a);
    }

/** The tr element represents a row of cells in a table.*/
    default TSelf tr(Function<TAttr, TAttr> a) {
        return tag("tr", a.apply(internal_attr()));
    }
    default TSelf _tr() {
        return tag_close("tr");
    }/** The td element represents a data cell in a table.*/
    default TSelf td() {
        return td(a -> a);
    }

/** The td element represents a data cell in a table.*/
    default TSelf td(Function<TAttr, TAttr> a) {
        return tag("td", a.apply(internal_attr()));
    }
    default TSelf _td() {
        return tag_close("td");
    }/** The th element represents a header cell in a table.*/
    default TSelf th() {
        return th(a -> a);
    }

/** The th element represents a header cell in a table.*/
    default TSelf th(Function<TAttr, TAttr> a) {
        return tag("th", a.apply(internal_attr()));
    }
    default TSelf _th() {
        return tag_close("th");
    }/** The form element represents a collection of form-associated elements, some of which can represent editable values that can be submitted to a server for processing.*/
    default TSelf form() {
        return form(a -> a);
    }

/** The form element represents a collection of form-associated elements, some of which can represent editable values that can be submitted to a server for processing.*/
    default TSelf form(Function<TAttr, TAttr> a) {
        return tag("form", a.apply(internal_attr()));
    }
    default TSelf _form() {
        return tag_close("form");
    }/** The label element represents a caption in a user interface. The caption can be associated with a specific form control, known as the label element's labeled control, either using the for attribute, or by putting the form control inside the label element itself.*/
    default TSelf label() {
        return label(a -> a);
    }

/** The label element represents a caption in a user interface. The caption can be associated with a specific form control, known as the label element's labeled control, either using the for attribute, or by putting the form control inside the label element itself.*/
    default TSelf label(Function<TAttr, TAttr> a) {
        return tag("label", a.apply(internal_attr()));
    }
    default TSelf _label() {
        return tag_close("label");
    }/** The input element represents a typed data field, usually with a form control to allow the user to edit the data.*/
    default TSelf input() {
        return input(a -> a);
    }

/** The input element represents a typed data field, usually with a form control to allow the user to edit the data.*/
    default TSelf input(Function<TAttr, TAttr> a) {
        return tag("input", a.apply(internal_attr()));
    }
    default TSelf _input() {
        return tag_close("input");
    }/** The button element represents a button labeled by its contents.*/
    default TSelf button() {
        return button(a -> a);
    }

/** The button element represents a button labeled by its contents.*/
    default TSelf button(Function<TAttr, TAttr> a) {
        return tag("button", a.apply(internal_attr()));
    }
    default TSelf _button() {
        return tag_close("button");
    }/** The select element represents a control for selecting amongst a set of options.*/
    default TSelf select() {
        return select(a -> a);
    }

/** The select element represents a control for selecting amongst a set of options.*/
    default TSelf select(Function<TAttr, TAttr> a) {
        return tag("select", a.apply(internal_attr()));
    }
    default TSelf _select() {
        return tag_close("select");
    }/** The datalist element represents a set of option elements that represent predefined options for other controls. In the rendering, the datalist element represents nothing and it, along with its children, should be hidden.*/
    default TSelf datalist() {
        return datalist(a -> a);
    }

/** The datalist element represents a set of option elements that represent predefined options for other controls. In the rendering, the datalist element represents nothing and it, along with its children, should be hidden.*/
    default TSelf datalist(Function<TAttr, TAttr> a) {
        return tag("datalist", a.apply(internal_attr()));
    }
    default TSelf _datalist() {
        return tag_close("datalist");
    }/** The optgroup element represents a group of option elements with a common label.*/
    default TSelf optgroup() {
        return optgroup(a -> a);
    }

/** The optgroup element represents a group of option elements with a common label.*/
    default TSelf optgroup(Function<TAttr, TAttr> a) {
        return tag("optgroup", a.apply(internal_attr()));
    }
    default TSelf _optgroup() {
        return tag_close("optgroup");
    }/** The option element represents an option in a select element or as part of a list of suggestions in a datalist element.*/
    default TSelf option() {
        return option(a -> a);
    }

/** The option element represents an option in a select element or as part of a list of suggestions in a datalist element.*/
    default TSelf option(Function<TAttr, TAttr> a) {
        return tag("option", a.apply(internal_attr()));
    }
    default TSelf _option() {
        return tag_close("option");
    }/** The textarea element represents a multiline plain text edit control for the element's raw value. The contents of the control represent the control's default value.*/
    default TSelf textarea() {
        return textarea(a -> a);
    }

/** The textarea element represents a multiline plain text edit control for the element's raw value. The contents of the control represent the control's default value.*/
    default TSelf textarea(Function<TAttr, TAttr> a) {
        return tag("textarea", a.apply(internal_attr()));
    }
    default TSelf _textarea() {
        return tag_close("textarea");
    }/** The keygen element represents a key pair generator control. When the control's form is submitted, the private key is stored in the local keystore, and the public key is packaged and sent to the server.*/
    default TSelf keygen() {
        return keygen(a -> a);
    }

/** The keygen element represents a key pair generator control. When the control's form is submitted, the private key is stored in the local keystore, and the public key is packaged and sent to the server.*/
    default TSelf keygen(Function<TAttr, TAttr> a) {
        return tag("keygen", a.apply(internal_attr()));
    }
    default TSelf _keygen() {
        return tag_close("keygen");
    }/** The output element represents the result of a calculation performed by the application, or the result of a user action.*/
    default TSelf output() {
        return output(a -> a);
    }

/** The output element represents the result of a calculation performed by the application, or the result of a user action.*/
    default TSelf output(Function<TAttr, TAttr> a) {
        return tag("output", a.apply(internal_attr()));
    }
    default TSelf _output() {
        return tag_close("output");
    }/** The progress element represents the completion progress of a task. The progress is either indeterminate, indicating that progress is being made but that it is not clear how much more work remains to be done before the task is complete (e.g. because the task is waiting for a remote host to respond), or the progress is a number in the range zero to a maximum, giving the fraction of work that has so far been completed.*/
    default TSelf progress() {
        return progress(a -> a);
    }

/** The progress element represents the completion progress of a task. The progress is either indeterminate, indicating that progress is being made but that it is not clear how much more work remains to be done before the task is complete (e.g. because the task is waiting for a remote host to respond), or the progress is a number in the range zero to a maximum, giving the fraction of work that has so far been completed.*/
    default TSelf progress(Function<TAttr, TAttr> a) {
        return tag("progress", a.apply(internal_attr()));
    }
    default TSelf _progress() {
        return tag_close("progress");
    }/** The meter element represents a scalar measurement within a known range, or a fractional value; for example disk usage, the relevance of a query result, or the fraction of a voting population to have selected a particular candidate.*/
    default TSelf meter() {
        return meter(a -> a);
    }

/** The meter element represents a scalar measurement within a known range, or a fractional value; for example disk usage, the relevance of a query result, or the fraction of a voting population to have selected a particular candidate.*/
    default TSelf meter(Function<TAttr, TAttr> a) {
        return tag("meter", a.apply(internal_attr()));
    }
    default TSelf _meter() {
        return tag_close("meter");
    }/** The fieldset element represents a set of form controls optionally grouped under a common name.*/
    default TSelf fieldset() {
        return fieldset(a -> a);
    }

/** The fieldset element represents a set of form controls optionally grouped under a common name.*/
    default TSelf fieldset(Function<TAttr, TAttr> a) {
        return tag("fieldset", a.apply(internal_attr()));
    }
    default TSelf _fieldset() {
        return tag_close("fieldset");
    }/** The legend element represents a caption for the rest of the contents of the legend element's parent fieldset element, if any.*/
    default TSelf legend() {
        return legend(a -> a);
    }

/** The legend element represents a caption for the rest of the contents of the legend element's parent fieldset element, if any.*/
    default TSelf legend(Function<TAttr, TAttr> a) {
        return tag("legend", a.apply(internal_attr()));
    }
    default TSelf _legend() {
        return tag_close("legend");
    }/** The details element represents a disclosure widget from which the user can obtain additional information or controls.*/
    default TSelf details() {
        return details(a -> a);
    }

/** The details element represents a disclosure widget from which the user can obtain additional information or controls.*/
    default TSelf details(Function<TAttr, TAttr> a) {
        return tag("details", a.apply(internal_attr()));
    }
    default TSelf _details() {
        return tag_close("details");
    }/** The summary element represents a summary, caption, or legend for the rest of the contents of the summary element's parent details element, if any.*/
    default TSelf summary() {
        return summary(a -> a);
    }

/** The summary element represents a summary, caption, or legend for the rest of the contents of the summary element's parent details element, if any.*/
    default TSelf summary(Function<TAttr, TAttr> a) {
        return tag("summary", a.apply(internal_attr()));
    }
    default TSelf _summary() {
        return tag_close("summary");
    }/** The menu element represents a list of commands.*/
    default TSelf menu() {
        return menu(a -> a);
    }

/** The menu element represents a list of commands.*/
    default TSelf menu(Function<TAttr, TAttr> a) {
        return tag("menu", a.apply(internal_attr()));
    }
    default TSelf _menu() {
        return tag_close("menu");
    }/** The menuitem element represents a command that the user can invoke from a popup menu (either a context menu or the menu of a menu button).*/
    default TSelf menuitem() {
        return menuitem(a -> a);
    }

/** The menuitem element represents a command that the user can invoke from a popup menu (either a context menu or the menu of a menu button).*/
    default TSelf menuitem(Function<TAttr, TAttr> a) {
        return tag("menuitem", a.apply(internal_attr()));
    }
    default TSelf _menuitem() {
        return tag_close("menuitem");
    }/** The dialog element represents a part of an application that a user interacts with to perform a task, for example a dialog box, inspector, or window.*/
    default TSelf dialog() {
        return dialog(a -> a);
    }

/** The dialog element represents a part of an application that a user interacts with to perform a task, for example a dialog box, inspector, or window.*/
    default TSelf dialog(Function<TAttr, TAttr> a) {
        return tag("dialog", a.apply(internal_attr()));
    }
    default TSelf _dialog() {
        return tag_close("dialog");
    }/** The script element allows authors to include dynamic script and data blocks in their documents. The element does not represent content for the user.*/
    default TSelf script() {
        return script(a -> a);
    }

/** The script element allows authors to include dynamic script and data blocks in their documents. The element does not represent content for the user.*/
    default TSelf script(Function<TAttr, TAttr> a) {
        return tag("script", a.apply(internal_attr()));
    }
    default TSelf _script() {
        return tag_close("script");
    }/** The noscript element represents nothing if scripting is enabled, and represents its children if scripting is disabled. It is used to present different markup to user agents that support scripting and those that don't support scripting, by affecting how the document is parsed.*/
    default TSelf noscript() {
        return noscript(a -> a);
    }

/** The noscript element represents nothing if scripting is enabled, and represents its children if scripting is disabled. It is used to present different markup to user agents that support scripting and those that don't support scripting, by affecting how the document is parsed.*/
    default TSelf noscript(Function<TAttr, TAttr> a) {
        return tag("noscript", a.apply(internal_attr()));
    }
    default TSelf _noscript() {
        return tag_close("noscript");
    }/** The template element is used to declare fragments of HTML that can be cloned and inserted in the document by script.*/
    default TSelf template() {
        return template(a -> a);
    }

/** The template element is used to declare fragments of HTML that can be cloned and inserted in the document by script.*/
    default TSelf template(Function<TAttr, TAttr> a) {
        return tag("template", a.apply(internal_attr()));
    }
    default TSelf _template() {
        return tag_close("template");
    }/** The canvas element provides scripts with a resolution-dependent bitmap canvas, which can be used for rendering graphs, game graphics, art, or other visual images on the fly.*/
    default TSelf canvas() {
        return canvas(a -> a);
    }

/** The canvas element provides scripts with a resolution-dependent bitmap canvas, which can be used for rendering graphs, game graphics, art, or other visual images on the fly.*/
    default TSelf canvas(Function<TAttr, TAttr> a) {
        return tag("canvas", a.apply(internal_attr()));
    }
    default TSelf _canvas() {
        return tag_close("canvas");
    }}
