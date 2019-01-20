package com.github.igabaydulin.jmh.samples.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationByTwoFirstCalculatorTest {

    private DoubleSumOfSquaresCalculator calculator = new MultiplicationByTwoFirstCalculator();

    @Test
    void calculate_simple() {
        assertEquals(28, calculator.calculate(3));
    }


    @Test
    void calculate_zero_should_return_zero() {
        assertEquals(0, calculator.calculate(0));
    }

    @Test
    void calculate_one_should_return_two() {
        assertEquals(2, calculator.calculate(1));
    }

    @Test
    void calculate_10_should_return_100() {
        assertEquals(770, calculator.calculate(10));
    }

    @Test
    void calculate_10000_should_return_1046739120() {
        assertEquals(1046739120, calculator.calculate(10000));
    }
}
