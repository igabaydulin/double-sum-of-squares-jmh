package com.github.igabaydulin.jmh.samples.math;

public class ExponentiationFirstCalculator implements DoubleSumOfSquaresCalculator {

    /**
     * i * i * 2 instead of 2 * i * i is used
     *
     * @see MultiplicationByTwoFirstCalculator#calculate(int)
     */
    public int calculate(int count) {
        int n = 0;
        for (int i = 0; i <= count; i++) {
            n += i * i * 2;
        }

        return n;
    }
}
