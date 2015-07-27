package com.github.ruediste.rendersnakeXT.benchmark.rendersnake;

import java.io.IOException;

import org.rendersnake.HtmlCanvas;

import com.google.common.base.Stopwatch;

public class BenchmarkTest {

    public static void main(String[] args) throws Exception {
        new BenchmarkTest().performBenchmark(1000, 1000000);
    }

    public void performBenchmark(int warmPages, int benchPages)
            throws Exception {
        System.out.println("Warming up ...");
        buildPage(warmPages);
        System.out.println("Running benchmark ...");
        Stopwatch watch = Stopwatch.createStarted();
        long chars = buildPage(benchPages);
        watch.stop();
        System.out.println("Rendersnake: Executed in " + watch + ", written "
                + chars + " chars.");
    }

    public long buildPage(int howMany) throws IOException {
        NoWriter sink = new NoWriter();
        for (int t = 0; t < howMany; t++) {
            HtmlCanvas c = new HtmlCanvas(sink);
            c.render(HomePage.INSTANCE);
        }
        return sink.written;
    }
}
