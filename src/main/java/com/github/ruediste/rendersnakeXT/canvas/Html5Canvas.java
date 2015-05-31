package com.github.ruediste.rendersnakeXT.canvas;
public interface Html5Canvas<TSelf extends Html5Canvas<TSelf>>
        extends Html5CanvasBase<TSelf> {
/** The html element represents the root of an HTML document.*/
    default TSelf html() {
        return tag("html");
    }

    default TSelf _html() {
        return close("html");
    }
/** The head element represents a collection of metadata for the Document.*/
    default TSelf head() {
        return tag("head");
    }

    default TSelf _head() {
        return close("head");
    }
/** The title element represents the document's title or name. Authors should use titles that identify their documents even when they are used out of context, for example in a user's history or bookmarks, or in search results. The document's title is often different from its first heading, since the first heading does not have to stand alone when taken out of context.*/
    default TSelf title() {
        return tag("title");
    }

    default TSelf _title() {
        return close("title");
    }
/** No End Tag Allowed! <br>The base element allows authors to specify the document base URL for the purposes of resolving relative URLs, and the name of the default browsing context for the purposes of following hyperlinks. The element does not represent any content beyond this information.*/
    default TSelf base() {
        return tagWithoutEndTag("base");
    }
/** No End Tag Allowed! <br>The link element allows authors to link their document to other resources.*/
    default TSelf link() {
        return tagWithoutEndTag("link");
    }
/** No End Tag Allowed! <br>The meta element represents various kinds of metadata that cannot be expressed using the title, base, link, style, and script elements.*/
    default TSelf meta() {
        return tagWithoutEndTag("meta");
    }
/** The style element allows authors to embed style information in their documents. The style element is one of several inputs to the styling processing model. The element does not represent content for the user.*/
    default TSelf style() {
        return tag("style");
    }

    default TSelf _style() {
        return close("style");
    }
/** The body element represents the main content of the document.*/
    default TSelf body() {
        return tag("body");
    }

    default TSelf _body() {
        return close("body");
    }
/** The article element represents a complete, or self-contained, composition in a document, page, application, or site and that is, in principle, independently distributable or reusable, e.g. in syndication. This could be a forum post, a magazine or newspaper article, a blog entry, a user-submitted comment, an interactive widget or gadget, or any other independent item of content.*/
    default TSelf article() {
        return tag("article");
    }

    default TSelf _article() {
        return close("article");
    }
/** The section element represents a generic section of a document or application. A section, in this context, is a thematic grouping of content, typically with a heading.*/
    default TSelf section() {
        return tag("section");
    }

    default TSelf _section() {
        return close("section");
    }
/** The nav element represents a section of a page that links to other pages or to parts within the page: a section with navigation links.*/
    default TSelf nav() {
        return tag("nav");
    }

    default TSelf _nav() {
        return close("nav");
    }
/** The aside element represents a section of a page that consists of content that is tangentially related to the content around the aside element, and which could be considered separate from that content. Such sections are often represented as sidebars in printed typography.*/
    default TSelf aside() {
        return tag("aside");
    }

    default TSelf _aside() {
        return close("aside");
    }
/** These elements represent headings for their sections.*/
    default TSelf h1() {
        return tag("h1");
    }

    default TSelf _h1() {
        return close("h1");
    }
/** The hgroup element represents the heading of a section, which consists of all the h1–h6 element children of the hgroup element. The element is used to group a set of h1–h6 elements when the heading has multiple levels, such as subheadings, alternative titles, or taglines.*/
    default TSelf hgroup() {
        return tag("hgroup");
    }

    default TSelf _hgroup() {
        return close("hgroup");
    }
/** The header element represents a group of introductory or navigational aids.*/
    default TSelf header() {
        return tag("header");
    }

    default TSelf _header() {
        return close("header");
    }
/** The footer element represents a footer for its nearest ancestor sectioning content or sectioning root element. A footer typically contains information about its section such as who wrote it, links to related documents, copyright data, and the like.*/
    default TSelf footer() {
        return tag("footer");
    }

    default TSelf _footer() {
        return close("footer");
    }
/** The address element represents the contact information for its nearest article or body element ancestor. If that is the body element, then the contact information applies to the document as a whole.*/
    default TSelf address() {
        return tag("address");
    }

    default TSelf _address() {
        return close("address");
    }
/** The p element represents a paragraph.*/
    default TSelf p() {
        return tag("p");
    }

    default TSelf _p() {
        return close("p");
    }
/** No End Tag Allowed! <br>The hr element represents a paragraph-level thematic break, e.g. a scene change in a story, or a transition to another topic within a section of a reference book.*/
    default TSelf hr() {
        return tagWithoutEndTag("hr");
    }
/** The pre element represents a block of preformatted text, in which structure is represented by typographic conventions rather than by elements.*/
    default TSelf pre() {
        return tag("pre");
    }

    default TSelf _pre() {
        return close("pre");
    }
/** The blockquote element represents a section that is quoted from another source.*/
    default TSelf blockquote() {
        return tag("blockquote");
    }

    default TSelf _blockquote() {
        return close("blockquote");
    }
/** The ol element represents a list of items, where the items have been intentionally ordered, such that changing the order would change the meaning of the document.*/
    default TSelf ol() {
        return tag("ol");
    }

    default TSelf _ol() {
        return close("ol");
    }
/** The ul element represents a list of items, where the order of the items is not important — that is, where changing the order would not materially change the meaning of the document.*/
    default TSelf ul() {
        return tag("ul");
    }

    default TSelf _ul() {
        return close("ul");
    }
/** The li element represents a list item. If its parent element is an ol, ul, or menu element, then the element is an item of the parent element's list, as defined for those elements. Otherwise, the list item has no defined list-related relationship to any other li element.*/
    default TSelf li() {
        return tag("li");
    }

    default TSelf _li() {
        return close("li");
    }
/** The dl element represents an association list consisting of zero or more name-value groups (a description list). A name-value group consists of one or more names (dt elements) followed by one or more values (dd elements), ignoring any nodes other than dt and dd elements. Within a single dl element, there should not be more than one dt element for each name.*/
    default TSelf dl() {
        return tag("dl");
    }

    default TSelf _dl() {
        return close("dl");
    }
/** The dt element represents the term, or name, part of a term-description group in a description list (dl element).*/
    default TSelf dt() {
        return tag("dt");
    }

    default TSelf _dt() {
        return close("dt");
    }
/** The dd element represents the description, definition, or value, part of a term-description group in a description list (dl element).*/
    default TSelf dd() {
        return tag("dd");
    }

    default TSelf _dd() {
        return close("dd");
    }
/** The figure element represents some flow content, optionally with a caption, that is self-contained (like a complete sentence) and is typically referenced as a single unit from the main flow of the document.*/
    default TSelf figure() {
        return tag("figure");
    }

    default TSelf _figure() {
        return close("figure");
    }
/** The figcaption element represents a caption or legend for the rest of the contents of the figcaption element's parent figure element, if any.*/
    default TSelf figcaption() {
        return tag("figcaption");
    }

    default TSelf _figcaption() {
        return close("figcaption");
    }
/** The main element can be used as a container for the dominant contents of another element. It represents its children.*/
    default TSelf main() {
        return tag("main");
    }

    default TSelf _main() {
        return close("main");
    }
/** The div element has no special meaning at all. It represents its children. It can be used with the class, lang, and title attributes to mark up semantics common to a group of consecutive elements.*/
    default TSelf div() {
        return tag("div");
    }

    default TSelf _div() {
        return close("div");
    }
/** If the a element has an href attribute, then it represents a hyperlink (a hypertext anchor) labeled by its contents.*/
    default TSelf a() {
        return tag("a");
    }

    default TSelf _a() {
        return close("a");
    }
/** The em element represents stress emphasis of its contents.*/
    default TSelf em() {
        return tag("em");
    }

    default TSelf _em() {
        return close("em");
    }
/** The strong element represents strong importance, seriousness, or urgency for its contents.*/
    default TSelf strong() {
        return tag("strong");
    }

    default TSelf _strong() {
        return close("strong");
    }
/** The small element represents side comments such as small print.*/
    default TSelf small() {
        return tag("small");
    }

    default TSelf _small() {
        return close("small");
    }
/** The s element represents contents that are no longer accurate or no longer relevant.*/
    default TSelf s() {
        return tag("s");
    }

    default TSelf _s() {
        return close("s");
    }
/** The cite element represents the title of a work (e.g. a book, a paper, an essay, a poem, a score, a song, a script, a film, a TV show, a game, a sculpture, a painting, a theatre production, a play, an opera, a musical, an exhibition, a legal case report, a computer program, etc). This can be a work that is being quoted or referenced in detail (i.e. a citation), or it can just be a work that is mentioned in passing.*/
    default TSelf cite() {
        return tag("cite");
    }

    default TSelf _cite() {
        return close("cite");
    }
/** The q element represents some phrasing content quoted from another source.*/
    default TSelf q() {
        return tag("q");
    }

    default TSelf _q() {
        return close("q");
    }
/** The dfn element represents the defining instance of a term. The paragraph, description list group, or section that is the nearest ancestor of the dfn element must also contain the definition(s) for the term given by the dfn element.*/
    default TSelf dfn() {
        return tag("dfn");
    }

    default TSelf _dfn() {
        return close("dfn");
    }
/** The abbr element represents an abbreviation or acronym, optionally with its expansion. The title attribute may be used to provide an expansion of the abbreviation. The attribute, if specified, must contain an expansion of the abbreviation, and nothing else.*/
    default TSelf abbr() {
        return tag("abbr");
    }

    default TSelf _abbr() {
        return close("abbr");
    }
/** The ruby element allows one or more spans of phrasing content to be marked with ruby annotations. Ruby annotations are short runs of text presented alongside base text, primarily used in East Asian typography as a guide for pronunciation or to include other annotations. In Japanese, this form of typography is also known as furigana.*/
    default TSelf ruby() {
        return tag("ruby");
    }

    default TSelf _ruby() {
        return close("ruby");
    }
/** The rt element marks the ruby text component of a ruby annotation. When it is the child of a ruby element, it doesn't represent anything itself, but the ruby element uses it as part of determining what it represents.*/
    default TSelf rt() {
        return tag("rt");
    }

    default TSelf _rt() {
        return close("rt");
    }
/** The rp element can be used to provide parentheses or other content around a ruby text component of a ruby annotation, to be shown by user agents that don't support ruby annotations.*/
    default TSelf rp() {
        return tag("rp");
    }

    default TSelf _rp() {
        return close("rp");
    }
/** The data element represents its contents, along with a machine-readable form of those contents in the value attribute.*/
    default TSelf data() {
        return tag("data");
    }

    default TSelf _data() {
        return close("data");
    }
/** The time element represents its contents, along with a machine-readable form of those contents in the datetime attribute. The kind of content is limited to various kinds of dates, times, time-zone offsets, and durations, as described below.*/
    default TSelf time() {
        return tag("time");
    }

    default TSelf _time() {
        return close("time");
    }
/** The code element represents a fragment of computer code. This could be an XML element name, a file name, a computer program, or any other string that a computer would recognize.*/
    default TSelf code() {
        return tag("code");
    }

    default TSelf _code() {
        return close("code");
    }
/** The var element represents a variable. This could be an actual variable in a mathematical expression or programming context, an identifier representing a constant, a symbol identifying a physical quantity, a function parameter, or just be a term used as a placeholder in prose.*/
    default TSelf var() {
        return tag("var");
    }

    default TSelf _var() {
        return close("var");
    }
/** The samp element represents sample or quoted output from another program or computing system.*/
    default TSelf samp() {
        return tag("samp");
    }

    default TSelf _samp() {
        return close("samp");
    }
/** The kbd element represents user input (typically keyboard input, although it may also be used to represent other input, such as voice commands).*/
    default TSelf kbd() {
        return tag("kbd");
    }

    default TSelf _kbd() {
        return close("kbd");
    }
/** The sup element represents a superscript and the sub element represents a subscript.*/
    default TSelf sub() {
        return tag("sub");
    }

    default TSelf _sub() {
        return close("sub");
    }
/** The i element represents a span of text in an alternate voice or mood, or otherwise offset from the normal prose in a manner indicating a different quality of text, such as a taxonomic designation, a technical term, an idiomatic phrase from another language, transliteration, a thought, or a ship name in Western texts.*/
    default TSelf i() {
        return tag("i");
    }

    default TSelf _i() {
        return close("i");
    }
/** The b element represents a span of text to which attention is being drawn for utilitarian purposes without conveying any extra importance and with no implication of an alternate voice or mood, such as key words in a document abstract, product names in a review, actionable words in interactive text-driven software, or an article lede.*/
    default TSelf b() {
        return tag("b");
    }

    default TSelf _b() {
        return close("b");
    }
/** The u element represents a span of text with an unarticulated, though explicitly rendered, non-textual annotation, such as labeling the text as being a proper name in Chinese text (a Chinese proper name mark), or labeling the text as being misspelt.*/
    default TSelf u() {
        return tag("u");
    }

    default TSelf _u() {
        return close("u");
    }
/** The mark element represents a run of text in one document marked or highlighted for reference purposes, due to its relevance in another context. When used in a quotation or other block of text referred to from the prose, it indicates a highlight that was not originally present but which has been added to bring the reader's attention to a part of the text that might not have been considered important by the original author when the block was originally written, but which is now under previously unexpected scrutiny. When used in the main prose of a document, it indicates a part of the document that has been highlighted due to its likely relevance to the user's current activity.*/
    default TSelf mark() {
        return tag("mark");
    }

    default TSelf _mark() {
        return close("mark");
    }
/** The bdi element represents a span of text that is to be isolated from its surroundings for the purposes of bidirectional text formatting. [BIDI]*/
    default TSelf bdi() {
        return tag("bdi");
    }

    default TSelf _bdi() {
        return close("bdi");
    }
/** The bdo element represents explicit text directionality formatting control for its children. It allows authors to override the Unicode bidirectional algorithm by explicitly specifying a direction override. [BIDI]*/
    default TSelf bdo() {
        return tag("bdo");
    }

    default TSelf _bdo() {
        return close("bdo");
    }
/** The span element doesn't mean anything on its own, but can be useful when used together with the global attributes, e.g. class, lang, or dir. It represents its children.*/
    default TSelf span() {
        return tag("span");
    }

    default TSelf _span() {
        return close("span");
    }
/** No End Tag Allowed! <br>The br element represents a line break.*/
    default TSelf br() {
        return tagWithoutEndTag("br");
    }
/** No End Tag Allowed! <br>The wbr element represents a line break opportunity.*/
    default TSelf wbr() {
        return tagWithoutEndTag("wbr");
    }
/** The ins element represents an addition to the document.*/
    default TSelf ins() {
        return tag("ins");
    }

    default TSelf _ins() {
        return close("ins");
    }
/** The del element represents a removal from the document.*/
    default TSelf del() {
        return tag("del");
    }

    default TSelf _del() {
        return close("del");
    }
/** The picture element is a container which provides multiple sources to its contained img element to allow authors to declaratively control or give hints to the user agent about which image resource to use, based on the screen pixel density, viewport size, image format, and other factors. It represents its children.*/
    default TSelf picture() {
        return tag("picture");
    }

    default TSelf _picture() {
        return close("picture");
    }
/** No End Tag Allowed! <br>The authoring requirements in this section only apply if the source element has a parent that is a picture element.*/
    default TSelf source() {
        return tagWithoutEndTag("source");
    }
/** No End Tag Allowed! <br>An img element represents an image.*/
    default TSelf img() {
        return tagWithoutEndTag("img");
    }
/** The iframe element represents a nested browsing context.*/
    default TSelf iframe() {
        return tag("iframe");
    }

    default TSelf _iframe() {
        return close("iframe");
    }
/** No End Tag Allowed! <br>The embed element provides an integration point for an external (typically non-HTML) application or interactive content.*/
    default TSelf embed() {
        return tagWithoutEndTag("embed");
    }
/** The object element can represent an external resource, which, depending on the type of the resource, will either be treated as an image, as a nested browsing context, or as an external resource to be processed by a plugin.*/
    default TSelf object() {
        return tag("object");
    }

    default TSelf _object() {
        return close("object");
    }
/** No End Tag Allowed! <br>The param element defines parameters for plugins invoked by object elements. It does not represent anything on its own.*/
    default TSelf param() {
        return tagWithoutEndTag("param");
    }
/** A video element is used for playing videos or movies, and audio files with captions.*/
    default TSelf video() {
        return tag("video");
    }

    default TSelf _video() {
        return close("video");
    }
/** An audio element represents a sound or audio stream.*/
    default TSelf audio() {
        return tag("audio");
    }

    default TSelf _audio() {
        return close("audio");
    }
/** No End Tag Allowed! <br>The track element allows authors to specify explicit external timed text tracks for media elements. It does not represent anything on its own.*/
    default TSelf track() {
        return tagWithoutEndTag("track");
    }
/** The map element, in conjunction with an img element and any area element descendants, defines an image map. The element represents its children.*/
    default TSelf map() {
        return tag("map");
    }

    default TSelf _map() {
        return close("map");
    }
/** No End Tag Allowed! <br>The area element represents either a hyperlink with some text and a corresponding area on an image map, or a dead area on an image map.*/
    default TSelf area() {
        return tagWithoutEndTag("area");
    }
/** The table element represents data with more than one dimension, in the form of a table.*/
    default TSelf table() {
        return tag("table");
    }

    default TSelf _table() {
        return close("table");
    }
/** The caption element represents the title of the table that is its parent, if it has a parent and that is a table element.*/
    default TSelf caption() {
        return tag("caption");
    }

    default TSelf _caption() {
        return close("caption");
    }
/** The colgroup element represents a group of one or more columns in the table that is its parent, if it has a parent and that is a table element.*/
    default TSelf colgroup() {
        return tag("colgroup");
    }

    default TSelf _colgroup() {
        return close("colgroup");
    }
/** No End Tag Allowed! <br>If a col element has a parent and that is a colgroup element that itself has a parent that is a table element, then the col element represents one or more columns in the column group represented by that colgroup.*/
    default TSelf col() {
        return tagWithoutEndTag("col");
    }
/** The tbody element represents a block of rows that consist of a body of data for the parent table element, if the tbody element has a parent and it is a table.*/
    default TSelf tbody() {
        return tag("tbody");
    }

    default TSelf _tbody() {
        return close("tbody");
    }
/** The thead element represents the block of rows that consist of the column labels (headers) for the parent table element, if the thead element has a parent and it is a table.*/
    default TSelf thead() {
        return tag("thead");
    }

    default TSelf _thead() {
        return close("thead");
    }
/** The tfoot element represents the block of rows that consist of the column summaries (footers) for the parent table element, if the tfoot element has a parent and it is a table.*/
    default TSelf tfoot() {
        return tag("tfoot");
    }

    default TSelf _tfoot() {
        return close("tfoot");
    }
/** The tr element represents a row of cells in a table.*/
    default TSelf tr() {
        return tag("tr");
    }

    default TSelf _tr() {
        return close("tr");
    }
/** The td element represents a data cell in a table.*/
    default TSelf td() {
        return tag("td");
    }

    default TSelf _td() {
        return close("td");
    }
/** The th element represents a header cell in a table.*/
    default TSelf th() {
        return tag("th");
    }

    default TSelf _th() {
        return close("th");
    }
/** The form element represents a collection of form-associated elements, some of which can represent editable values that can be submitted to a server for processing.*/
    default TSelf form() {
        return tag("form");
    }

    default TSelf _form() {
        return close("form");
    }
/** The label element represents a caption in a user interface. The caption can be associated with a specific form control, known as the label element's labeled control, either using the for attribute, or by putting the form control inside the label element itself.*/
    default TSelf label() {
        return tag("label");
    }

    default TSelf _label() {
        return close("label");
    }
/** No End Tag Allowed! <br>The input element represents a typed data field, usually with a form control to allow the user to edit the data.*/
    default TSelf input() {
        return tagWithoutEndTag("input");
    }
/** The button element represents a button labeled by its contents.*/
    default TSelf button() {
        return tag("button");
    }

    default TSelf _button() {
        return close("button");
    }
/** The select element represents a control for selecting amongst a set of options.*/
    default TSelf select() {
        return tag("select");
    }

    default TSelf _select() {
        return close("select");
    }
/** The datalist element represents a set of option elements that represent predefined options for other controls. In the rendering, the datalist element represents nothing and it, along with its children, should be hidden.*/
    default TSelf datalist() {
        return tag("datalist");
    }

    default TSelf _datalist() {
        return close("datalist");
    }
/** The optgroup element represents a group of option elements with a common label.*/
    default TSelf optgroup() {
        return tag("optgroup");
    }

    default TSelf _optgroup() {
        return close("optgroup");
    }
/** The option element represents an option in a select element or as part of a list of suggestions in a datalist element.*/
    default TSelf option() {
        return tag("option");
    }

    default TSelf _option() {
        return close("option");
    }
/** The textarea element represents a multiline plain text edit control for the element's raw value. The contents of the control represent the control's default value.*/
    default TSelf textarea() {
        return tag("textarea");
    }

    default TSelf _textarea() {
        return close("textarea");
    }
/** No End Tag Allowed! <br>The keygen element represents a key pair generator control. When the control's form is submitted, the private key is stored in the local keystore, and the public key is packaged and sent to the server.*/
    default TSelf keygen() {
        return tagWithoutEndTag("keygen");
    }
/** The output element represents the result of a calculation performed by the application, or the result of a user action.*/
    default TSelf output() {
        return tag("output");
    }

    default TSelf _output() {
        return close("output");
    }
/** The progress element represents the completion progress of a task. The progress is either indeterminate, indicating that progress is being made but that it is not clear how much more work remains to be done before the task is complete (e.g. because the task is waiting for a remote host to respond), or the progress is a number in the range zero to a maximum, giving the fraction of work that has so far been completed.*/
    default TSelf progress() {
        return tag("progress");
    }

    default TSelf _progress() {
        return close("progress");
    }
/** The meter element represents a scalar measurement within a known range, or a fractional value; for example disk usage, the relevance of a query result, or the fraction of a voting population to have selected a particular candidate.*/
    default TSelf meter() {
        return tag("meter");
    }

    default TSelf _meter() {
        return close("meter");
    }
/** The fieldset element represents a set of form controls optionally grouped under a common name.*/
    default TSelf fieldset() {
        return tag("fieldset");
    }

    default TSelf _fieldset() {
        return close("fieldset");
    }
/** The legend element represents a caption for the rest of the contents of the legend element's parent fieldset element, if any.*/
    default TSelf legend() {
        return tag("legend");
    }

    default TSelf _legend() {
        return close("legend");
    }
/** The details element represents a disclosure widget from which the user can obtain additional information or controls.*/
    default TSelf details() {
        return tag("details");
    }

    default TSelf _details() {
        return close("details");
    }
/** The summary element represents a summary, caption, or legend for the rest of the contents of the summary element's parent details element, if any.*/
    default TSelf summary() {
        return tag("summary");
    }

    default TSelf _summary() {
        return close("summary");
    }
/** The menu element represents a list of commands.*/
    default TSelf menu() {
        return tag("menu");
    }

    default TSelf _menu() {
        return close("menu");
    }
/** No End Tag Allowed! <br>The menuitem element represents a command that the user can invoke from a popup menu (either a context menu or the menu of a menu button).*/
    default TSelf menuitem() {
        return tagWithoutEndTag("menuitem");
    }
/** The dialog element represents a part of an application that a user interacts with to perform a task, for example a dialog box, inspector, or window.*/
    default TSelf dialog() {
        return tag("dialog");
    }

    default TSelf _dialog() {
        return close("dialog");
    }
/** The script element allows authors to include dynamic script and data blocks in their documents. The element does not represent content for the user.*/
    default TSelf script() {
        return tag("script");
    }

    default TSelf _script() {
        return close("script");
    }
/** The noscript element represents nothing if scripting is enabled, and represents its children if scripting is disabled. It is used to present different markup to user agents that support scripting and those that don't support scripting, by affecting how the document is parsed.*/
    default TSelf noscript() {
        return tag("noscript");
    }

    default TSelf _noscript() {
        return close("noscript");
    }
/** The template element is used to declare fragments of HTML that can be cloned and inserted in the document by script.*/
    default TSelf template() {
        return tag("template");
    }

    default TSelf _template() {
        return close("template");
    }
/** The canvas element provides scripts with a resolution-dependent bitmap canvas, which can be used for rendering graphs, game graphics, art, or other visual images on the fly.*/
    default TSelf canvas() {
        return tag("canvas");
    }

    default TSelf _canvas() {
        return close("canvas");
    }
/** All HTML elements may have the accesskey content attribute set. The accesskey attribute's value is used by the user agent as a guide for creating a keyboard shortcut that activates or focuses the element.*/
    default TSelf ACCESSKEY(String ACCESSKEY) {
        return addAttribute("accesskey", ACCESSKEY);
    }
/** */
    default TSelf CONTENTEDITABLE(String CONTENTEDITABLE) {
        return addAttribute("contenteditable", CONTENTEDITABLE);
    }
/** */
    default TSelf CONTEXTMENU(String CONTEXTMENU) {
        return addAttribute("contextmenu", CONTEXTMENU);
    }
/** The dir attribute specifies the element's text directionality. The attribute is an enumerated attribute with the following keywords and states:*/
    default TSelf DIR(String DIR) {
        return addAttribute("dir", DIR);
    }
/** All HTML elements may have the draggable content attribute set. The draggable attribute is an enumerated attribute. It has three states. The first state is true and it has the keyword true. The second state is false and it has the keyword false. The third state is auto; it has no keywords but it is the missing value default.*/
    default TSelf DRAGGABLE(String DRAGGABLE) {
        return addAttribute("draggable", DRAGGABLE);
    }
/** All HTML elements may have the dropzone content attribute set. When specified, its value must be an unordered set of unique space-separated tokens that are ASCII case-insensitive. The allowed values are the following:*/
    default TSelf DROPZONE(String DROPZONE) {
        return addAttribute("dropzone", DROPZONE);
    }
/** All HTML elements may have the hidden content attribute set. The hidden attribute is a boolean attribute. When specified on an element, it indicates that the element is not yet, or is no longer, directly relevant to the page's current state, or that it is being used to declare content to be reused by other parts of the page as opposed to being directly accessed by the user. User agents should not render elements that have the hidden attribute specified. This requirement may be implemented indirectly through the style layer. For example, an HTML+CSS user agent could implement these requirements using the rules suggested in the Rendering section.*/
    default TSelf HIDDEN(String HIDDEN) {
        return addAttribute("hidden", HIDDEN);
    }
/** The id attribute specifies its element's unique identifier (ID). [DOM]*/
    default TSelf ID(String ID) {
        return addAttribute("id", ID);
    }
/** */
    default TSelf ITEMID(String ITEMID) {
        return addAttribute("itemid", ITEMID);
    }
/** */
    default TSelf ITEMPROP(String ITEMPROP) {
        return addAttribute("itemprop", ITEMPROP);
    }
/** */
    default TSelf ITEMREF(String ITEMREF) {
        return addAttribute("itemref", ITEMREF);
    }
/** */
    default TSelf ITEMSCOPE(String ITEMSCOPE) {
        return addAttribute("itemscope", ITEMSCOPE);
    }
/** */
    default TSelf ITEMTYPE(String ITEMTYPE) {
        return addAttribute("itemtype", ITEMTYPE);
    }
/** */
    default TSelf LANG(String LANG) {
        return addAttribute("lang", LANG);
    }
/** */
    default TSelf SPELLCHECK(String SPELLCHECK) {
        return addAttribute("spellcheck", SPELLCHECK);
    }
/** All HTML elements may have the style content attribute set. This is a CSS styling attribute as defined by the CSS Styling Attribute Syntax specification. [CSSATTR]*/
    default TSelf STYLE(String STYLE) {
        return addAttribute("style", STYLE);
    }
/** The tabindex content attribute allows authors to indicate that an element is supposed to be focusable, and whether it is supposed to be reachable using sequential focus navigation and, if so, what is to be the relative order of the element for the purposes of sequential focus navigation. The name "tab index" comes from the common use of the "tab" key to navigate through the focusable elements. The term "tabbing" refers to moving forward through the focusable elements that can be reached using sequential focus navigation.*/
    default TSelf TABINDEX(String TABINDEX) {
        return addAttribute("tabindex", TABINDEX);
    }
/** The title attribute represents advisory information for the element, such as would be appropriate for a tooltip. On a link, this could be the title or a description of the target resource; on an image, it could be the image credit or a description of the image; on a paragraph, it could be a footnote or commentary on the text; on a citation, it could be further information about the source; on interactive content, it could be a label for, or instructions for, use of the element; and so forth. The value is text.*/
    default TSelf TITLE(String TITLE) {
        return addAttribute("title", TITLE);
    }
/** The translate attribute is an enumerated attribute that is used to specify whether an element's attribute values and the values of its Text node children are to be translated when the page is localized, or whether to leave them unchanged.*/
    default TSelf TRANSLATE(String TRANSLATE) {
        return addAttribute("translate", TRANSLATE);
    }
/** */
    default TSelf ONABORT(String ONABORT) {
        return addAttribute("onabort", ONABORT);
    }
/** */
    default TSelf ONAUTOCOMPLETE(String ONAUTOCOMPLETE) {
        return addAttribute("onautocomplete", ONAUTOCOMPLETE);
    }
/** */
    default TSelf ONAUTOCOMPLETEERROR(String ONAUTOCOMPLETEERROR) {
        return addAttribute("onautocompleteerror", ONAUTOCOMPLETEERROR);
    }
/** */
    default TSelf ONBLUR(String ONBLUR) {
        return addAttribute("onblur", ONBLUR);
    }
/** */
    default TSelf ONCANCEL(String ONCANCEL) {
        return addAttribute("oncancel", ONCANCEL);
    }
/** */
    default TSelf ONCANPLAY(String ONCANPLAY) {
        return addAttribute("oncanplay", ONCANPLAY);
    }
/** */
    default TSelf ONCANPLAYTHROUGH(String ONCANPLAYTHROUGH) {
        return addAttribute("oncanplaythrough", ONCANPLAYTHROUGH);
    }
/** */
    default TSelf ONCHANGE(String ONCHANGE) {
        return addAttribute("onchange", ONCHANGE);
    }
/** */
    default TSelf ONCLICK(String ONCLICK) {
        return addAttribute("onclick", ONCLICK);
    }
/** */
    default TSelf ONCLOSE(String ONCLOSE) {
        return addAttribute("onclose", ONCLOSE);
    }
/** */
    default TSelf ONCONTEXTMENU(String ONCONTEXTMENU) {
        return addAttribute("oncontextmenu", ONCONTEXTMENU);
    }
/** */
    default TSelf ONCUECHANGE(String ONCUECHANGE) {
        return addAttribute("oncuechange", ONCUECHANGE);
    }
/** */
    default TSelf ONDBLCLICK(String ONDBLCLICK) {
        return addAttribute("ondblclick", ONDBLCLICK);
    }
/** */
    default TSelf ONDRAG(String ONDRAG) {
        return addAttribute("ondrag", ONDRAG);
    }
/** */
    default TSelf ONDRAGEND(String ONDRAGEND) {
        return addAttribute("ondragend", ONDRAGEND);
    }
/** */
    default TSelf ONDRAGENTER(String ONDRAGENTER) {
        return addAttribute("ondragenter", ONDRAGENTER);
    }
/** */
    default TSelf ONDRAGEXIT(String ONDRAGEXIT) {
        return addAttribute("ondragexit", ONDRAGEXIT);
    }
/** */
    default TSelf ONDRAGLEAVE(String ONDRAGLEAVE) {
        return addAttribute("ondragleave", ONDRAGLEAVE);
    }
/** */
    default TSelf ONDRAGOVER(String ONDRAGOVER) {
        return addAttribute("ondragover", ONDRAGOVER);
    }
/** */
    default TSelf ONDRAGSTART(String ONDRAGSTART) {
        return addAttribute("ondragstart", ONDRAGSTART);
    }
/** */
    default TSelf ONDROP(String ONDROP) {
        return addAttribute("ondrop", ONDROP);
    }
/** */
    default TSelf ONDURATIONCHANGE(String ONDURATIONCHANGE) {
        return addAttribute("ondurationchange", ONDURATIONCHANGE);
    }
/** */
    default TSelf ONEMPTIED(String ONEMPTIED) {
        return addAttribute("onemptied", ONEMPTIED);
    }
/** */
    default TSelf ONENDED(String ONENDED) {
        return addAttribute("onended", ONENDED);
    }
/** */
    default TSelf ONERROR(String ONERROR) {
        return addAttribute("onerror", ONERROR);
    }
/** */
    default TSelf ONFOCUS(String ONFOCUS) {
        return addAttribute("onfocus", ONFOCUS);
    }
/** */
    default TSelf ONINPUT(String ONINPUT) {
        return addAttribute("oninput", ONINPUT);
    }
/** */
    default TSelf ONINVALID(String ONINVALID) {
        return addAttribute("oninvalid", ONINVALID);
    }
/** */
    default TSelf ONKEYDOWN(String ONKEYDOWN) {
        return addAttribute("onkeydown", ONKEYDOWN);
    }
/** */
    default TSelf ONKEYPRESS(String ONKEYPRESS) {
        return addAttribute("onkeypress", ONKEYPRESS);
    }
/** */
    default TSelf ONKEYUP(String ONKEYUP) {
        return addAttribute("onkeyup", ONKEYUP);
    }
/** */
    default TSelf ONLOAD(String ONLOAD) {
        return addAttribute("onload", ONLOAD);
    }
/** */
    default TSelf ONLOADEDDATA(String ONLOADEDDATA) {
        return addAttribute("onloadeddata", ONLOADEDDATA);
    }
/** */
    default TSelf ONLOADEDMETADATA(String ONLOADEDMETADATA) {
        return addAttribute("onloadedmetadata", ONLOADEDMETADATA);
    }
/** */
    default TSelf ONLOADSTART(String ONLOADSTART) {
        return addAttribute("onloadstart", ONLOADSTART);
    }
/** */
    default TSelf ONMOUSEDOWN(String ONMOUSEDOWN) {
        return addAttribute("onmousedown", ONMOUSEDOWN);
    }
/** */
    default TSelf ONMOUSEENTER(String ONMOUSEENTER) {
        return addAttribute("onmouseenter", ONMOUSEENTER);
    }
/** */
    default TSelf ONMOUSELEAVE(String ONMOUSELEAVE) {
        return addAttribute("onmouseleave", ONMOUSELEAVE);
    }
/** */
    default TSelf ONMOUSEMOVE(String ONMOUSEMOVE) {
        return addAttribute("onmousemove", ONMOUSEMOVE);
    }
/** */
    default TSelf ONMOUSEOUT(String ONMOUSEOUT) {
        return addAttribute("onmouseout", ONMOUSEOUT);
    }
/** */
    default TSelf ONMOUSEOVER(String ONMOUSEOVER) {
        return addAttribute("onmouseover", ONMOUSEOVER);
    }
/** */
    default TSelf ONMOUSEUP(String ONMOUSEUP) {
        return addAttribute("onmouseup", ONMOUSEUP);
    }
/** */
    default TSelf ONMOUSEWHEEL(String ONMOUSEWHEEL) {
        return addAttribute("onmousewheel", ONMOUSEWHEEL);
    }
/** */
    default TSelf ONPAUSE(String ONPAUSE) {
        return addAttribute("onpause", ONPAUSE);
    }
/** */
    default TSelf ONPLAY(String ONPLAY) {
        return addAttribute("onplay", ONPLAY);
    }
/** */
    default TSelf ONPLAYING(String ONPLAYING) {
        return addAttribute("onplaying", ONPLAYING);
    }
/** */
    default TSelf ONPROGRESS(String ONPROGRESS) {
        return addAttribute("onprogress", ONPROGRESS);
    }
/** */
    default TSelf ONRATECHANGE(String ONRATECHANGE) {
        return addAttribute("onratechange", ONRATECHANGE);
    }
/** */
    default TSelf ONRESET(String ONRESET) {
        return addAttribute("onreset", ONRESET);
    }
/** */
    default TSelf ONRESIZE(String ONRESIZE) {
        return addAttribute("onresize", ONRESIZE);
    }
/** */
    default TSelf ONSCROLL(String ONSCROLL) {
        return addAttribute("onscroll", ONSCROLL);
    }
/** */
    default TSelf ONSEEKED(String ONSEEKED) {
        return addAttribute("onseeked", ONSEEKED);
    }
/** */
    default TSelf ONSEEKING(String ONSEEKING) {
        return addAttribute("onseeking", ONSEEKING);
    }
/** */
    default TSelf ONSELECT(String ONSELECT) {
        return addAttribute("onselect", ONSELECT);
    }
/** */
    default TSelf ONSHOW(String ONSHOW) {
        return addAttribute("onshow", ONSHOW);
    }
/** */
    default TSelf ONSORT(String ONSORT) {
        return addAttribute("onsort", ONSORT);
    }
/** */
    default TSelf ONSTALLED(String ONSTALLED) {
        return addAttribute("onstalled", ONSTALLED);
    }
/** */
    default TSelf ONSUBMIT(String ONSUBMIT) {
        return addAttribute("onsubmit", ONSUBMIT);
    }
/** */
    default TSelf ONSUSPEND(String ONSUSPEND) {
        return addAttribute("onsuspend", ONSUSPEND);
    }
/** */
    default TSelf ONTIMEUPDATE(String ONTIMEUPDATE) {
        return addAttribute("ontimeupdate", ONTIMEUPDATE);
    }
/** */
    default TSelf ONTOGGLE(String ONTOGGLE) {
        return addAttribute("ontoggle", ONTOGGLE);
    }
/** */
    default TSelf ONVOLUMECHANGE(String ONVOLUMECHANGE) {
        return addAttribute("onvolumechange", ONVOLUMECHANGE);
    }
/** */
    default TSelf ONWAITING(String ONWAITING) {
        return addAttribute("onwaiting", ONWAITING);
    }
/**  Application cache manifest*/
    default TSelf MANIFEST(String MANIFEST) {
        return addAttribute("manifest", MANIFEST);
    }
/**  Document base URL*/
    default TSelf HREF(String HREF) {
        return addAttribute("href", HREF);
    }
/**  Default browsing context for hyperlink navigation and form submission*/
    default TSelf TARGET(String TARGET) {
        return addAttribute("target", TARGET);
    }
/**  How the element handles crossorigin requests*/
    default TSelf CROSSORIGIN(String CROSSORIGIN) {
        return addAttribute("crossorigin", CROSSORIGIN);
    }
/**  Relationship between the document containing the hyperlink and the destination resource*/
    default TSelf REL(String REL) {
        return addAttribute("rel", REL);
    }
/**  Applicable media*/
    default TSelf MEDIA(String MEDIA) {
        return addAttribute("media", MEDIA);
    }
/**  Language of the linked resource*/
    default TSelf HREFLANG(String HREFLANG) {
        return addAttribute("hreflang", HREFLANG);
    }
/**  Hint for the type of the referenced resource*/
    default TSelf TYPE(String TYPE) {
        return addAttribute("type", TYPE);
    }
/**  Sizes of the icons (for rel="icon")*/
    default TSelf SIZES(String SIZES) {
        return addAttribute("sizes", SIZES);
    }
/**  Metadata name*/
    default TSelf NAME(String NAME) {
        return addAttribute("name", NAME);
    }
/**  Pragma directive*/
    default TSelf HTTP_EQUIV(String HTTP_EQUIV) {
        return addAttribute("http-equiv", HTTP_EQUIV);
    }
/**  Value of the element*/
    default TSelf CONTENT(String CONTENT) {
        return addAttribute("content", CONTENT);
    }
/**  Character encoding declaration*/
    default TSelf CHARSET(String CHARSET) {
        return addAttribute("charset", CHARSET);
    }
/**  Whether the styles apply to the entire document or just the parent subtree*/
    default TSelf SCOPED(String SCOPED) {
        return addAttribute("scoped", SCOPED);
    }
/** */
    default TSelf ONAFTERPRINT(String ONAFTERPRINT) {
        return addAttribute("onafterprint", ONAFTERPRINT);
    }
/** */
    default TSelf ONBEFOREPRINT(String ONBEFOREPRINT) {
        return addAttribute("onbeforeprint", ONBEFOREPRINT);
    }
/** */
    default TSelf ONBEFOREUNLOAD(String ONBEFOREUNLOAD) {
        return addAttribute("onbeforeunload", ONBEFOREUNLOAD);
    }
/** */
    default TSelf ONHASHCHANGE(String ONHASHCHANGE) {
        return addAttribute("onhashchange", ONHASHCHANGE);
    }
/** */
    default TSelf ONLANGUAGECHANGE(String ONLANGUAGECHANGE) {
        return addAttribute("onlanguagechange", ONLANGUAGECHANGE);
    }
/** */
    default TSelf ONMESSAGE(String ONMESSAGE) {
        return addAttribute("onmessage", ONMESSAGE);
    }
/** */
    default TSelf ONOFFLINE(String ONOFFLINE) {
        return addAttribute("onoffline", ONOFFLINE);
    }
/** */
    default TSelf ONONLINE(String ONONLINE) {
        return addAttribute("ononline", ONONLINE);
    }
/** */
    default TSelf ONPAGEHIDE(String ONPAGEHIDE) {
        return addAttribute("onpagehide", ONPAGEHIDE);
    }
/** */
    default TSelf ONPAGESHOW(String ONPAGESHOW) {
        return addAttribute("onpageshow", ONPAGESHOW);
    }
/** */
    default TSelf ONPOPSTATE(String ONPOPSTATE) {
        return addAttribute("onpopstate", ONPOPSTATE);
    }
/** */
    default TSelf ONSTORAGE(String ONSTORAGE) {
        return addAttribute("onstorage", ONSTORAGE);
    }
/** */
    default TSelf ONUNLOAD(String ONUNLOAD) {
        return addAttribute("onunload", ONUNLOAD);
    }
/**  Link to the source of the quotation or more information about the edit*/
    default TSelf CITE(String CITE) {
        return addAttribute("cite", CITE);
    }
/**  Number the list backwards*/
    default TSelf REVERSED(String REVERSED) {
        return addAttribute("reversed", REVERSED);
    }
/**  Ordinal value of the first item*/
    default TSelf START(String START) {
        return addAttribute("start", START);
    }
/**  Ordinal value of the list item*/
    default TSelf VALUE(String VALUE) {
        return addAttribute("value", VALUE);
    }
/**  Whether to download the resource instead of navigating to it, and its file name if so*/
    default TSelf DOWNLOAD(String DOWNLOAD) {
        return addAttribute("download", DOWNLOAD);
    }
/**  URLs to ping*/
    default TSelf PING(String PING) {
        return addAttribute("ping", PING);
    }
/**  Machine-readable value*/
    default TSelf DATETIME(String DATETIME) {
        return addAttribute("datetime", DATETIME);
    }
/** */
    default TSelf SRCSET(String SRCSET) {
        return addAttribute("srcset", SRCSET);
    }
/**  Replacement text for use when images are not available*/
    default TSelf ALT(String ALT) {
        return addAttribute("alt", ALT);
    }
/**  Address of the resource*/
    default TSelf SRC(String SRC) {
        return addAttribute("src", SRC);
    }
/**  Name of image map to use*/
    default TSelf USEMAP(String USEMAP) {
        return addAttribute("usemap", USEMAP);
    }
/**  Whether the image is a server-side image map*/
    default TSelf ISMAP(String ISMAP) {
        return addAttribute("ismap", ISMAP);
    }
/**  Horizontal dimension*/
    default TSelf WIDTH(String WIDTH) {
        return addAttribute("width", WIDTH);
    }
/**  Vertical dimension*/
    default TSelf HEIGHT(String HEIGHT) {
        return addAttribute("height", HEIGHT);
    }
/**  A document to render in the iframe*/
    default TSelf SRCDOC(String SRCDOC) {
        return addAttribute("srcdoc", SRCDOC);
    }
/**  Security rules for nested content*/
    default TSelf SANDBOX(String SANDBOX) {
        return addAttribute("sandbox", SANDBOX);
    }
/**  Whether to apply the document's styles to the nested content*/
    default TSelf SEAMLESS(String SEAMLESS) {
        return addAttribute("seamless", SEAMLESS);
    }
/**  Whether to allow the iframe's contents to use requestFullscreen()*/
    default TSelf ALLOWFULLSCREEN(String ALLOWFULLSCREEN) {
        return addAttribute("allowfullscreen", ALLOWFULLSCREEN);
    }
/**  Address of the resource*/
    default TSelf DATA(String DATA) {
        return addAttribute("data", DATA);
    }
/**  Whether the type attribute and the Content-Type value need to match for the resource to be used*/
    default TSelf TYPEMUSTMATCH(String TYPEMUSTMATCH) {
        return addAttribute("typemustmatch", TYPEMUSTMATCH);
    }
/**  Associates the control with a form element*/
    default TSelf FORM(String FORM) {
        return addAttribute("form", FORM);
    }
/**  Poster frame to show prior to video playback*/
    default TSelf POSTER(String POSTER) {
        return addAttribute("poster", POSTER);
    }
/**  Hints how much buffering the media resource will likely need*/
    default TSelf PRELOAD(String PRELOAD) {
        return addAttribute("preload", PRELOAD);
    }
/**  Hint that the media resource can be started automatically when the page is loaded*/
    default TSelf AUTOPLAY(String AUTOPLAY) {
        return addAttribute("autoplay", AUTOPLAY);
    }
/**  Groups media elements together with an implicit MediaController*/
    default TSelf MEDIAGROUP(String MEDIAGROUP) {
        return addAttribute("mediagroup", MEDIAGROUP);
    }
/**  Whether to loop the media resource*/
    default TSelf LOOP(String LOOP) {
        return addAttribute("loop", LOOP);
    }
/**  Whether to mute the media resource by default*/
    default TSelf MUTED(String MUTED) {
        return addAttribute("muted", MUTED);
    }
/**  Show user agent controls*/
    default TSelf CONTROLS(String CONTROLS) {
        return addAttribute("controls", CONTROLS);
    }
/**  The type of text track*/
    default TSelf KIND(String KIND) {
        return addAttribute("kind", KIND);
    }
/**  Language of the text track*/
    default TSelf SRCLANG(String SRCLANG) {
        return addAttribute("srclang", SRCLANG);
    }
/**  User-visible label*/
    default TSelf LABEL(String LABEL) {
        return addAttribute("label", LABEL);
    }
/**  Enable the track if no other text track is more suitable*/
    default TSelf DEFAULT(String DEFAULT) {
        return addAttribute("default", DEFAULT);
    }
/**  Coordinates for the shape to be created in an image map*/
    default TSelf COORDS(String COORDS) {
        return addAttribute("coords", COORDS);
    }
/**  The kind of shape to be created in an image map*/
    default TSelf SHAPE(String SHAPE) {
        return addAttribute("shape", SHAPE);
    }
/**  Enables a sorting interface for the table*/
    default TSelf SORTABLE(String SORTABLE) {
        return addAttribute("sortable", SORTABLE);
    }
/**  Number of columns spanned by the element*/
    default TSelf SPAN(String SPAN) {
        return addAttribute("span", SPAN);
    }
/**  Number of columns that the cell is to span*/
    default TSelf COLSPAN(String COLSPAN) {
        return addAttribute("colspan", COLSPAN);
    }
/**  Number of rows that the cell is to span*/
    default TSelf ROWSPAN(String ROWSPAN) {
        return addAttribute("rowspan", ROWSPAN);
    }
/**  The header cells for this cell*/
    default TSelf HEADERS(String HEADERS) {
        return addAttribute("headers", HEADERS);
    }
/**  Specifies which cells the header cell applies to*/
    default TSelf SCOPE(String SCOPE) {
        return addAttribute("scope", SCOPE);
    }
/**  Alternative label to use for the header cell when referencing the cell in other contexts*/
    default TSelf ABBR(String ABBR) {
        return addAttribute("abbr", ABBR);
    }
/**  Column sort direction and ordinality*/
    default TSelf SORTED(String SORTED) {
        return addAttribute("sorted", SORTED);
    }
/**  Character encodings to use for form submission*/
    default TSelf ACCEPT_CHARSET(String ACCEPT_CHARSET) {
        return addAttribute("accept-charset", ACCEPT_CHARSET);
    }
/**  URL to use for form submission*/
    default TSelf ACTION(String ACTION) {
        return addAttribute("action", ACTION);
    }
/**  Default setting for autofill feature for controls in the form*/
    default TSelf AUTOCOMPLETE(String AUTOCOMPLETE) {
        return addAttribute("autocomplete", AUTOCOMPLETE);
    }
/**  Form data set encoding type to use for form submission*/
    default TSelf ENCTYPE(String ENCTYPE) {
        return addAttribute("enctype", ENCTYPE);
    }
/**  HTTP method to use for form submission*/
    default TSelf METHOD(String METHOD) {
        return addAttribute("method", METHOD);
    }
/**  Bypass form control validation for form submission*/
    default TSelf NOVALIDATE(String NOVALIDATE) {
        return addAttribute("novalidate", NOVALIDATE);
    }
/**  Associate the label with form control*/
    default TSelf FOR(String FOR) {
        return addAttribute("for", FOR);
    }
/**  Hint for expected file type in file upload controls*/
    default TSelf ACCEPT(String ACCEPT) {
        return addAttribute("accept", ACCEPT);
    }
/**  Automatically focus the form control when the page is loaded*/
    default TSelf AUTOFOCUS(String AUTOFOCUS) {
        return addAttribute("autofocus", AUTOFOCUS);
    }
/**  Whether the command or control is checked*/
    default TSelf CHECKED(String CHECKED) {
        return addAttribute("checked", CHECKED);
    }
/**  Name of form field to use for sending the element's directionality in form submission*/
    default TSelf DIRNAME(String DIRNAME) {
        return addAttribute("dirname", DIRNAME);
    }
/**  Whether the form control is disabled*/
    default TSelf DISABLED(String DISABLED) {
        return addAttribute("disabled", DISABLED);
    }
/**  URL to use for form submission*/
    default TSelf FORMACTION(String FORMACTION) {
        return addAttribute("formaction", FORMACTION);
    }
/**  Form data set encoding type to use for form submission*/
    default TSelf FORMENCTYPE(String FORMENCTYPE) {
        return addAttribute("formenctype", FORMENCTYPE);
    }
/**  HTTP method to use for form submission*/
    default TSelf FORMMETHOD(String FORMMETHOD) {
        return addAttribute("formmethod", FORMMETHOD);
    }
/**  Bypass form control validation for form submission*/
    default TSelf FORMNOVALIDATE(String FORMNOVALIDATE) {
        return addAttribute("formnovalidate", FORMNOVALIDATE);
    }
/**  Browsing context for form submission*/
    default TSelf FORMTARGET(String FORMTARGET) {
        return addAttribute("formtarget", FORMTARGET);
    }
/**  Hint for selecting an input modality*/
    default TSelf INPUTMODE(String INPUTMODE) {
        return addAttribute("inputmode", INPUTMODE);
    }
/**  List of autocomplete options*/
    default TSelf LIST(String LIST) {
        return addAttribute("list", LIST);
    }
/**  Maximum value*/
    default TSelf MAX(String MAX) {
        return addAttribute("max", MAX);
    }
/**  Maximum length of value*/
    default TSelf MAXLENGTH(String MAXLENGTH) {
        return addAttribute("maxlength", MAXLENGTH);
    }
/**  Minimum value*/
    default TSelf MIN(String MIN) {
        return addAttribute("min", MIN);
    }
/**  Minimum length of value*/
    default TSelf MINLENGTH(String MINLENGTH) {
        return addAttribute("minlength", MINLENGTH);
    }
/**  Whether to allow multiple values*/
    default TSelf MULTIPLE(String MULTIPLE) {
        return addAttribute("multiple", MULTIPLE);
    }
/**  Pattern to be matched by the form control's value*/
    default TSelf PATTERN(String PATTERN) {
        return addAttribute("pattern", PATTERN);
    }
/**  User-visible label to be placed within the form control*/
    default TSelf PLACEHOLDER(String PLACEHOLDER) {
        return addAttribute("placeholder", PLACEHOLDER);
    }
/**  Whether to allow the value to be edited by the user*/
    default TSelf READONLY(String READONLY) {
        return addAttribute("readonly", READONLY);
    }
/**  Whether the control is required for form submission*/
    default TSelf REQUIRED(String REQUIRED) {
        return addAttribute("required", REQUIRED);
    }
/**  Size of the control*/
    default TSelf SIZE(String SIZE) {
        return addAttribute("size", SIZE);
    }
/**  Granularity to be matched by the form control's value*/
    default TSelf STEP(String STEP) {
        return addAttribute("step", STEP);
    }
/**  Specifies the element's designated pop-up menu*/
    default TSelf MENU(String MENU) {
        return addAttribute("menu", MENU);
    }
/**  Whether the option is selected by default*/
    default TSelf SELECTED(String SELECTED) {
        return addAttribute("selected", SELECTED);
    }
/**  Maximum number of characters per line*/
    default TSelf COLS(String COLS) {
        return addAttribute("cols", COLS);
    }
/**  Number of lines to show*/
    default TSelf ROWS(String ROWS) {
        return addAttribute("rows", ROWS);
    }
/**  How the value of the form control is to be wrapped for form submission*/
    default TSelf WRAP(String WRAP) {
        return addAttribute("wrap", WRAP);
    }
/**  String to package with the generated and signed public key*/
    default TSelf CHALLENGE(String CHALLENGE) {
        return addAttribute("challenge", CHALLENGE);
    }
/**  The type of cryptographic key to generate*/
    default TSelf KEYTYPE(String KEYTYPE) {
        return addAttribute("keytype", KEYTYPE);
    }
/**  High limit of low range*/
    default TSelf LOW(String LOW) {
        return addAttribute("low", LOW);
    }
/**  Low limit of high range*/
    default TSelf HIGH(String HIGH) {
        return addAttribute("high", HIGH);
    }
/**  Optimum value in gauge*/
    default TSelf OPTIMUM(String OPTIMUM) {
        return addAttribute("optimum", OPTIMUM);
    }
/**  Whether the details are visible*/
    default TSelf OPEN(String OPEN) {
        return addAttribute("open", OPEN);
    }
/**  Icon for the command*/
    default TSelf ICON(String ICON) {
        return addAttribute("icon", ICON);
    }
/**  Name of group of commands to treat as a radio button group*/
    default TSelf RADIOGROUP(String RADIOGROUP) {
        return addAttribute("radiogroup", RADIOGROUP);
    }
/**  Command definition*/
    default TSelf COMMAND(String COMMAND) {
        return addAttribute("command", COMMAND);
    }
/**  Execute script when available, without blocking*/
    default TSelf ASYNC(String ASYNC) {
        return addAttribute("async", ASYNC);
    }
/**  Defer script execution*/
    default TSelf DEFER(String DEFER) {
        return addAttribute("defer", DEFER);
    }
}
