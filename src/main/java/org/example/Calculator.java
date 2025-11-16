package org.example;

public class Calculator {
    private Calculator() {}

    public static double add(double a, double b) throws InvalidInputException {
        return a + b;
    }

    public static double subtract(double a, double b) throws InvalidInputException {
        return a - b;
    }

    public static double multiply(double a, double b) throws InvalidInputException {
        return a * b;
    }

    public static double divide(double a, double b) throws ArithmeticException, InvalidInputException {
        if (b == 0.0) {
            throw new ArithmeticException("Не можна ділити на нуль!");
        }
        return a / b;
    }

    public static double sqrt(double a) throws InvalidInputException {
        if (a < 0) {
            throw new InvalidInputException("Не можна обчислити корінь квадратний з від’ємного числа!");
        }
        return Math.sqrt(a);
    }
}