package com.github.igabaydulin.jmh.samples.math;

public interface DoubleSumOfSquaresCalculator {

    /**
     * Returns the doubled sum of squares for consecutive positive integers.
     * For example the doubled sum of squares for first 3 positive integers will be:
     * <p>
     * 2 * (1 ^ 2 + 2 ^ 2 + 3 ^ 3) = 28
     *
     * @param count total amount of consecutive positive integers
     * @return doubled sum of squares
     */
    int calculate(int count);
}
