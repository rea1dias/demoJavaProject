package SwitchOperators;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        // Задача 4
        // Калькулятор: Программа выполняет математическую операцию (+, -, *, /) над двумя числами, введенными пользователем.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите арифметическое уровнение: ");
        char operator = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Нельзя делить число на ноль");
                }
            default:
                System.out.println("Недопустимое значение");
                return;
        }
        System.out.println("Результат: " + result);
    }
}
