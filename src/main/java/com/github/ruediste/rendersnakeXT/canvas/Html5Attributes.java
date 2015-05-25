package com.github.ruediste.rendersnakeXT.canvas;
public interface Html5Attributes<TAttr> extends HtmlAttributes<TAttr> {
/** All HTML elements may have the accesskey content attribute set. The accesskey attribute's value is used by the user agent as a guide for creating a keyboard shortcut that activates or focuses the element.*/
    default TAttr accesskey(String accesskey) {
        return add("accesskey", accesskey);
    }
/** */
    default TAttr contenteditable(String contenteditable) {
        return add("contenteditable", contenteditable);
    }
/** */
    default TAttr contextmenu(String contextmenu) {
        return add("contextmenu", contextmenu);
    }
/** The dir attribute specifies the element's text directionality. The attribute is an enumerated attribute with the following keywords and states:*/
    default TAttr dir(String dir) {
        return add("dir", dir);
    }
/** All HTML elements may have the draggable content attribute set. The draggable attribute is an enumerated attribute. It has three states. The first state is true and it has the keyword true. The second state is false and it has the keyword false. The third state is auto; it has no keywords but it is the missing value default.*/
    default TAttr draggable(String draggable) {
        return add("draggable", draggable);
    }
/** All HTML elements may have the dropzone content attribute set. When specified, its value must be an unordered set of unique space-separated tokens that are ASCII case-insensitive. The allowed values are the following:*/
    default TAttr dropzone(String dropzone) {
        return add("dropzone", dropzone);
    }
/** All HTML elements may have the hidden content attribute set. The hidden attribute is a boolean attribute. When specified on an element, it indicates that the element is not yet, or is no longer, directly relevant to the page's current state, or that it is being used to declare content to be reused by other parts of the page as opposed to being directly accessed by the user. User agents should not render elements that have the hidden attribute specified. This requirement may be implemented indirectly through the style layer. For example, an HTML+CSS user agent could implement these requirements using the rules suggested in the Rendering section.*/
    default TAttr hidden(String hidden) {
        return add("hidden", hidden);
    }
/** The id attribute specifies its element's unique identifier (ID). [DOM]*/
    default TAttr id(String id) {
        return add("id", id);
    }
/** */
    default TAttr itemid(String itemid) {
        return add("itemid", itemid);
    }
/** */
    default TAttr itemprop(String itemprop) {
        return add("itemprop", itemprop);
    }
/** */
    default TAttr itemref(String itemref) {
        return add("itemref", itemref);
    }
/** */
    default TAttr itemscope(String itemscope) {
        return add("itemscope", itemscope);
    }
/** */
    default TAttr itemtype(String itemtype) {
        return add("itemtype", itemtype);
    }
/** */
    default TAttr lang(String lang) {
        return add("lang", lang);
    }
/** */
    default TAttr spellcheck(String spellcheck) {
        return add("spellcheck", spellcheck);
    }
/** All HTML elements may have the style content attribute set. This is a CSS styling attribute as defined by the CSS Styling Attribute Syntax specification. [CSSATTR]*/
    default TAttr style(String style) {
        return add("style", style);
    }
/** The tabindex content attribute allows authors to indicate that an element is supposed to be focusable, and whether it is supposed to be reachable using sequential focus navigation and, if so, what is to be the relative order of the element for the purposes of sequential focus navigation. The name "tab index" comes from the common use of the "tab" key to navigate through the focusable elements. The term "tabbing" refers to moving forward through the focusable elements that can be reached using sequential focus navigation.*/
    default TAttr tabindex(String tabindex) {
        return add("tabindex", tabindex);
    }
/** The title attribute represents advisory information for the element, such as would be appropriate for a tooltip. On a link, this could be the title or a description of the target resource; on an image, it could be the image credit or a description of the image; on a paragraph, it could be a footnote or commentary on the text; on a citation, it could be further information about the source; on interactive content, it could be a label for, or instructions for, use of the element; and so forth. The value is text.*/
    default TAttr title(String title) {
        return add("title", title);
    }
/** The translate attribute is an enumerated attribute that is used to specify whether an element's attribute values and the values of its Text node children are to be translated when the page is localized, or whether to leave them unchanged.*/
    default TAttr translate(String translate) {
        return add("translate", translate);
    }
/** */
    default TAttr onabort(String onabort) {
        return add("onabort", onabort);
    }
/** */
    default TAttr onautocomplete(String onautocomplete) {
        return add("onautocomplete", onautocomplete);
    }
/** */
    default TAttr onautocompleteerror(String onautocompleteerror) {
        return add("onautocompleteerror", onautocompleteerror);
    }
/** */
    default TAttr onblur(String onblur) {
        return add("onblur", onblur);
    }
/** */
    default TAttr oncancel(String oncancel) {
        return add("oncancel", oncancel);
    }
/** */
    default TAttr oncanplay(String oncanplay) {
        return add("oncanplay", oncanplay);
    }
/** */
    default TAttr oncanplaythrough(String oncanplaythrough) {
        return add("oncanplaythrough", oncanplaythrough);
    }
/** */
    default TAttr onchange(String onchange) {
        return add("onchange", onchange);
    }
/** */
    default TAttr onclick(String onclick) {
        return add("onclick", onclick);
    }
/** */
    default TAttr onclose(String onclose) {
        return add("onclose", onclose);
    }
/** */
    default TAttr oncontextmenu(String oncontextmenu) {
        return add("oncontextmenu", oncontextmenu);
    }
/** */
    default TAttr oncuechange(String oncuechange) {
        return add("oncuechange", oncuechange);
    }
/** */
    default TAttr ondblclick(String ondblclick) {
        return add("ondblclick", ondblclick);
    }
/** */
    default TAttr ondrag(String ondrag) {
        return add("ondrag", ondrag);
    }
/** */
    default TAttr ondragend(String ondragend) {
        return add("ondragend", ondragend);
    }
/** */
    default TAttr ondragenter(String ondragenter) {
        return add("ondragenter", ondragenter);
    }
/** */
    default TAttr ondragexit(String ondragexit) {
        return add("ondragexit", ondragexit);
    }
/** */
    default TAttr ondragleave(String ondragleave) {
        return add("ondragleave", ondragleave);
    }
/** */
    default TAttr ondragover(String ondragover) {
        return add("ondragover", ondragover);
    }
/** */
    default TAttr ondragstart(String ondragstart) {
        return add("ondragstart", ondragstart);
    }
/** */
    default TAttr ondrop(String ondrop) {
        return add("ondrop", ondrop);
    }
/** */
    default TAttr ondurationchange(String ondurationchange) {
        return add("ondurationchange", ondurationchange);
    }
/** */
    default TAttr onemptied(String onemptied) {
        return add("onemptied", onemptied);
    }
/** */
    default TAttr onended(String onended) {
        return add("onended", onended);
    }
/** */
    default TAttr onerror(String onerror) {
        return add("onerror", onerror);
    }
/** */
    default TAttr onfocus(String onfocus) {
        return add("onfocus", onfocus);
    }
/** */
    default TAttr oninput(String oninput) {
        return add("oninput", oninput);
    }
/** */
    default TAttr oninvalid(String oninvalid) {
        return add("oninvalid", oninvalid);
    }
/** */
    default TAttr onkeydown(String onkeydown) {
        return add("onkeydown", onkeydown);
    }
/** */
    default TAttr onkeypress(String onkeypress) {
        return add("onkeypress", onkeypress);
    }
/** */
    default TAttr onkeyup(String onkeyup) {
        return add("onkeyup", onkeyup);
    }
/** */
    default TAttr onload(String onload) {
        return add("onload", onload);
    }
/** */
    default TAttr onloadeddata(String onloadeddata) {
        return add("onloadeddata", onloadeddata);
    }
/** */
    default TAttr onloadedmetadata(String onloadedmetadata) {
        return add("onloadedmetadata", onloadedmetadata);
    }
/** */
    default TAttr onloadstart(String onloadstart) {
        return add("onloadstart", onloadstart);
    }
/** */
    default TAttr onmousedown(String onmousedown) {
        return add("onmousedown", onmousedown);
    }
/** */
    default TAttr onmouseenter(String onmouseenter) {
        return add("onmouseenter", onmouseenter);
    }
/** */
    default TAttr onmouseleave(String onmouseleave) {
        return add("onmouseleave", onmouseleave);
    }
/** */
    default TAttr onmousemove(String onmousemove) {
        return add("onmousemove", onmousemove);
    }
/** */
    default TAttr onmouseout(String onmouseout) {
        return add("onmouseout", onmouseout);
    }
/** */
    default TAttr onmouseover(String onmouseover) {
        return add("onmouseover", onmouseover);
    }
/** */
    default TAttr onmouseup(String onmouseup) {
        return add("onmouseup", onmouseup);
    }
/** */
    default TAttr onmousewheel(String onmousewheel) {
        return add("onmousewheel", onmousewheel);
    }
/** */
    default TAttr onpause(String onpause) {
        return add("onpause", onpause);
    }
/** */
    default TAttr onplay(String onplay) {
        return add("onplay", onplay);
    }
/** */
    default TAttr onplaying(String onplaying) {
        return add("onplaying", onplaying);
    }
/** */
    default TAttr onprogress(String onprogress) {
        return add("onprogress", onprogress);
    }
/** */
    default TAttr onratechange(String onratechange) {
        return add("onratechange", onratechange);
    }
/** */
    default TAttr onreset(String onreset) {
        return add("onreset", onreset);
    }
/** */
    default TAttr onresize(String onresize) {
        return add("onresize", onresize);
    }
/** */
    default TAttr onscroll(String onscroll) {
        return add("onscroll", onscroll);
    }
/** */
    default TAttr onseeked(String onseeked) {
        return add("onseeked", onseeked);
    }
/** */
    default TAttr onseeking(String onseeking) {
        return add("onseeking", onseeking);
    }
/** */
    default TAttr onselect(String onselect) {
        return add("onselect", onselect);
    }
/** */
    default TAttr onshow(String onshow) {
        return add("onshow", onshow);
    }
/** */
    default TAttr onsort(String onsort) {
        return add("onsort", onsort);
    }
/** */
    default TAttr onstalled(String onstalled) {
        return add("onstalled", onstalled);
    }
/** */
    default TAttr onsubmit(String onsubmit) {
        return add("onsubmit", onsubmit);
    }
/** */
    default TAttr onsuspend(String onsuspend) {
        return add("onsuspend", onsuspend);
    }
/** */
    default TAttr ontimeupdate(String ontimeupdate) {
        return add("ontimeupdate", ontimeupdate);
    }
/** */
    default TAttr ontoggle(String ontoggle) {
        return add("ontoggle", ontoggle);
    }
/** */
    default TAttr onvolumechange(String onvolumechange) {
        return add("onvolumechange", onvolumechange);
    }
/** */
    default TAttr onwaiting(String onwaiting) {
        return add("onwaiting", onwaiting);
    }
/**  Application cache manifest*/
    default TAttr manifest(String manifest) {
        return add("manifest", manifest);
    }
/**  Document base URL*/
    default TAttr href(String href) {
        return add("href", href);
    }
/**  Default browsing context for hyperlink navigation and form submission*/
    default TAttr target(String target) {
        return add("target", target);
    }
/**  How the element handles crossorigin requests*/
    default TAttr crossorigin(String crossorigin) {
        return add("crossorigin", crossorigin);
    }
/**  Relationship between the document containing the hyperlink and the destination resource*/
    default TAttr rel(String rel) {
        return add("rel", rel);
    }
/**  Applicable media*/
    default TAttr media(String media) {
        return add("media", media);
    }
/**  Language of the linked resource*/
    default TAttr hreflang(String hreflang) {
        return add("hreflang", hreflang);
    }
/**  Hint for the type of the referenced resource*/
    default TAttr type(String type) {
        return add("type", type);
    }
/**  Sizes of the icons (for rel="icon")*/
    default TAttr sizes(String sizes) {
        return add("sizes", sizes);
    }
/**  Metadata name*/
    default TAttr name(String name) {
        return add("name", name);
    }
/**  Pragma directive*/
    default TAttr http_equiv(String http_equiv) {
        return add("http-equiv", http_equiv);
    }
/**  Value of the element*/
    default TAttr content(String content) {
        return add("content", content);
    }
/**  Character encoding declaration*/
    default TAttr charset(String charset) {
        return add("charset", charset);
    }
/**  Whether the styles apply to the entire document or just the parent subtree*/
    default TAttr scoped(String scoped) {
        return add("scoped", scoped);
    }
/** */
    default TAttr onafterprint(String onafterprint) {
        return add("onafterprint", onafterprint);
    }
/** */
    default TAttr onbeforeprint(String onbeforeprint) {
        return add("onbeforeprint", onbeforeprint);
    }
/** */
    default TAttr onbeforeunload(String onbeforeunload) {
        return add("onbeforeunload", onbeforeunload);
    }
/** */
    default TAttr onhashchange(String onhashchange) {
        return add("onhashchange", onhashchange);
    }
/** */
    default TAttr onlanguagechange(String onlanguagechange) {
        return add("onlanguagechange", onlanguagechange);
    }
/** */
    default TAttr onmessage(String onmessage) {
        return add("onmessage", onmessage);
    }
/** */
    default TAttr onoffline(String onoffline) {
        return add("onoffline", onoffline);
    }
/** */
    default TAttr ononline(String ononline) {
        return add("ononline", ononline);
    }
/** */
    default TAttr onpagehide(String onpagehide) {
        return add("onpagehide", onpagehide);
    }
/** */
    default TAttr onpageshow(String onpageshow) {
        return add("onpageshow", onpageshow);
    }
/** */
    default TAttr onpopstate(String onpopstate) {
        return add("onpopstate", onpopstate);
    }
/** */
    default TAttr onstorage(String onstorage) {
        return add("onstorage", onstorage);
    }
/** */
    default TAttr onunload(String onunload) {
        return add("onunload", onunload);
    }
/**  Link to the source of the quotation or more information about the edit*/
    default TAttr cite(String cite) {
        return add("cite", cite);
    }
/**  Number the list backwards*/
    default TAttr reversed(String reversed) {
        return add("reversed", reversed);
    }
/**  Ordinal value of the first item*/
    default TAttr start(String start) {
        return add("start", start);
    }
/**  Ordinal value of the list item*/
    default TAttr value(String value) {
        return add("value", value);
    }
/**  Whether to download the resource instead of navigating to it, and its file name if so*/
    default TAttr download(String download) {
        return add("download", download);
    }
/**  URLs to ping*/
    default TAttr ping(String ping) {
        return add("ping", ping);
    }
/**  Machine-readable value*/
    default TAttr datetime(String datetime) {
        return add("datetime", datetime);
    }
/** */
    default TAttr srcset(String srcset) {
        return add("srcset", srcset);
    }
/**  Replacement text for use when images are not available*/
    default TAttr alt(String alt) {
        return add("alt", alt);
    }
/**  Address of the resource*/
    default TAttr src(String src) {
        return add("src", src);
    }
/**  Name of image map to use*/
    default TAttr usemap(String usemap) {
        return add("usemap", usemap);
    }
/**  Whether the image is a server-side image map*/
    default TAttr ismap(String ismap) {
        return add("ismap", ismap);
    }
/**  Horizontal dimension*/
    default TAttr width(String width) {
        return add("width", width);
    }
/**  Vertical dimension*/
    default TAttr height(String height) {
        return add("height", height);
    }
/**  A document to render in the iframe*/
    default TAttr srcdoc(String srcdoc) {
        return add("srcdoc", srcdoc);
    }
/**  Security rules for nested content*/
    default TAttr sandbox(String sandbox) {
        return add("sandbox", sandbox);
    }
/**  Whether to apply the document's styles to the nested content*/
    default TAttr seamless(String seamless) {
        return add("seamless", seamless);
    }
/**  Whether to allow the iframe's contents to use requestFullscreen()*/
    default TAttr allowfullscreen(String allowfullscreen) {
        return add("allowfullscreen", allowfullscreen);
    }
/**  Address of the resource*/
    default TAttr data(String data) {
        return add("data", data);
    }
/**  Whether the type attribute and the Content-Type value need to match for the resource to be used*/
    default TAttr typemustmatch(String typemustmatch) {
        return add("typemustmatch", typemustmatch);
    }
/**  Associates the control with a form element*/
    default TAttr form(String form) {
        return add("form", form);
    }
/**  Poster frame to show prior to video playback*/
    default TAttr poster(String poster) {
        return add("poster", poster);
    }
/**  Hints how much buffering the media resource will likely need*/
    default TAttr preload(String preload) {
        return add("preload", preload);
    }
/**  Hint that the media resource can be started automatically when the page is loaded*/
    default TAttr autoplay(String autoplay) {
        return add("autoplay", autoplay);
    }
/**  Groups media elements together with an implicit MediaController*/
    default TAttr mediagroup(String mediagroup) {
        return add("mediagroup", mediagroup);
    }
/**  Whether to loop the media resource*/
    default TAttr loop(String loop) {
        return add("loop", loop);
    }
/**  Whether to mute the media resource by default*/
    default TAttr muted(String muted) {
        return add("muted", muted);
    }
/**  Show user agent controls*/
    default TAttr controls(String controls) {
        return add("controls", controls);
    }
/**  The type of text track*/
    default TAttr kind(String kind) {
        return add("kind", kind);
    }
/**  Language of the text track*/
    default TAttr srclang(String srclang) {
        return add("srclang", srclang);
    }
/**  User-visible label*/
    default TAttr label(String label) {
        return add("label", label);
    }
/**  Enable the track if no other text track is more suitable*/
    default TAttr default_(String default_) {
        return add("default", default_);
    }
/**  Coordinates for the shape to be created in an image map*/
    default TAttr coords(String coords) {
        return add("coords", coords);
    }
/**  The kind of shape to be created in an image map*/
    default TAttr shape(String shape) {
        return add("shape", shape);
    }
/**  Enables a sorting interface for the table*/
    default TAttr sortable(String sortable) {
        return add("sortable", sortable);
    }
/**  Number of columns spanned by the element*/
    default TAttr span(String span) {
        return add("span", span);
    }
/**  Number of columns that the cell is to span*/
    default TAttr colspan(String colspan) {
        return add("colspan", colspan);
    }
/**  Number of rows that the cell is to span*/
    default TAttr rowspan(String rowspan) {
        return add("rowspan", rowspan);
    }
/**  The header cells for this cell*/
    default TAttr headers(String headers) {
        return add("headers", headers);
    }
/**  Specifies which cells the header cell applies to*/
    default TAttr scope(String scope) {
        return add("scope", scope);
    }
/**  Alternative label to use for the header cell when referencing the cell in other contexts*/
    default TAttr abbr(String abbr) {
        return add("abbr", abbr);
    }
/**  Column sort direction and ordinality*/
    default TAttr sorted(String sorted) {
        return add("sorted", sorted);
    }
/**  Character encodings to use for form submission*/
    default TAttr accept_charset(String accept_charset) {
        return add("accept-charset", accept_charset);
    }
/**  URL to use for form submission*/
    default TAttr action(String action) {
        return add("action", action);
    }
/**  Default setting for autofill feature for controls in the form*/
    default TAttr autocomplete(String autocomplete) {
        return add("autocomplete", autocomplete);
    }
/**  Form data set encoding type to use for form submission*/
    default TAttr enctype(String enctype) {
        return add("enctype", enctype);
    }
/**  HTTP method to use for form submission*/
    default TAttr method(String method) {
        return add("method", method);
    }
/**  Bypass form control validation for form submission*/
    default TAttr novalidate(String novalidate) {
        return add("novalidate", novalidate);
    }
/**  Associate the label with form control*/
    default TAttr for_(String for_) {
        return add("for", for_);
    }
/**  Hint for expected file type in file upload controls*/
    default TAttr accept(String accept) {
        return add("accept", accept);
    }
/**  Automatically focus the form control when the page is loaded*/
    default TAttr autofocus(String autofocus) {
        return add("autofocus", autofocus);
    }
/**  Whether the command or control is checked*/
    default TAttr checked(String checked) {
        return add("checked", checked);
    }
/**  Name of form field to use for sending the element's directionality in form submission*/
    default TAttr dirname(String dirname) {
        return add("dirname", dirname);
    }
/**  Whether the form control is disabled*/
    default TAttr disabled(String disabled) {
        return add("disabled", disabled);
    }
/**  URL to use for form submission*/
    default TAttr formaction(String formaction) {
        return add("formaction", formaction);
    }
/**  Form data set encoding type to use for form submission*/
    default TAttr formenctype(String formenctype) {
        return add("formenctype", formenctype);
    }
/**  HTTP method to use for form submission*/
    default TAttr formmethod(String formmethod) {
        return add("formmethod", formmethod);
    }
/**  Bypass form control validation for form submission*/
    default TAttr formnovalidate(String formnovalidate) {
        return add("formnovalidate", formnovalidate);
    }
/**  Browsing context for form submission*/
    default TAttr formtarget(String formtarget) {
        return add("formtarget", formtarget);
    }
/**  Hint for selecting an input modality*/
    default TAttr inputmode(String inputmode) {
        return add("inputmode", inputmode);
    }
/**  List of autocomplete options*/
    default TAttr list(String list) {
        return add("list", list);
    }
/**  Maximum value*/
    default TAttr max(String max) {
        return add("max", max);
    }
/**  Maximum length of value*/
    default TAttr maxlength(String maxlength) {
        return add("maxlength", maxlength);
    }
/**  Minimum value*/
    default TAttr min(String min) {
        return add("min", min);
    }
/**  Minimum length of value*/
    default TAttr minlength(String minlength) {
        return add("minlength", minlength);
    }
/**  Whether to allow multiple values*/
    default TAttr multiple(String multiple) {
        return add("multiple", multiple);
    }
/**  Pattern to be matched by the form control's value*/
    default TAttr pattern(String pattern) {
        return add("pattern", pattern);
    }
/**  User-visible label to be placed within the form control*/
    default TAttr placeholder(String placeholder) {
        return add("placeholder", placeholder);
    }
/**  Whether to allow the value to be edited by the user*/
    default TAttr readonly(String readonly) {
        return add("readonly", readonly);
    }
/**  Whether the control is required for form submission*/
    default TAttr required(String required) {
        return add("required", required);
    }
/**  Size of the control*/
    default TAttr size(String size) {
        return add("size", size);
    }
/**  Granularity to be matched by the form control's value*/
    default TAttr step(String step) {
        return add("step", step);
    }
/**  Specifies the element's designated pop-up menu*/
    default TAttr menu(String menu) {
        return add("menu", menu);
    }
/**  Whether the option is selected by default*/
    default TAttr selected(String selected) {
        return add("selected", selected);
    }
/**  Maximum number of characters per line*/
    default TAttr cols(String cols) {
        return add("cols", cols);
    }
/**  Number of lines to show*/
    default TAttr rows(String rows) {
        return add("rows", rows);
    }
/**  How the value of the form control is to be wrapped for form submission*/
    default TAttr wrap(String wrap) {
        return add("wrap", wrap);
    }
/**  String to package with the generated and signed public key*/
    default TAttr challenge(String challenge) {
        return add("challenge", challenge);
    }
/**  The type of cryptographic key to generate*/
    default TAttr keytype(String keytype) {
        return add("keytype", keytype);
    }
/**  High limit of low range*/
    default TAttr low(String low) {
        return add("low", low);
    }
/**  Low limit of high range*/
    default TAttr high(String high) {
        return add("high", high);
    }
/**  Optimum value in gauge*/
    default TAttr optimum(String optimum) {
        return add("optimum", optimum);
    }
/**  Whether the details are visible*/
    default TAttr open(String open) {
        return add("open", open);
    }
/**  Icon for the command*/
    default TAttr icon(String icon) {
        return add("icon", icon);
    }
/**  Name of group of commands to treat as a radio button group*/
    default TAttr radiogroup(String radiogroup) {
        return add("radiogroup", radiogroup);
    }
/**  Command definition*/
    default TAttr command(String command) {
        return add("command", command);
    }
/**  Execute script when available, without blocking*/
    default TAttr async(String async) {
        return add("async", async);
    }
/**  Defer script execution*/
    default TAttr defer(String defer) {
        return add("defer", defer);
    }
}
