package com.github.ruediste.rendersnakeXT.canvas;

import static org.junit.Assert.assertEquals;

import java.io.StringWriter;

import org.junit.Before;
import org.junit.Test;

public class BootstrapCanvasTest {

    private static class Canvas extends HtmlCanvasBase<Canvas> implements
            BootstrapCanvas<Canvas> {

        @Override
        public Canvas self() {
            return this;
        }

    }

    Canvas canvas;
    StringWriter writer;

    @Before
    public void before() {
        writer = new StringWriter();
        canvas = new Canvas();
        canvas.initialize(writer);
    }

    @Test
    public void container() {
        canvas.bContainer()._bContainer();
        expect("<div class=\"container\"></div>");
    }

    @Test
    public void row() {
        canvas.bRow().close();
        expect("<div class=\"row\"></div>");
    }

    @Test
    public void col() {
        canvas.bCol(x -> x.lgOffset(5).lg(7))._bCol();
        expect("<div class=\"col-lg-offset-5 col-lg-7\"></div>");
    }

    private void expect(String str) {
        assertEquals(str, writer.toString());
    }

    @Test
    public void testB_TEXT_NOWRAP() throws Exception {
        canvas.p().BtextCenter().content("foo");
        expect("<p class=\"text-center\">foo</p>");
    }

    @Test
    public void testBTable() throws Exception {
        canvas.bTable(x -> x.hover())._bTable();
        expect("<table class=\"table table-hover\"></table>");
    }

    @Test
    public void testBImg() throws Exception {
        canvas.bImg(x -> x.circle())._bImg();
        expect("<img class=\"img-circle\"></img>");
    }

    @Test
    public void testBCloseIcon() throws Exception {
        canvas.bCloseIcon();
        expect("<button type=\"button\" aria-label=\"Close\" class=\"close\"><span aria-hidden=\"true\">&times;</span></button>");
    }
}
