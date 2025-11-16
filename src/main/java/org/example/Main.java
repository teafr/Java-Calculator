package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0, b = 0;

        try {
            System.out.print("Введіть перше число: ");
            a = Double.parseDouble(scanner.nextLine());

            System.out.print("Введіть друге число: ");
            b = Double.parseDouble(scanner.nextLine());

            System.out.print("Введіть операцію (+, -, *, /, sqrt): ");
            String operation = scanner.nextLine();

            processOperation(operation, a, b);

        } catch (ArithmeticException ex) {
            System.out.println("Арифметична помилка: " + ex.getMessage());
        } catch (InvalidInputException ex) {
            System.out.println("Помилка вхідних даних: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Помилка: введене значення не є числом.");
        } catch (Exception ex) {
            System.out.println("Інша помилка: " + ex.getMessage());
        } finally {
            System.out.println("Обробка запиту завершена.");
            scanner.close();
        }
    }

    public static void processOperation(String operation, double a, double b)
            throws ArithmeticException, InvalidInputException
    {
        double result;
        switch (operation) {
            case "+":
                result = Calculator.add(a, b);
                printResult(result);
                break;
            case "-":
                result = Calculator.subtract(a, b);
                printResult(result);
                break;
            case "*":
                result = Calculator.multiply(a, b);
                printResult(result);
                break;
            case "/":
                result = Calculator.divide(a, b);
                printResult(result);
                break;
            case "sqrt":
                result = Calculator.sqrt(a);
                System.out.println("Корінь квадратний з " + a + " = " + result);
                break;
            default:
                System.out.println("Неправильна операція.");
        }
    }

    public static void printResult(double result) {
        System.out.println("Результат: " + result);
    }
}