package com.github.ruediste.rendersnakeXT.canvas;

import java.util.function.Consumer;

public interface BootstrapCanvasComponents<TSelf extends BootstrapCanvas<TSelf>>
        extends Html5Canvas<TSelf> {

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
         * padding to the top of the &lt;body&gt;. Try out your own values or
         * use our snippet below. Tip: By default, the navbar is 50px high.
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
         * padding to the top of the &lt;body&gt;. Try out your own values or
         * use our snippet below. Tip: By default, the navbar is 50px high.
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
     * {@link BootstrapCanvasComponents#bNavbar(String, Consumer, Runnable, Runnable)}
     * to render the brand.
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
            self().bContainer_fluid()
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
     * an &lt;ul&gt; containing normal navbar content
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
     * Add the .navbar-btn class to &lt;button&gt; elements not residing in a
     * &lt;form&gt; to vertically center them in the navbar.
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

}
