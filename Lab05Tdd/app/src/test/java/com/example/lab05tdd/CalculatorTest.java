package com.example.lab05tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {

    private Calculator calculator;
    private static final double DELTA = 0.0001;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void add_twoPositiveNumbers_returnsSum() {
        assertEquals(7.5, calculator.add(3.2, 4.3), DELTA);
    }

    @Test
    public void subtract_twoNumbers_returnsDifference() {
        assertEquals(1.5, calculator.subtract(5.0, 3.5), DELTA);
    }

    @Test
    public void multiply_twoNumbers_returnsProduct() {
        assertEquals(12.0, calculator.multiply(3.0, 4.0), DELTA);
    }

    @Test
    public void divide_twoNumbers_returnsQuotient() {
        assertEquals(2.5, calculator.divide(5.0, 2.0), DELTA);
    }

    @Test
    public void divide_byZero_throwsArithmeticException() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5.0, 0.0));
    }
}
