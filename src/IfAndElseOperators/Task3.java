package IfAndElseOperators;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //Задача 3: Определение наибольшего из двух чисел
        //Напишите программу, которая находит большее из двух введенных чисел.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Первое число больше второго");
        } else if (number1 < number2) {
            System.out.println("Второе число больше первого");
        } else {
            System.out.println("Числа равные");
        }

    }
}
