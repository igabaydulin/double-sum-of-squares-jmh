package com.github.igabaydulin.jmh.samples.math;

public class MultiplicationByTwoFirstCalculator implements DoubleSumOfSquaresCalculator {

    public int calculate(int count) {
        int n = 0;
        for (int i = 0; i <= count; i++) {
            n += 2 * i * i;
        }

        return n;
    }
}
