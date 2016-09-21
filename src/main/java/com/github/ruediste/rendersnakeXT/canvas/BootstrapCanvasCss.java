package com.github.ruediste.rendersnakeXT.canvas;

import java.util.function.Consumer;
import java.util.function.Supplier;

public interface BootstrapCanvasCss<TSelf extends BootstrapCanvas<TSelf>> extends Html5Canvas<TSelf> {

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
        private BootstrapCanvasCss<?> canvas;

        private B_ColBuilder(BootstrapCanvasCss<?> canvas) {
            this.canvas = canvas;

        }

        private B_ColBuilder add(String type, int size) {
            canvas.CLASS("col-" + type + "-" + size);
            return this;
        }

        /**
         * Extra small devices Phones (&lt;768px)
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
         * Extra small devices Phones (&lt;768px)
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
         * Extra small devices Phones (&lt;768px)
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
         * Extra small devices Phones (&lt;768px)
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
     * Stylized implementation of HTML's &lt;abbr&gt; element for abbreviations
     * and acronyms to show the expanded version on hover. Abbreviations with a
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
        private BootstrapCanvasCss<?> canvas;

        private B_TableBuilder(BootstrapCanvasCss<?> canvas) {
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
     * Add the base class .table to any &lt;table&gt; . It may seem super
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
     * Add the base class .table to any &lt;table&gt;. It may seem super
     * redundant, but given the widespread use of tables for other plugins like
     * calendars and date pickers, we've opted to isolate our custom table
     * styles.
     */
    default TSelf bTable(Consumer<B_TableBuilder> opts) {
        tag("table", "bTable").CLASS("table");
        opts.accept(new B_TableBuilder(this));
        return self();
    }

    default TSelf BtableResponsive() {
        return CLASS("table-responsive");
    }

    default TSelf BtableResponiveOpts(Consumer<B_TableBuilder> opts) {
        opts.accept(new B_TableBuilder(this));
        return self();
    }

    default TSelf _bTable() {
        return close("bTable");
    }

    public enum B_TableContext {
        /**
         * Applies the hover color to a particular row or cell
         */
        ACTIVE, /**
                 * Indicates a successful or positive action
                 */
        SUCCESS, /** Indicates a neutral informative change or action */
        INFO, /** Indicates a warning that might need attention */
        WARNING, /** Indicates a dangerous or potentially negative action */
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
     * All textual &lt;input&gt;, &lt;textarea&gt;, and &lt;select&gt; elements
     * with .form-control are set to width: 100%; by default.
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
    default TSelf BformControl() {
        return CLASS("form-control");
    }

    /**
     * Wrap labels and controls in .form-group for optimum spacing. <br>
     * Do not mix form groups directly with
     * {@link BootstrapCanvasComponents#bInputGroup()}s. Instead, nest the input
     * group inside of the form group.
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
     * Add .form-inline to your form (which doesn't have to be a &lt;form&gt;)
     * for left-aligned and inline-block controls. This only applies to forms
     * within viewports that are at least 768px wide.
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
    default TSelf BformInline() {
        return CLASS("form-inline");
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
    default TSelf BformHorizontal() {
        return CLASS("form-horizontal");
    }

    /**
     * Use this for labels together with {@link #BformHorizontal()}
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
     * Use this for labels together with {@link #BformHorizontal()}
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
     * appropriately. To have the &lt;label&gt; for the checkbox or radio also
     * display a "not-allowed" cursor when the user hovers over the label, add
     * the .disabled class to your .radio, .radio-inline, .checkbox,
     * .checkbox-inline, or &lt;fieldset&gt;.
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
    default TSelf Bdisabled() {
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
    default TSelf BcheckboxInline() {
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
    default TSelf BradioInline() {
        return CLASS("radio-inline");
    }

    /**
     * When you need to place plain text next to a form label within a form, use
     * the .form-control-static class on a &lt;p&gt;.
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
    default TSelf BformControlStatic() {
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
    default TSelf BhasSuccess() {
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
    default TSelf BhasWarning() {
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
    default TSelf BhasError() {
        return CLASS("has-error");
    }

    /**
     * You can also add optional feedback icons with the addition of
     * .has-feedback and the right icon with {@link #BformControlFeedback()}
     *
     * Feedback icons only work with textual &lt;input class="form-control"&gt;
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
    default TSelf BhasFeedback() {
        return CLASS("has-feedback");
    }

    /**
     * You can also add optional feedback icons with the addition of
     * {@link #BhasFeedback()} and the right icon with .form-control-feedback.
     *
     * Feedback icons only work with textual &lt;input class="form-control"&gt;
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
    default TSelf BformControlFeedback() {
        return CLASS("form-control-feedback");
    }

    /**
     * Create taller or shorter form controls that match button sizes. Use
     * {@link #BformGroupLg()} for horizontal forms
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
    default TSelf BinputLg() {
        return CLASS("input-lg");
    }

    /**
     * Create taller or shorter form controls that match button sizes. Use
     * {@link #BformGroupSm()} for horizontal forms
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
    default TSelf BinputSm() {
        return CLASS("input-sm");
    }

    /**
     * Quickly size labels and form controls within .form-horizontal by adding
     * .form-group-lg or .form-group-sm. Use {@link #BinputLg()} for normal
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
    default TSelf BformGroupLg() {
        return CLASS("form-group-lg");
    }

    /**
     * Quickly size labels and form controls within .form-horizontal by adding
     * .form-group-lg or .form-group-sm. Use {@link #BinputSm()} for normal
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
    default TSelf BformGroupSm() {
        return CLASS("form-group-sm");
    }

    /**
     * Block level help text for form controls.
     *
     * <p>
     * <b> Associating help text with form controls </b><br>
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
    default TSelf BhelpBlock() {
        return CLASS("help-block");
    }

    public static enum B_ButtonStyle {
        DEFAULT("btn-default"), PRIMARY("btn-primary"), SUCCESS("btn-success"), INFO("btn-info"), WARNING(
                "btn-warning"), DANGER("btn-danger"), LINK("btn-link");
        public final String cls;

        B_ButtonStyle(String cls) {
            this.cls = cls;

        }
    }

    public static class B_ButtonArgs<TSelf extends B_ButtonArgs<TSelf>> {
        private BootstrapCanvasCss<?> html;
        private boolean isLink;
        private B_ButtonStyle style = B_ButtonStyle.DEFAULT;

        protected B_ButtonArgs(BootstrapCanvasCss<?> html, boolean isLink) {
            this.html = html;
            this.isLink = isLink;
        }

        @SuppressWarnings("unchecked")
        protected TSelf self() {
            return (TSelf) this;
        }

        public TSelf style(B_ButtonStyle style) {
            this.style = style;
            return self();
        }

        public TSelf def() {
            return style(B_ButtonStyle.DEFAULT);
        }

        public TSelf primary() {
            return style(B_ButtonStyle.PRIMARY);
        }

        public TSelf success() {
            return style(B_ButtonStyle.SUCCESS);
        }

        public TSelf info() {
            return style(B_ButtonStyle.INFO);
        }

        public TSelf warning() {
            return style(B_ButtonStyle.WARNING);
        }

        public TSelf danger() {
            return style(B_ButtonStyle.DANGER);
        }

        public TSelf link() {
            return style(B_ButtonStyle.LINK);
        }

        /**
         * large Button
         */
        public TSelf lg() {
            html.CLASS("btn-lg");
            return self();
        }

        /**
         * small Button
         */
        public TSelf sm() {
            html.CLASS("btn-sm");
            return self();
        }

        /**
         * extra small Button
         */
        public TSelf xs() {
            html.CLASS("btn-xs");
            return self();
        }

        /**
         * Create block level buttons—those that span the full width of a
         * parent— by adding .btn-block.
         */
        public TSelf block() {
            html.CLASS("btn-block");
            return self();
        }

        /**
         * Buttons will appear pressed (with a darker background, darker border,
         * and inset shadow) when active. For &lt;button&gt; elements, this is
         * done via :active. For &lt;a&gt; elements, it's done with .active.
         * However, you may use .active on &lt;button&gt;s (and include the
         * aria-pressed="true" attribute) should you need to replicate the
         * active state programmatically.
         */
        public TSelf active() {
            html.CLASS("active");
            if (!isLink) {
                html.addAttribute("aria-pressed", "true");
            }
            return self();
        }

        /**
         * Make buttons look unclickable by fading them back with opacity.
         */
        public TSelf disabled() {
            if (isLink) {
                html.CLASS("disabled");
            } else
                html.DISABLED();
            return self();
        }

    }

    /**
     * Create a button. For links, use {@link #bButtonA()}
     */
    default TSelf bButton() {
        return bButton((Consumer<B_ButtonArgs<?>>) null);
    }

    /**
     * Create a button. For links, use {@link #bButtonA()}. Args defines various
     * button arguments. May be null.
     */
    default TSelf bButton(Consumer<B_ButtonArgs<?>> args) {
        return bButton(() -> {
            B_ButtonArgs<?> tmp = new B_ButtonArgsImpl(self(), false);
            if (args != null)
                args.accept(tmp);
            return tmp;
        });
    }

    default TSelf bButton(Supplier<B_ButtonArgs<?>> args) {
        TSelf result = tag("button", "bButton").CLASS("btn").TYPE("button");
        B_ButtonArgs<?> tmp = args.get();
        result.CLASS(tmp.style.cls);
        return result;
    }

    default TSelf _bButton() {
        return close("bButton");
    }

    /**
     * Create a link (&lt;a&gt;) styled as button
     */
    default TSelf bButtonA() {
        return bButtonA(x -> {
        });
    }

    /**
     * Create a link (&lt;a&gt;) styled as button
     */
    default TSelf bButtonA(Consumer<B_ButtonArgs<?>> args) {
        return bButtonA(() -> {
            B_ButtonArgs<?> tmp = new B_ButtonArgsImpl(self(), true);
            if (args != null)
                args.accept(tmp);
            return tmp;
        });
    }

    default TSelf bButtonA(Supplier<B_ButtonArgs<?>> args) {
        TSelf result = tag("a", "bButtonA").CLASS("btn").addAttribute("role", "button");
        B_ButtonArgs<?> tmp = args.get();
        result.CLASS(tmp.style.cls);
        return result;
    }

    default TSelf _bButtonA() {
        return close("bButtonA");
    }

    public class B_ImgArgs {
        private BootstrapCanvasCss<?> html;

        private B_ImgArgs(BootstrapCanvasCss<?> html) {
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
     * Contextual colors <br>
     * Convey meaning through color with a handful of emphasis utility classes.
     * These may also be applied to links and will darken on hover just like our
     * default link styles.
     */
    default TSelf BtextMuted() {
        return CLASS("text-muted");
    }

    /**
     * Contextual colors <br>
     * Convey meaning through color with a handful of emphasis utility classes.
     * These may also be applied to links and will darken on hover just like our
     * default link styles.
     */
    default TSelf BtextPrimary() {
        return CLASS("text-primary");
    }

    /**
     * Contextual colors <br>
     * Convey meaning through color with a handful of emphasis utility classes.
     * These may also be applied to links and will darken on hover just like our
     * default link styles.
     */
    default TSelf BtextSuccess() {
        return CLASS("text-success");
    }

    /**
     * Contextual colors <br>
     * Convey meaning through color with a handful of emphasis utility classes.
     * These may also be applied to links and will darken on hover just like our
     * default link styles.
     */
    default TSelf BtextInfo() {
        return CLASS("text-info");
    }

    /**
     * Contextual colors <br>
     * Convey meaning through color with a handful of emphasis utility classes.
     * These may also be applied to links and will darken on hover just like our
     * default link styles.
     */
    default TSelf BtextWarning() {
        return CLASS("text-warning");
    }

    /**
     * Contextual colors <br>
     * Convey meaning through color with a handful of emphasis utility classes.
     * These may also be applied to links and will darken on hover just like our
     * default link styles.
     */
    default TSelf BtextDanger() {
        return CLASS("text-danger");
    }

    /**
     * Similar to the contextual text color classes, easily set the background
     * of an element to any contextual class. Anchor components will darken on
     * hover, just like the text classes.
     */
    default TSelf BbgPrimary() {
        return CLASS("bg-primary");
    }

    /**
     * Similar to the contextual text color classes, easily set the background
     * of an element to any contextual class. Anchor components will darken on
     * hover, just like the text classes.
     */
    default TSelf BbgSuccess() {
        return CLASS("bg-success");
    }

    /**
     * Similar to the contextual text color classes, easily set the background
     * of an element to any contextual class. Anchor components will darken on
     * hover, just like the text classes.
     */
    default TSelf BbgInfo() {
        return CLASS("bg-info");
    }

    /**
     * Similar to the contextual text color classes, easily set the background
     * of an element to any contextual class. Anchor components will darken on
     * hover, just like the text classes.
     */
    default TSelf BbgWarning() {
        return CLASS("bg-warning");
    }

    /**
     * Similar to the contextual text color classes, easily set the background
     * of an element to any contextual class. Anchor components will darken on
     * hover, just like the text classes.
     */
    default TSelf BbgDanger() {
        return CLASS("bg-danger");
    }

    /**
     * Use the generic close icon for dismissing content like modals and alerts.
     */
    default TSelf bCloseIcon() {
        return button().TYPE("button").CLASS("close").addAttribute("aria-label", "Close").span()
                .addAttribute("aria-hidden", "true").writeUnescaped("&times;")._span()._button();
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
    default TSelf BpullLeft() {
        return CLASS("pull-left");
    }

    /**
     * Float an element to the left or right with a class. !important is
     * included to avoid specificity issues.
     */
    default TSelf BpullRight() {
        return CLASS("pull-right");
    }

    /**
     * Set an element to display: block and center via margin. Available as a
     * mixin and class.
     */
    default TSelf BcenterBlock() {
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
    default TSelf Bclearfix() {
        return CLASS("clearfix");
    }

    /**
     * Force an element to be shown or hidden (including for screen readers)
     * with the use of .show and .hidden classes. These classes use !important
     * to avoid specificity conflicts, just like the quick floats. They are only
     * available for block level toggling.
     *
     * <pre>
     * {@code
     * <div class="show">...</div>
     * <div class="hidden">...</div>
     * }
     * </pre>
     */
    default TSelf Bshow() {
        return CLASS("show");
    }

    /**
     * Force an element to be shown or hidden (including for screen readers)
     * with the use of .show and .hidden classes. These classes use !important
     * to avoid specificity conflicts, just like the quick floats. They are only
     * available for block level toggling.
     *
     * <pre>
     * {@code
     * <div class="show">...</div>
     * <div class="hidden">...</div>
     * }
     * </pre>
     */
    default TSelf Bhidden() {
        return CLASS("hidden");
    }

    /**
     * .invisible can be used to toggle only the visibility of an element,
     * meaning its display is not modified and the element can still affect the
     * flow of the document.
     *
     * <pre>
     * {@code
     * <div class="show">...</div>
     * <div class="hidden">...</div>
     * }
     * </pre>
     */
    default TSelf Binvisible() {
        return CLASS("invisible");
    }

    /**
     * Hide an element to all devices except screen readers with .sr-only.
     */
    default TSelf BsrOnly() {
        return CLASS("sr-only");
    }

    /**
     * Hide an element to all devices except screen reader and ensure that the
     * link becomes visible once focused (for sighted keyboard users). combines
     * {@code sr-only} and {@code sr-only-focusable}
     *
     * <pre>
     * {@code
     * html.a().BsrOnlyFocusable().HREF("#content").content("skip to main content")
     * }
     * </pre>
     */
    default TSelf BsrOnlyFocusable() {
        return CLASS("sr-only sr-only-focusable");
    }

    /**
     * Utilize the .text-hide class or mixin to help replace an element's text
     * content with a background image.
     *
     * <pre>
     * {@code
     * <h1 class="text-hide">Custom heading</h1>
     * }
     * </pre>
     */
    default TSelf BtextHide() {
        return CLASS("text-hide");
    }

    public class BVisibleBuilder1<T extends BootstrapCanvas<T>> {
        private T self;

        private BVisibleBuilder1(T self) {
            this.self = self;
        }

        public BVisibleBuilder2<T> xs() {
            return new BVisibleBuilder2<>(self, "xs");
        }

        public BVisibleBuilder2<T> sm() {
            return new BVisibleBuilder2<>(self, "sm");
        }

        public BVisibleBuilder2<T> md() {
            return new BVisibleBuilder2<>(self, "md");
        }

        public BVisibleBuilder2<T> lg() {
            return new BVisibleBuilder2<>(self, "lg");
        }
    }

    public class BVisibleBuilder2<T extends BootstrapCanvas<T>> {

        private T self;
        private String size;

        private BVisibleBuilder2(T self, String size) {
            this.self = self;
            this.size = size;
        }

        public T block() {
            return self.CLASS("visible-" + size + "-block");
        }

        public T inline() {
            return self.CLASS("visible-" + size + "-inline");
        }

        public T inlineBlock() {
            return self.CLASS("visible-" + size + "-inline-block");
        }

    }

    /**
     * Use a single or combination of the available visible-* and hidden-*
     * classes for toggling content across viewport breakpoints.
     *
     * <pre>
     * {@code
     * html.Bvisible().xs().block()...
     * }
     * </pre>
     */
    default BVisibleBuilder1<TSelf> Bvisible() {
        return new BVisibleBuilder1<TSelf>(self());
    }

    /**
     * Use a single or combination of the available visible-* and hidden-*
     * classes for toggling content across viewport breakpoints.
     */
    default TSelf BhiddenXs() {
        return CLASS("hidden-xs");
    }

    /**
     * Use a single or combination of the available visible-* and hidden-*
     * classes for toggling content across viewport breakpoints.
     */
    default TSelf BhiddenSm() {
        return CLASS("hidden-sm");
    }

    /**
     * Use a single or combination of the available visible-* and hidden-*
     * classes for toggling content across viewport breakpoints.
     */
    default TSelf BhiddenMd() {
        return CLASS("hidden-md");
    }

    /**
     * Use a single or combination of the available visible-* and hidden-*
     * classes for toggling content across viewport breakpoints.
     */
    default TSelf BhiddenLg() {
        return CLASS("hidden-lg");
    }

    /**
     * Similar to the regular responsive classes, use these for toggling content
     * for print.
     */
    default TSelf BvisiblePrintBlock() {
        return CLASS("visible-print-block");
    }

    /**
     * Similar to the regular responsive classes, use these for toggling content
     * for print.
     */
    default TSelf BvisiblePrintInline() {
        return CLASS("visible-print-inline");
    }

    /**
     * Similar to the regular responsive classes, use these for toggling content
     * for print.
     */
    default TSelf BvisiblePrintInlineBlock() {
        return CLASS("visible-print-inline-block");
    }

    /**
     * Similar to the regular responsive classes, use these for toggling content
     * for print.
     */
    default TSelf BhiddenPrint() {
        return CLASS("hidden-print");
    }

    enum B_PANEL_TYPE {
        DEFAULT, SUCESS, INFO, WARNING, DANGER
    }

    /**
     * Start a panel
     * 
     * <p>
     * <img src="doc-files/bPanel.png" />
     * 
     * <pre>
     *  {@code
     * <div class="panel panel-default">
     *   <div class="panel-heading">Panel heading without title</div>
     *   <div class="panel-body">
     *     Panel content
     *   </div>
     * </div>
     * }
     * </pre>
     */
    default TSelf bPanel() {
        return bPanel(B_PANEL_TYPE.DEFAULT);
    }

    /**
     * Start a panel
     * 
     * <p>
     * <img src="doc-files/bPanel.png" />
     * 
     * <pre>
     *  {@code
     * <div class="panel panel-default">
     *   <div class="panel-heading">Panel heading without title</div>
     *   <div class="panel-body">
     *     Panel content
     *   </div>
     * </div>
     * }
     * </pre>
     */
    default TSelf bPanel(B_PANEL_TYPE type) {
        return tag("div", "bPanel").CLASS("panel panel-" + type.toString().toLowerCase());
    }

    default TSelf _bPanel() {
        return close("bPanel");
    }

    default TSelf bPanelHeading() {
        return tag("div", "bPanelHeading").CLASS("panel-heading");
    }

    default TSelf _bPanelHeading() {
        return close("bPanelHeading");
    }

    default TSelf bPanelBody() {
        return tag("div", "bPanelBody").CLASS("panel-body");
    }

    default TSelf _bPanelBody() {
        return close("bPanelBody");
    }

    /**
     * <pre>
     *  {@code
      <div class="panel panel-default">
    <div class="panel-heading">
     <h3 class="panel-title">Panel title</h3>
    </div>
    <div class="panel-body">
     Panel content
    </div>
    </div>
     * }
     * </pre>
     */
    default TSelf BpanelTitle() {
        return CLASS("panel-title");
    }
}
