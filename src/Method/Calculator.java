package Method;

import java.util.Scanner;

public class Calculator {

    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможна!");
        }
        double result = a / b;
        return result;
    }


    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();

        System.out.println("Введите операцию: ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("Результат: " + calculator.add(number1, number2));
                break;
            case '-':
                System.out.println("Результат: " + calculator.subtract(number1, number2));
                break;
            case '*':
                System.out.println("Результат: " + calculator.multiply(number1, number2));
                break;
            case '/':
                try {
                    System.out.println("Результат: " + calculator.divide(number1, number2));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Неверная операция.");
        }
        scanner.close();


    }




}
