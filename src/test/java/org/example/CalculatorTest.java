package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() throws InvalidInputException {
        assertEquals(5.0, Calculator.add(2, 3));
        assertEquals(0.0, Calculator.add(0, 0));
    }

    @Test
    void testSubtraction() throws InvalidInputException {
        assertEquals(-1.0, Calculator.subtract(2, 3));
    }

    @Test
    void testMultiplication() throws InvalidInputException {
        assertEquals(6.0, Calculator.multiply(2, 3));
        assertEquals(0.0, Calculator.multiply(0, 5));
    }

    @Test
    void testDivisionByZero() throws InvalidInputException {
        ArithmeticException ex = assertThrows(ArithmeticException.class, () -> Calculator.divide(2, 0));
        assertEquals("Не можна ділити на нуль!", ex.getMessage());
    }

    @Test
    void testDivision() throws InvalidInputException {
        assertEquals(2.0, Calculator.divide(6, 3));
    }

    @Test
    void testSqrtNegative() {
        InvalidInputException ex = assertThrows(InvalidInputException.class, () -> Calculator.sqrt(-1));
        assertEquals("Не можна обчислити корінь квадратний з від’ємного числа!", ex.getMessage());
    }

    @Test
    void testSqrtValid() throws InvalidInputException {
        assertEquals(2.0, Calculator.sqrt(4));
    }
}