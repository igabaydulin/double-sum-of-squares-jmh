package com.github.igabaydulin.jmh.samples.math;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.infra.Blackhole;

import static com.github.igabaydulin.jmh.samples.math.utils.ConstantStorage.COUNT;

public class MultiplicationByTwoFirstCalculatorBenchmark {

    @org.openjdk.jmh.annotations.State(Scope.Thread)
    public static class State implements com.github.igabaydulin.jmh.samples.math.state.State {

        private DoubleSumOfSquaresCalculator calculator = new MultiplicationByTwoFirstCalculator();

        public int calculate(int count) {
            return calculator.calculate(count);
        }
    }

    @Benchmark
    public void calculate(State state, Blackhole blackhole) {
        blackhole.consume(state.calculate(COUNT));
    }
}
