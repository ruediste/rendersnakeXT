package com.github.ruediste.rendersnakeXT.canvas;

import java.util.function.Consumer;

public interface BootstrapCanvas<TSelf extends BootstrapCanvas<TSelf>> extends
        Html5Canvas<TSelf> {

    /**
     * visually hide the element (but visible for screen readers)
     */
    default TSelf BsrOnly() {
        return CLASS("sr-only");
    }

    /**
     * In combination with {@link #BsrOnly()}, ensure that the link becomes
     * visible once focused (for sighted keyboard users).
     */
    default TSelf BsrOnlyFocusable() {
        return CLASS("sr-only-focusable");
    }

    default TSelf bContainer() {
        return tag("div", "bContainer").CLASS("container");
    }

    default TSelf _bContainer() {
        return close("bContainer");
    }

    default TSelf bContainer_fluid() {
        return tag("div", "bContainer_fluid").CLASS("container-fluid");
    }

    default TSelf _bContainer_fluid() {
        return close("bContainer_fluid");
    }

    default TSelf bRow() {
        return tag("div", "bRow").CLASS("row");
    }

    default TSelf _bRow() {
        return close("bRow");
    }

    public static class B_RowBuilder {
        private BootstrapCanvas<?> canvas;

        private B_RowBuilder(BootstrapCanvas<?> canvas) {
            this.canvas = canvas;

        }

        private B_RowBuilder add(String type, int size) {
            canvas.CLASS("col-" + type + "-" + size);
            return this;
        }

        /**
         * Extra small devices Phones (<768px)
         */
        public B_RowBuilder xs(int size) {
            return add("xs", size);
        }

        /**
         * Small devices Tablets (≥768px)
         */
        public B_RowBuilder sm(int size) {
            return add("sm", size);
        }

        /**
         * Medium devices Desktops (≥992px)
         */
        public B_RowBuilder md(int size) {
            return add("md", size);
        }

        /**
         * Large devices Desktops (≥1200px)
         */
        public B_RowBuilder lg(int size) {
            return add("lg", size);
        }

        /**
         * Extra small devices Phones (<768px)
         */
        public B_RowBuilder xsOffset(int size) {
            return add("xs-offset", size);
        }

        /**
         * Small devices Tablets (≥768px)
         */
        public B_RowBuilder smOffset(int size) {
            return add("sm-offset", size);
        }

        /**
         * Medium devices Desktops (≥992px)
         */
        public B_RowBuilder mdOffset(int size) {
            return add("md-offset", size);
        }

        /**
         * Large devices Desktops (≥1200px)
         */
        public B_RowBuilder lgOffset(int size) {
            return add("lg-offset", size);
        }

        /**
         * Extra small devices Phones (<768px)
         */
        public B_RowBuilder xsPull(int size) {
            return add("xs-pull", size);
        }

        /**
         * Small devices Tablets (≥768px)
         */
        public B_RowBuilder smPull(int size) {
            return add("sm-pull", size);
        }

        /**
         * Medium devices Desktops (≥992px)
         */
        public B_RowBuilder mdPull(int size) {
            return add("md-pull", size);
        }

        /**
         * Large devices Desktops (≥1200px)
         */
        public B_RowBuilder lgPull(int size) {
            return add("lg-pull", size);
        }

        /**
         * Extra small devices Phones (<768px)
         */
        public B_RowBuilder xsPush(int size) {
            return add("xs-push", size);
        }

        /**
         * Small devices Tablets (≥768px)
         */
        public B_RowBuilder smPush(int size) {
            return add("sm-push", size);
        }

        /**
         * Medium devices Desktops (≥992px)
         */
        public B_RowBuilder mdPush(int size) {
            return add("md-push", size);
        }

        /**
         * Large devices Desktops (≥1200px)
         */
        public B_RowBuilder lgPush(int size) {
            return add("lg-push", size);
        }

    }

    default TSelf bCol(Consumer<B_RowBuilder> cols) {
        tag("div", "bCol");
        cols.accept(new B_RowBuilder(this));
        return self();
    }

    default TSelf _bCol() {
        return close("bCol");
    }

    /**
     * Make a paragraph standing out
     */
    default TSelf bLeadParagraph() {
        return tag("p", "bLeadParagraph").CLASS("lead");
    }

    default TSelf _bLeadParagraph() {
        return close("bLeadParagraph");
    }

    default TSelf BtextLeft() {
        return CLASS("text-left");
    }

    default TSelf BtextRight() {
        return CLASS("text-right");
    }

    default TSelf BtextCenter() {
        return CLASS("text-center");
    }

    default TSelf BtextJustify() {
        return CLASS("text-justify");
    }

    default TSelf BtextNowrap() {
        return CLASS("text-nowrap");
    }

    default TSelf BtextLowercase() {
        return CLASS("text-lowercase");
    }

    default TSelf BtextUppercase() {
        return CLASS("text-uppercase");
    }

    default TSelf BtextCapitalize() {
        return CLASS("text-capitalize");
    }

    /**
     * Stylized implementation of HTML's &lt;abbr> element for abbreviations and
     * acronyms to show the expanded version on hover. Abbreviations with a
     * title attribute have a light dotted bottom border and a help cursor on
     * hover, providing additional context on hover and to users of assistive
     * technologies.
     */
    default TSelf bAbbr() {
        return abbr();
    }

    /**
     * version of {@link #bAbbr()} with slightly smaller font size
     */
    default TSelf bAbbrInitialism() {
        return abbr().CLASS("initialism");
    }

    /**
     * Remove the default list-style and left margin on list items (immediate
     * children only). This only applies to immediate children list items,
     * meaning you will need to add the class for any nested lists as well.
     */
    default TSelf BlistUnstyled() {
        return CLASS("list-unstyled");
    }

    /**
     * Place all list items on a single line with display: inline-block; and
     * some light padding.
     */
    default TSelf BlistInline() {
        return CLASS("list-inline");
    }

    /**
     * A list of terms with their associated descriptions.
     * 
     * <pre>
     * html.bDl().dt().content("Horse").dd().content("an Animal") ... ._bDl();
     * </pre>
     */
    default TSelf bDl() {
        return tag("dl", "bDl");
    }

    default TSelf _bDl() {
        return close("bDl");
    }

    /**
     * A list of terms with their associated descriptions, lined up side-by-side
     * 
     * <pre>
     * html.bDlHorizontal().dt().content("Horse").dd().content("an Animal") ... ._bDl();
     * </pre>
     */
    default TSelf bDlHorizontal() {
        return tag("dl", "bDlHorizontal").CLASS("dl-horizontal");
    }

    public static class B_TableBuilder {
        private BootstrapCanvas<?> canvas;

        private B_TableBuilder(BootstrapCanvas<?> canvas) {
            this.canvas = canvas;
        }

        /**
         * add zebra-striping to every other table row
         */
        public B_TableBuilder striped() {
            canvas.CLASS("table-striped");
            return this;
        }

        /**
         * add borders on all sides of the table and cells.
         */
        public B_TableBuilder bordered() {
            canvas.CLASS("table-bordered");
            return this;
        }

        /** enable a hover state on table rows */
        public B_TableBuilder hover() {
            canvas.CLASS("table-hover");
            return this;
        }

        /**
         * make tables more compact by cutting cell padding in half
         */
        public B_TableBuilder condensed() {
            canvas.CLASS("table-condensed");
            return this;
        }
    }

    /**
     * For basic styling—light padding and only horizontal dividers.
     * <p>
     * Add the base class .table to any &lt;table> . It may seem super
     * redundant, but given the widespread use of tables for other plugins like
     * calendars and date pickers, we've opted to isolate our custom table
     * styles.
     */
    default TSelf bTable() {
        return tag("table", "bTable").CLASS("table");
    }

    /**
     * For basic styling—light padding and only horizontal dividers.
     * <p>
     * Add the base class .table to any &lt;table> . It may seem super
     * redundant, but given the widespread use of tables for other plugins like
     * calendars and date pickers, we've opted to isolate our custom table
     * styles.
     */
    default TSelf bTable(Consumer<B_TableBuilder> opts) {
        tag("table", "bTable").CLASS("table");
        opts.accept(new B_TableBuilder(this));
        return self();
    }

    /**
     * Create a responsive table. The table is placed in a resposive wrapper.
     * Attributes will be put onto the table.
     */
    default TSelf bTableResposive(Consumer<B_TableBuilder> opts) {
        writeUnescaped("<div class=\"table-responsive\"><table");
        startTag("bTableResposive", ">", "</table></div>");
        opts.accept(new B_TableBuilder(this));
        return CLASS("bTableResposive");
    }

    default TSelf _bTableResposive() {
        return close("bTableResposive");
    }

    default TSelf _bTable() {
        return close("bTable");
    }

    public enum B_TableContext {
        /**
         * Applies the hover color to a particular row or cell
         */
        ACTIVE,
        /**
         * Indicates a successful or positive action
         */
        SUCCESS,
        /** Indicates a neutral informative change or action */
        INFO,
        /** Indicates a warning that might need attention */
        WARNING,
        /** Indicates a dangerous or potentially negative action */
        DANGER,
    }

    default TSelf bTr() {
        return tag("tr", "bTr");
    }

    default TSelf bTr(B_TableContext ctx) {
        return bTr().CLASS(ctx.name().toLowerCase());
    }

    default TSelf _bTr() {
        return close("bTr");
    }

    default TSelf bTh() {
        return tag("th", "bTh");
    }

    default TSelf bTh(B_TableContext ctx) {
        return bTh().CLASS(ctx.name().toLowerCase());
    }

    default TSelf _bTh() {
        return close("bTh");
    }

    default TSelf bTd() {
        return tag("td", "bTd");
    }

    default TSelf bTd(B_TableContext ctx) {
        return bTd().CLASS(ctx.name().toLowerCase());
    }

    default TSelf _bTd() {
        return close("bTd");
    }

    /**
     * All textual &lt;input>, &lt;textarea>, and &lt;select> elements with
     * .form-control are set to width: 100%; by default.
     * 
     * <pre>
     * {@code
     * <form>
     *   <div class="form-group">
     *     <label for="exampleInputEmail1">Email address</label>
     *     <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
     *   </div>
     *   ...
     * </form>
     * }
     * </pre>
     * 
     */
    default TSelf B_FORM_CONTROL() {
        return CLASS("form-control");
    }

    /**
     * Wrap labels and controls in .form-group for optimum spacing. <br>
     * Do not mix form groups directly with input groups. Instead, nest the
     * input group inside of the form group.
     * 
     * <pre>
     * {@code
     * <form>
     *   <div class="form-group">
     *     <label for="exampleInputEmail1">Email address</label>
     *     <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Enter email">
     *   </div>
     *   ...
     * </form>
     * }
     * </pre>
     */
    default TSelf B_FORM_GROUP() {
        return CLASS("form-group");
    }

    /**
     * Add .form-inline to your form (which doesn't have to be a &lt;form>) for
     * left-aligned and inline-block controls. This only applies to forms within
     * viewports that are at least 768px wide.
     * 
     * <pre>
     * {@code
     * <form class="form-inline">
     *   <div class="form-group">
     *     <label for="exampleInputName2">Name</label>
     *     <input type="text" class="form-control" id="exampleInputName2" placeholder="Jane Doe">
     *   </div>
     *   ...
     * </form>
     * }
     * </pre>
     */
    default TSelf B_FORM_INLINE() {
        return CLASS("form-inline");
    }

    /**
     * place a div directly adjacent to an input
     * 
     * <pre>
     * {@code
     * <div class="input-group-addon">$</div>
     * <input type="text" class="form-control" id="exampleInputAmount" placeholder="Amount">
     * }
     * </pre>
     */
    default TSelf B_INPUT_GROUP_ADDON() {
        return CLASS("input-group-addon");
    }

    /**
     * Use Bootstrap's predefined grid classes to align labels and groups of
     * form controls in a horizontal layout by adding .form-horizontal to @Override
     * the form (which doesn't have to be a {@code <form>}). Doing so changes
     * .form-groups to behave as grid rows, so no need for .row.
     * 
     * <pre>
     * {@code
     * <form class="form-horizontal">
     *   <div class="form-group">
     *     <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
     *     <div class="col-sm-10">
     *       <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
     *     </div>
     *   </div>
     *   ...
     * </form>
     * }
     * </pre>
     */
    default TSelf B_FORM_HORIZONTAL() {
        return CLASS("form-horizontal");
    }

    /**
     * A checkbox or radio with the disabled attribute will be styled
     * appropriately. To have the &lt;label> for the checkbox or radio also
     * display a "not-allowed" cursor when the user hovers over the label, add
     * the .disabled class to your .radio, .radio-inline, .checkbox,
     * .checkbox-inline, or &lt;fieldset>.
     * 
     * <pre>
     * {@code
     * <div class="checkbox">
     *   <label>
     *     <input type="checkbox" value="">
     *     Option one is this and that&mdash;be sure to include why it's great
     *   </label>
     * </div>
     * <div class="checkbox disabled">
     *   <label>
     *     <input type="checkbox" value="" disabled>
     *     Option two is disabled
     *   </label>
     * </div>
     * 
     * <div class="radio">
     *   <label>
     *     <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>
     *     Option one is this and that&mdash;be sure to include why it's great
     *   </label>
     * </div>
     * <div class="radio">
     *   <label>
     *     <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
     *     Option two can be something else and selecting it will deselect option one
     *   </label>
     * </div>
     * <div class="radio disabled">
     *   <label>
     *     <input type="radio" name="optionsRadios" id="optionsRadios3" value="option3" disabled>
     *     Option three is disabled
     *   </label>
     * </div>
     * }
     * </pre>
     */
    default TSelf B_DISABLED() {
        return CLASS("disabled");
    }

    /**
     * Use the .checkbox-inline on a series of checkboxes for controls that
     * appear on the same line.
     * 
     * <pre>
     * {@code
     * <label class="checkbox-inline">
     *   <input type="checkbox" id="inlineCheckbox1" value="option1"> 1
     * </label>
     * <label class="checkbox-inline">
     *   <input type="checkbox" id="inlineCheckbox2" value="option2"> 2
     * </label>
     * <label class="checkbox-inline">
     *   <input type="checkbox" id="inlineCheckbox3" value="option3"> 3
     * </label>
     * 
     * }
     * </pre>
     */
    default TSelf B_CHECKBOX_INLINE() {
        return CLASS("checkbox-inline");
    }

    /**
     * Use the .radio-inline on a series of radios for controls that appear on
     * the same line.
     * 
     * <pre>
     * {@code
     * <label class="radio-inline">
     *   <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 1
     * </label>
     * <label class="radio-inline">
     *   <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 2
     * </label>
     * <label class="radio-inline">
     *   <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 3
     * </label>
     * 
     * }
     * </pre>
     */
    default TSelf B_RADIO_INLINE() {
        return CLASS("radio-inline");
    }

    /**
     * When you need to place plain text next to a form label within a form, use
     * the .form-control-static class on a &lt;p>.
     * 
     * <pre>
     * {@code
     * <form class="form-horizontal">
     *   <div class="form-group">
     *     <label class="col-sm-2 control-label">Email</label>
     *     <div class="col-sm-10">
     *       <p class="form-control-static">email@example.com</p>
     *     </div>
     *   </div>
     *   ...
     *   </form>
     * }
     * </pre>
     */
    default TSelf B_FORM_CONTROL_STATIC() {
        return CLASS("form-control-static");
    }

    /**
     * Bootstrap includes validation styles for error, warning, and success
     * states on form controls. To use, add .has-warning, .has-error, or
     * .has-success to the parent element. Any .control-label, .form-control,
     * and .help-block within that element will receive the validation styles.
     * 
     * <pre>
     * {@code
     * <div class="form-group has-success">
     *   <label class="control-label" for="inputSuccess1">Input with success</label>
     *   <input type="text" class="form-control" id="inputSuccess1">
     * </div>
     * }
     * </pre>
     */
    default TSelf B_HAS_SUCCESS() {
        return CLASS("has-success");
    }

    /**
     * Bootstrap includes validation styles for error, warning, and success
     * states on form controls. To use, add .has-warning, .has-error, or
     * .has-success to the parent element. Any .control-label, .form-control,
     * and .help-block within that element will receive the validation styles.
     * 
     * <pre>
     * {@code
     * <div class="form-group has-success">
     *   <label class="control-label" for="inputSuccess1">Input with success</label>
     *   <input type="text" class="form-control" id="inputSuccess1">
     * </div>
     * }
     * </pre>
     */
    default TSelf B_HAS_WARNING() {
        return CLASS("has-warning");
    }

    /**
     * Bootstrap includes validation styles for error, warning, and success
     * states on form controls. To use, add .has-warning, .has-error, or
     * .has-success to the parent element. Any .control-label, .form-control,
     * and .help-block within that element will receive the validation styles.
     * 
     * <pre>
     * {@code
     * <div class="form-group has-success">
     *   <label class="control-label" for="inputSuccess1">Input with success</label>
     *   <input type="text" class="form-control" id="inputSuccess1">
     * </div>
     * }
     * </pre>
     */
    default TSelf B_HAS_ERROR() {
        return CLASS("has-error");
    }

    /**
     * You can also add optional feedback icons with the addition of
     * .has-feedback and the right icon with {@link #B_FORM_CONTROL_FEEDBACK()}
     * 
     * Feedback icons only work with textual &lt;input class="form-control">
     * elements.
     * 
     * 
     * <pre>
     * {@code
     * <div class="form-group has-success has-feedback">
     *   <label class="control-label" for="inputSuccess2">Input with success</label>
     *   <input type="text" class="form-control" id="inputSuccess2" aria-describedby="inputSuccess2Status">
     *   <span class="glyphicon glyphicon-ok form-control-feedback" aria-hidden="true"></span>
     *   <span id="inputSuccess2Status" class="sr-only">(success)</span>
     * </div>
     * }
     * </pre>
     */
    default TSelf B_HAS_FEEDBACK() {
        return CLASS("has-feedback");
    }

    /**
     * You can also add optional feedback icons with the addition of
     * {@link #B_HAS_FEEDBACK()} and the right icon with .form-control-feedback.
     * 
     * Feedback icons only work with textual &lt;input class="form-control">
     * elements.
     * 
     * 
     * <pre>
     * {@code
     * <div class="form-group has-success has-feedback">
     *   <label class="control-label" for="inputSuccess2">Input with success</label>
     *   <input type="text" class="form-control" id="inputSuccess2" aria-describedby="inputSuccess2Status">
     *   <span class="glyphicon glyphicon-ok form-control-feedback" aria-hidden="true"></span>
     *   <span id="inputSuccess2Status" class="sr-only">(success)</span>
     * </div>
     * }
     * </pre>
     */
    default TSelf B_FORM_CONTROL_FEEDBACK() {
        return CLASS("form-control-feedback");
    }

    /**
     * Create taller or shorter form controls that match button sizes. Use
     * {@link #B_FORM_GROUP_LG()} for horizontal forms
     * 
     * <pre>
     * {@code
     * <input class="form-control input-lg" type="text" placeholder=".input-lg">
     * <input class="form-control" type="text" placeholder="Default input">
     * <input class="form-control input-sm" type="text" placeholder=".input-sm">
     * 
     * <select class="form-control input-lg">...</select>
     * <select class="form-control">...</select>
     * <select class="form-control input-sm">...</select>
     * }
     * </pre>
     */
    default TSelf B_INPUT_LG() {
        return CLASS("input-lg");
    }

    /**
     * Create taller or shorter form controls that match button sizes. Use
     * {@link #B_FORM_GROUP_SM()} for horizontal forms
     * 
     * <pre>
     * {@code
     * <input class="form-control input-lg" type="text" placeholder=".input-lg">
     * <input class="form-control" type="text" placeholder="Default input">
     * <input class="form-control input-sm" type="text" placeholder=".input-sm">
     * 
     * <select class="form-control input-lg">...</select>
     * <select class="form-control">...</select>
     * <select class="form-control input-sm">...</select>
     * }
     * </pre>
     */
    default TSelf B_INPUT_SM() {
        return CLASS("input-sm");
    }

    /**
     * Quickly size labels and form controls within .form-horizontal by adding
     * .form-group-lg or .form-group-sm. Use {@link #B_INPUT_LG()} for normal
     * forms
     * 
     * <pre>
     * {@code
     * <form class="form-horizontal">
     *   <div class="form-group form-group-lg">
     *     <label class="col-sm-2 control-label" for="formGroupInputLarge">Large label</label>
     *     <div class="col-sm-10">
     *       <input class="form-control" type="text" id="formGroupInputLarge" placeholder="Large input">
     *     </div>
     *   </div>
     *   <div class="form-group form-group-sm">
     *     <label class="col-sm-2 control-label" for="formGroupInputSmall">Small label</label>
     *     <div class="col-sm-10">
     *       <input class="form-control" type="text" id="formGroupInputSmall" placeholder="Small input">
     *     </div>
     *   </div>
     * </form>
     * }
     * </pre>
     */
    default TSelf B_FORM_GROUP_LG() {
        return CLASS("form-group-lg");
    }

    /**
     * Quickly size labels and form controls within .form-horizontal by adding
     * .form-group-lg or .form-group-sm. Use {@link #B_INPUT_SM()} for normal
     * forms
     * 
     * <pre>
     * {@code
     * <form class="form-horizontal">
     *   <div class="form-group form-group-lg">
     *     <label class="col-sm-2 control-label" for="formGroupInputLarge">Large label</label>
     *     <div class="col-sm-10">
     *       <input class="form-control" type="text" id="formGroupInputLarge" placeholder="Large input">
     *     </div>
     *   </div>
     *   <div class="form-group form-group-sm">
     *     <label class="col-sm-2 control-label" for="formGroupInputSmall">Small label</label>
     *     <div class="col-sm-10">
     *       <input class="form-control" type="text" id="formGroupInputSmall" placeholder="Small input">
     *     </div>
     *   </div>
     * </form>
     * }
     * </pre>
     */
    default TSelf B_FORM_GROUP_SM() {
        return CLASS("form-group-sm");
    }

    /**
     * Block level help text for form controls.
     * 
     * <p>
     * <b> Associating help text with form controls </b><br/>
     * Help text should be explicitly associated with the form control it
     * relates to using the aria-describedby attribute. This will ensure that
     * assistive technologies – such as screen readers – will announce this help
     * text when the user focuses or enters the control.
     * 
     * <pre>
     * {@code
     * <label class="sr-only" for="inputHelpBlock">Input with help text</label>
     * <input type="text" id="inputHelpBlock" class="form-control" aria-describedby="helpBlock">
     * ...
     * <span id="helpBlock" class="help-block">A block of help text that breaks onto a new line and may extend beyond one line.</span>
     * }
     * </pre>
     */
    default TSelf B_HELP_BLOCK() {
        return CLASS("");
    }

    /**
     * 
     * <pre>
     * {@code
     * }
     * </pre>
     */
    default TSelf B_FORM_XXX() {
        return CLASS("");
    }
}
