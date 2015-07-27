package com.github.ruediste.rendersnakeXT.benchmark.rendersnakeXT;

import java.io.IOException;
import java.io.StringWriter;

import org.junit.Test;

public class Dump {
    public static void main(String[] args) throws IOException {
        new Dump().dump();
    }

    @Test
    public void dump() {
        StringWriter sw = new StringWriter();
        BenchmarkCanvas html = new BenchmarkCanvas(sw);
        html.render(HomePage.INSTANCE);
        System.out.println(sw.toString());
    }
}
