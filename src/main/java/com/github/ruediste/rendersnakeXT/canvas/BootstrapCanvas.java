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

    public static class B_ColBuilder {
        private BootstrapCanvas<?> canvas;

        private B_ColBuilder(BootstrapCanvas<?> canvas) {
            this.canvas = canvas;

        }

        private B_ColBuilder add(String type, int size) {
            canvas.CLASS("col-" + type + "-" + size);
            return this;
        }

        /**
         * Extra small devices Phones (<768px)
         */
        public B_ColBuilder xs(int size) {
            return add("xs", size);
        }

        /**
         * Small devices Tablets (≥768px)
         */
        public B_ColBuilder sm(int size) {
            return add("sm", size);
        }

        /**
         * Medium devices Desktops (≥992px)
         */
        public B_ColBuilder md(int size) {
            return add("md", size);
        }

        /**
         * Large devices Desktops (≥1200px)
         */
        public B_ColBuilder lg(int size) {
            return add("lg", size);
        }

        /**
         * Extra small devices Phones (<768px)
         */
        public B_ColBuilder xsOffset(int size) {
            return add("xs-offset", size);
        }

        /**
         * Small devices Tablets (≥768px)
         */
        public B_ColBuilder smOffset(int size) {
            return add("sm-offset", size);
        }

        /**
         * Medium devices Desktops (≥992px)
         */
        public B_ColBuilder mdOffset(int size) {
            return add("md-offset", size);
        }

        /**
         * Large devices Desktops (≥1200px)
         */
        public B_ColBuilder lgOffset(int size) {
            return add("lg-offset", size);
        }

        /**
         * Extra small devices Phones (<768px)
         */
        public B_ColBuilder xsPull(int size) {
            return add("xs-pull", size);
        }

        /**
         * Small devices Tablets (≥768px)
         */
        public B_ColBuilder smPull(int size) {
            return add("sm-pull", size);
        }

        /**
         * Medium devices Desktops (≥992px)
         */
        public B_ColBuilder mdPull(int size) {
            return add("md-pull", size);
        }

        /**
         * Large devices Desktops (≥1200px)
         */
        public B_ColBuilder lgPull(int size) {
            return add("lg-pull", size);
        }

        /**
         * Extra small devices Phones (<768px)
         */
        public B_ColBuilder xsPush(int size) {
            return add("xs-push", size);
        }

        /**
         * Small devices Tablets (≥768px)
         */
        public B_ColBuilder smPush(int size) {
            return add("sm-push", size);
        }

        /**
         * Medium devices Desktops (≥992px)
         */
        public B_ColBuilder mdPush(int size) {
            return add("md-push", size);
        }

        /**
         * Large devices Desktops (≥1200px)
         */
        public B_ColBuilder lgPush(int size) {
            return add("lg-push", size);
        }

    }

    default TSelf bCol(Consumer<B_ColBuilder> cols) {
        tag("div", "bCol");
        cols.accept(new B_ColBuilder(this));
        return self();
    }

    default TSelf CLASS(Consumer<B_ColBuilder> cols) {
        cols.accept(new B_ColBuilder(this));
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
     * Do not mix form groups directly with {@link #B_INPUT_GROUP()}s. Instead,
     * nest the input group inside of the form group.
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
    default TSelf bFormGroup() {
        return tag("div", "bFormGroup").CLASS("form-group");
    }

    default TSelf _bFormGroup() {
        return close("bFormGroup");
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
     * Group inputs and {@link #B_INPUT_GROUP_ADDON()} s together
     * 
     * <pre>
     * {@code
     * <form class="form-inline">
     *   <div class="form-group">
     *     <label class="sr-only" for="exampleInputAmount">Amount (in dollars)</label>
     *     <div class="input-group">
     *       <div class="input-group-addon">$</div>
     *       <input type="text" class="form-control" id="exampleInputAmount" placeholder="Amount">
     *       <div class="input-group-addon">.00</div>
     *     </div>
     *   </div>
     *   <button type="submit" class="btn btn-primary">Transfer cash</button>
     * </form>
     * }
     * </pre>
     */
    default TSelf B_INPUT_GROUP() {
        return CLASS("input-group");
    }

    /**
     * place a div directly adjacent to an input
     * 
     * <pre>
     * {@code
     * <form class="form-inline">
     *   <div class="form-group">
     *     <label class="sr-only" for="exampleInputAmount">Amount (in dollars)</label>
     *     <div class="input-group">
     *       <div class="input-group-addon">$</div>
     *       <input type="text" class="form-control" id="exampleInputAmount" placeholder="Amount">
     *       <div class="input-group-addon">.00</div>
     *     </div>
     *   </div>
     *   <button type="submit" class="btn btn-primary">Transfer cash</button>
     * </form>
     * }
     * </pre>
     */
    default TSelf B_INPUT_GROUP_ADDON() {
        return CLASS("input-group-addon");
    }

    /**
     * Use Bootstrap's predefined grid classes to align labels and groups of
     * form controls in a horizontal layout by adding .form-horizontal to
     * override the form (which doesn't have to be a {@code <form>}). Doing so
     * changes .form-groups to behave as grid rows, so no need for .row.
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
     * Use this for labels together with {@link #B_FORM_HORIZONTAL()}
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
    default TSelf bControlLabel() {
        return bControlLabel(x -> {
        });
    }

    /**
     * Use this for labels together with {@link #B_FORM_HORIZONTAL()}
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
    default TSelf bControlLabel(Consumer<B_ColBuilder> attr) {
        return tag("label", "bControlLabel").CLASS("control-label").CLASS(attr);
    }

    default TSelf _bControlLabel() {
        return close("bControlLabel");
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
        return CLASS("help-block");
    }

    public class B_ButtonArgs {
        private BootstrapCanvas<?> html;
        private boolean styleSet;
        private boolean isAnchor;

        private B_ButtonArgs(BootstrapCanvas<?> html, boolean isAnchor) {
            this.html = html;
            this.isAnchor = isAnchor;
        }

        public B_ButtonArgs def() {
            html.CLASS("btn-default");
            styleSet = true;
            return this;
        }

        public B_ButtonArgs primary() {
            html.CLASS("btn-primary");
            styleSet = true;
            return this;
        }

        public B_ButtonArgs success() {
            html.CLASS("btn-success");
            styleSet = true;
            return this;
        }

        public B_ButtonArgs info() {
            html.CLASS("btn-info");
            styleSet = true;
            return this;
        }

        public B_ButtonArgs warning() {
            html.CLASS("btn-warning");
            styleSet = true;
            return this;
        }

        public B_ButtonArgs danger() {
            html.CLASS("btn-danger");
            styleSet = true;
            return this;
        }

        /**
         * large Button
         */
        public B_ButtonArgs lg() {
            html.CLASS("btn-lg");
            return this;
        }

        /**
         * small Button
         */
        public B_ButtonArgs sm() {
            html.CLASS("btn-sm");
            return this;
        }

        /**
         * extra small Button
         */
        public B_ButtonArgs xs() {
            html.CLASS("btn-xs");
            return this;
        }

        /**
         * Create block level buttons—those that span the full width of a
         * parent— by adding .btn-block.
         */
        public B_ButtonArgs block() {
            html.CLASS("btn-block");
            return this;
        }

        /**
         * Buttons will appear pressed (with a darker background, darker border,
         * and inset shadow) when active. For &lt;button> elements, this is done
         * via :active. For &lt;a> elements, it's done with .active. However,
         * you may use .active on &lt;button>s (and include the
         * aria-pressed="true" attribute) should you need to replicate the
         * active state programmatically.
         */
        public B_ButtonArgs active() {
            html.CLASS("active");
            if (!isAnchor) {
                html.addAttribute("aria-pressed", "true");
            }
            return this;
        }

        /**
         * Make buttons look unclickable by fading them back with opacity.
         */
        public B_ButtonArgs disabled() {
            if (isAnchor) {
                html.CLASS("disabled");
            } else
                html.DISABLED("disabled");
            return this;
        }

    }

    /**
     * Create a button. For links, use {@link #bButtonA()}
     */
    default TSelf bButton() {
        return bButton(x -> {
        });
    }

    /**
     * Create a button. For links, use {@link #bButtonA()}
     */
    default TSelf bButton(Consumer<B_ButtonArgs> args) {
        TSelf result = tag("button", "bButton").CLASS("btn").TYPE("button");
        B_ButtonArgs tmp = new B_ButtonArgs(result, false);
        args.accept(tmp);
        if (!tmp.styleSet) {
            result.CLASS("btn-default");
        }
        return result;
    }

    default TSelf _bButton() {
        return close("bButton");
    }

    /**
     * Create a link (&lt;a>) styled as button
     */
    default TSelf bButtonA() {
        return bButtonA(x -> {
        });
    }

    /**
     * Create a link (&lt;a>) styled as button
     */
    default TSelf bButtonA(Consumer<B_ButtonArgs> args) {
        TSelf result = tag("a", "bButtonA").CLASS("btn").addAttribute("role",
                "button");
        B_ButtonArgs tmp = new B_ButtonArgs(result, true);
        args.accept(tmp);
        if (!tmp.styleSet) {
            result.CLASS("btn-default");
        }
        return result;
    }

    default TSelf _bButtonA() {
        return close("bButtonA");
    }

    public class B_ImgArgs {
        private BootstrapCanvas<?> html;

        private B_ImgArgs(BootstrapCanvas<?> html) {
            this.html = html;
        }

        /**
         * Images in Bootstrap 3 can be made responsive-friendly via the
         * addition of the .img-responsive class. This applies max-width: 100%;
         * and height: auto; to the image so that it scales nicely to the parent
         * element.
         */
        public B_ImgArgs responsive() {
            html.CLASS("img-responsive");
            return this;
        }

        /**
         * add rounded corners
         */
        public B_ImgArgs rounded() {
            html.CLASS("img-rounded");
            return this;
        }

        /**
         * make the image a circle
         */
        public B_ImgArgs circle() {
            html.CLASS("img-circle");
            return this;
        }

        /**
         * add a border outside of the image
         */
        public B_ImgArgs thumbnail() {
            html.CLASS("img-thumbnail");
            return this;
        }
    }

    default TSelf bImg(Consumer<B_ImgArgs> args) {
        tag("img", "bImg");
        args.accept(new B_ImgArgs(this));
        return self();
    }

    default TSelf _bImg() {
        return close("bImg");
    }

    /**
     * Contextual colors <br/>
     * Convey meaning through color with a handful of emphasis utility classes.
     * These may also be applied to links and will darken on hover just like our
     * default link styles.
     */
    default TSelf B_TEXT_MUTED() {
        return CLASS("text-muted");
    }

    /**
     * Contextual colors <br/>
     * Convey meaning through color with a handful of emphasis utility classes.
     * These may also be applied to links and will darken on hover just like our
     * default link styles.
     */
    default TSelf B_TEXT_PRIMARY() {
        return CLASS("text-primary");
    }

    /**
     * Contextual colors <br/>
     * Convey meaning through color with a handful of emphasis utility classes.
     * These may also be applied to links and will darken on hover just like our
     * default link styles.
     */
    default TSelf B_TEXT_SUCCESS() {
        return CLASS("text-success");
    }

    /**
     * Contextual colors <br/>
     * Convey meaning through color with a handful of emphasis utility classes.
     * These may also be applied to links and will darken on hover just like our
     * default link styles.
     */
    default TSelf B_TEXT_INFO() {
        return CLASS("text-info");
    }

    /**
     * Contextual colors <br/>
     * Convey meaning through color with a handful of emphasis utility classes.
     * These may also be applied to links and will darken on hover just like our
     * default link styles.
     */
    default TSelf B_TEXT_WARNING() {
        return CLASS("text-warning");
    }

    /**
     * Contextual colors <br/>
     * Convey meaning through color with a handful of emphasis utility classes.
     * These may also be applied to links and will darken on hover just like our
     * default link styles.
     */
    default TSelf B_TEXT_DANGER() {
        return CLASS("text-danger");
    }

    /**
     * Similar to the contextual text color classes, easily set the background
     * of an element to any contextual class. Anchor components will darken on
     * hover, just like the text classes.
     */
    default TSelf B_BG_PRIMARY() {
        return CLASS("bg-primary");
    }

    /**
     * Similar to the contextual text color classes, easily set the background
     * of an element to any contextual class. Anchor components will darken on
     * hover, just like the text classes.
     */
    default TSelf B_BG_SUCCESS() {
        return CLASS("bg-success");
    }

    /**
     * Similar to the contextual text color classes, easily set the background
     * of an element to any contextual class. Anchor components will darken on
     * hover, just like the text classes.
     */
    default TSelf B_BG_INFO() {
        return CLASS("bg-info");
    }

    /**
     * Similar to the contextual text color classes, easily set the background
     * of an element to any contextual class. Anchor components will darken on
     * hover, just like the text classes.
     */
    default TSelf B_BG_WARNING() {
        return CLASS("bg-warning");
    }

    /**
     * Similar to the contextual text color classes, easily set the background
     * of an element to any contextual class. Anchor components will darken on
     * hover, just like the text classes.
     */
    default TSelf B_BG_DANGER() {
        return CLASS("bg-danger");
    }

    /**
     * Use the generic close icon for dismissing content like modals and alerts.
     */
    default TSelf bCloseIcon() {
        return button().TYPE("button").CLASS("close")
                .addAttribute("aria-label", "Close").span()
                .addAttribute("aria-hidden", "true").writeUnescaped("&times;")
                ._span()._button();
    }

    /**
     * Use carets to indicate dropdown functionality and direction. Note that
     * the default caret will reverse automatically in dropup menus.
     */
    default TSelf bCaret() {
        return span().CLASS("caret")._span();
    }

    /**
     * Float an element to the left or right with a class. !important is
     * included to avoid specificity issues.
     */
    default TSelf B_PULL_LEFT() {
        return CLASS("pull-left");
    }

    /**
     * Float an element to the left or right with a class. !important is
     * included to avoid specificity issues.
     */
    default TSelf B_PULL_RIGHT() {
        return CLASS("pull-right");
    }

    /**
     * Set an element to display: block and center via margin. Available as a
     * mixin and class.
     */
    default TSelf B_CENTER_BLOCK() {
        return CLASS("center-block");
    }

    /**
     * Easily clear floats by adding .clearfix to the parent element. Utilizes
     * the micro clearfix as popularized by Nicolas Gallagher.
     * 
     * <pre>
     * {@code
     * <div class="clearfix">...</div>
     * }
     * </pre>
     */
    default TSelf B_CLEARFIX() {
        return CLASS("clearfix");
    }

    public class B_NavbarOptions {
        enum B_NavbarAlignment {
            DEFAULT("navbar-default"), FIXED_TOP("navbar-fixed-top"), FIXED_BOTTOM(
                    "navbar-fixed-bottom"), STATIC_TOP("navbar-static-top)");

            final String css;

            private B_NavbarAlignment(String css) {
                this.css = css;
            }
        }

        B_NavbarAlignment alignment = B_NavbarAlignment.DEFAULT;
        boolean isInverse;

        public B_NavbarOptions inverse() {
            isInverse = true;
            return this;
        }

        /**
         * Add .navbar-fixed-top and include a .container or .container-fluid to
         * center and pad navbar content.
         * 
         * <p>
         * Body padding required <br>
         * The fixed navbar will overlay your other content, unless you add
         * padding to the top of the &lt;body>. Try out your own values or use
         * our snippet below. Tip: By default, the navbar is 50px high.
         * 
         * <pre>
         * body { padding-top: 70px; }
         * </pre>
         * 
         * Make sure to include this after the core Bootstrap CSS.
         */
        public B_NavbarOptions fixedTop() {
            alignment = B_NavbarAlignment.FIXED_TOP;
            return this;
        }

        /**
         * Add .navbar-fixed-bottom and include a .container or .container-fluid
         * to center and pad navbar content.
         * <p>
         * Body padding required <br>
         * The fixed navbar will overlay your other content, unless you add
         * padding to the top of the &lt;body>. Try out your own values or use
         * our snippet below. Tip: By default, the navbar is 50px high.
         * 
         * <pre>
         * body { padding-top: 70px; }
         * </pre>
         * 
         * Make sure to include this after the core Bootstrap CSS.
         */
        public B_NavbarOptions fixedBottom() {
            alignment = B_NavbarAlignment.FIXED_BOTTOM;
            return this;
        }

        /**
         * Create a full-width navbar that scrolls away with the page by adding
         * .navbar-static-top and include a .container or .container-fluid to
         * center and pad navbar content.
         * 
         * Unlike the .navbar-fixed-* classes, you do not need to change any
         * padding on the body.
         */
        public B_NavbarOptions fixedStaticTop() {
            alignment = B_NavbarAlignment.STATIC_TOP;
            return this;
        }
    }

    /**
     * To be used with
     * {@link BootstrapCanvas#bNavbar(Consumer, Runnable, Runnable)} to render
     * the brand.
     * 
     * <pre>
     * html.a().BNavbarBrand().href(...).content(...)
     * </pre>
     */
    default TSelf BNavbarBrand() {
        return CLASS("navbar-brand");
    }

    /**
     * Render a bootstrap navigation. No close tag required.
     */
    default TSelf bNavbar(String id, Consumer<B_NavbarOptions> options,
            Runnable brand, Runnable content) {
        B_NavbarOptions opts = new B_NavbarOptions();
        options.accept(opts);

        //@formatter:off
        nav().CLASS("navbar").CLASS(opts.alignment.css);
            if (opts.isInverse) CLASS("navbar-inverse");
            bContainer_fluid()
                .div().CLASS("navbar-header")
                    .button().TYPE("button").CLASS("navbar-toggle collapsed").DATA("toggle", "collapse").DATA("target", "#"+id)
                        .span().CLASS("sr-only").content("Toggle navigation")
                        .span().CLASS("icon-bar")._span()
                        .span().CLASS("icon-bar")._span()
                        .span().CLASS("icon-bar")._span()
                        .span().CLASS("icon-bar")._span()
                    ._button();
                    if (brand!=null){
                        brand.run();
                    }
                _div()
                .div().CLASS("collapse navbar-collapse").ID(id);
                    content.run();
            return _div()._bContainer_fluid()
        ._nav();
        //@formatter:on
    }

    /**
     * an &lt;ul> containing normal navbar content
     * 
     * <pre>
     * {@code 
     * html.bNavbarNav()
     *   <li class="active"><a href="#">Link <span class="sr-only">(current)</span></a></li>
     *   <li><a href="#">Link</a></li>
     *   <li class="dropdown">
     *     <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Dropdown <span class="caret"></span></a>
     *     <ul class="dropdown-menu" role="menu">
     *       <li><a href="#">Action</a></li>
     *       <li><a href="#">Another action</a></li>
     *       <li><a href="#">Something else here</a></li>
     *       <li class="divider"></li>
     *       <li><a href="#">Separated link</a></li>
     *     </ul>
     *   </li>
     * ._bNavbarNav()
     * }
     * </pre>
     */
    default TSelf bNavbarNav() {
        return tag("ul", "bNavbarNav").CLASS("nav navbar-nav");
    }

    default TSelf _bNavbarNav() {
        return close("bNavbarNav");
    }

    /**
     * align navbar content left
     */
    default TSelf BnavbarLeft() {
        return CLASS("navbar-left");
    }

    /**
     * align navbar content right
     */
    default TSelf BnavbarRight() {
        return CLASS("navbar-right");
    }

    /**
     * add a form to a navbar
     * 
     * 
     * <pre>
     * {@code
     * 
     * <form class="navbar-form navbar-left" role="search">
     *         <div class="form-group">
     *           <input type="text" class="form-control" placeholder="Search">
     *         </div>
     *         <button type="submit" class="btn btn-default">Submit</button>
     *       </form>
     *       
     * }
     * </pre>
     */
    default TSelf bNavbarForm() {
        return tag("form", "bNavbarForm").CLASS("navbar-form");
    }

    default TSelf _bNavbarForm() {
        return close("bNavbarForm");
    }

    /**
     * Add the .navbar-btn class to <button> elements not residing in a <form>
     * to vertically center them in the navbar.
     * 
     * <pre>
     * {@code
     * <button type="button" class="btn btn-default navbar-btn">Sign in</button>
     * }
     * </pre>
     */
    default TSelf BnavbarBtn() {
        return CLASS("navbar-btn");
    }

    /**
     * Wrap strings of text in an element with .navbar-text, usually on a
     * <p>
     * tag for proper leading and color.
     * 
     * <pre>
     * {@code
     * <p class="navbar-text">Signed in as Mark Otto</p>
     * }
     * </pre>
     */
    default TSelf BnavbarText() {
        return CLASS("navbar-text");
    }

    /**
     * For folks using standard links that are not within the regular navbar
     * navigation component, use the .navbar-link class to add the proper colors
     * for the default and inverse navbar options.
     * 
     * <pre>
     * {@code
     * <p class="navbar-text navbar-right">Signed in as <a href="#" class="navbar-link">Mark Otto</a></p>
     * }
     * </pre>
     */
    default TSelf BnavbarLink() {
        return CLASS("navbar-link");
    }

    /**
     * 
     * <pre>
     * {@code
     * }
     * </pre>
     */
    default TSelf B_XXX() {
        return CLASS("");
    }
}
