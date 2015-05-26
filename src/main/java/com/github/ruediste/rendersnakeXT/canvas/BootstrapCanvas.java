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
			if (size < 1 || size > 12)
				throw new RuntimeException(
						"size has to be between 1 and 12, but was " + size);
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
}
