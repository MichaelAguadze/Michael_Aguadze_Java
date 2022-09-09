package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void shouldDividePositives() {
        assertEquals(3, calc.divide(6, 2));
        assertEquals(2, calc.divide(80, 39));
        assertEquals(1, calc.divide(105, 100));

    }

    @Test
    public void shouldDivideNegatives() {

        assertEquals(3, calc.divide(-6, -2));
        assertEquals(2, calc.divide(-80, -39));
        assertEquals(1, calc.divide(-105, -100));
    }

    @Test
    public void shouldDivideBothPosAndNeg() {
        assertEquals(-3, calc.divide(6, -2));
        assertEquals(-2, calc.divide(-80, 39));
        assertEquals(-1, calc.divide(105, -100));
    }

    @Test
    public void shouldReturnZeroDivide() {
        assertEquals(0, calc.divide(0, 0));
        assertEquals(0, calc.divide(0, 1));
        assertEquals(0, calc.divide(105, 0));
    }


    @Test
    public void shouldMultiplyPositives() {
        assertEquals(36, calc.multiply(4, 9));
        assertEquals(588, calc.multiply(49, 12));
        assertEquals(72102, calc.multiply(394, 183));
    }

    @Test
    public void shouldMultiplyNegatives() {
        assertEquals(8, calc.multiply(-2, -4));
        assertEquals(980, calc.multiply(-49, -20));
        assertEquals(98328, calc.multiply(204, 482));
    }

    @Test
    public void shouldMultiplyPosAndNeg() {
        assertEquals(-40, calc.multiply(5, -8));
        assertEquals(-4860, calc.multiply(-54, 90));
        assertEquals(-504336, calc.multiply(948, -532));
    }

    @Test
    public void shouldReturnZeroMultiply() {
        assertEquals(0, calc.multiply(0, 0));
        assertEquals(0, calc.multiply(0, 1));
        assertEquals(0, calc.multiply(105, 0));
    }

    @Test
    public void shouldAddPositives() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(63, calc.add(43, 20));
        assertEquals(822, calc.add(239, 583));

    }

    @Test
    public void shouldAddNegatives() {
        assertEquals(-6, calc.add(-4, -2));
        assertEquals(-150, calc.add(-58, -92));
        assertEquals(-1227, calc.add(-942, -285));
    }

    @Test
    public void shouldAddPosAndNeg() {
        assertEquals(4, calc.add(-2, 6));
        assertEquals(70, calc.add(94, -24));
        assertEquals(663, calc.add(-280, 943));
    }

    @Test
    public void shouldSubtractPositives() {
        assertEquals(-1, calc.subtract(2, 3));
        assertEquals(23, calc.subtract(43, 20));
        assertEquals(400, calc.subtract(983, 583));

    }

    @Test
    public void shouldSubtractNegatives() {
        assertEquals(-2, calc.subtract(-4, -2));
        assertEquals(34, calc.subtract(-58, -92));
        assertEquals(-657, calc.subtract(-942, -285));
    }

    @Test
    public void shouldSubtractPosAndNeg() {
        assertEquals(-8, calc.subtract(-2, 6));
        assertEquals(118, calc.subtract(94, -24));
        assertEquals(-1223, calc.subtract(-280, 943));

    }
}
