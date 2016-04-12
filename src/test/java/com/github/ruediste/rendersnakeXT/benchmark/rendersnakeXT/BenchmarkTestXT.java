package com.github.ruediste.rendersnakeXT.benchmark.rendersnakeXT;

import java.io.IOException;

import com.google.common.base.Stopwatch;

public class BenchmarkTestXT {
    public void performBenchmark(int warmPages, int benchPages) throws Exception {
        System.out.println("Warming up ...");
        this.buildPage(warmPages);
        System.out.println("Running benchmark ...");
        Stopwatch watch = Stopwatch.createStarted();
        long writtenChars = buildPage(benchPages);
        watch.stop();
        System.out.println("Rendersnake XT: Executed in " + watch + ", written " + writtenChars + " chars.");
    }

    public long buildPage(int howMany) throws IOException {
        NoWriter sink = new NoWriter();
        for (int t = 0; t < howMany; t++) {
            BenchmarkCanvas c = new BenchmarkCanvas(sink);
            c.render(HomePage.INSTANCE);
        }
        return sink.written;
    }

    public void foo() {
        BenchmarkCanvas html = new BenchmarkCanvas(null);

        //@formatter:off
        html.div().DATA("role","fieldcontain")
        .fieldset().DATA("role","controlgroup").DATA("type","horizontal")
            .legend().content("Method")
            .input().TYPE("radio").NAME("method").ID("radio-get").VALUE("method-get").CHECKED().ONCHANGE("clickedMethod(this.value);")
            .label().FOR("radio-get").content("GET")

            .input().TYPE("radio").NAME("method").ID("radio-post").VALUE("method-post").CHECKED().ONCHANGE("clickedMethod(this.value);")
            .label().FOR("radio-post").content("POST")
            
            .input().TYPE("radio").NAME("method").ID("radio-put").VALUE("method-put").CHECKED().ONCHANGE("clickedMethod(this.value);")
            .label().FOR("radio-put").content("PUT")
            
            .input().TYPE("radio").NAME("method").ID("radio-delete").VALUE("method-delete").CHECKED().ONCHANGE("clickedMethod(this.value);")
            .label().FOR("radio-delete").content("DELETE")
        ._fieldset()
        ._div();
    }
}
