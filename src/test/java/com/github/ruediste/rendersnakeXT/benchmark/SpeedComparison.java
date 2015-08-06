package com.github.ruediste.rendersnakeXT.benchmark;

import org.junit.Ignore;
import org.junit.Test;

import com.github.ruediste.rendersnakeXT.benchmark.rendersnake.BenchmarkTest;
import com.github.ruediste.rendersnakeXT.benchmark.rendersnakeXT.BenchmarkTestXT;

public class SpeedComparison {
    static final int WARM_PAGES = 1000;
    static final int BENCH_PAGES = 1000000;

    @Test
    @Ignore("Speed Test")
    public void runBenchmarks() throws Exception {
        Thread.sleep(10 * 1000);
        new BenchmarkTest().performBenchmark(WARM_PAGES, BENCH_PAGES);
        new BenchmarkTestXT().performBenchmark(WARM_PAGES, BENCH_PAGES);
    }
}
