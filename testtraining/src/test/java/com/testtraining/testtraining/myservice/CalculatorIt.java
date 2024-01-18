package com.testtraining.testtraining.myservice;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorIt {

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 3);
        assertEquals(7, result);
    }

    @Test
    public void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 4);
        assertEquals(20, result);
    }

    @Test
    public void testDivision() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(15, 3);
        assertEquals(5, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Calculator calculator = new Calculator();
        calculator.divide(10, 0);
    }
}
