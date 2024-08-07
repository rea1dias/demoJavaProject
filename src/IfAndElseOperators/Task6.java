package IfAndElseOperators;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        //Задача 6: Проверка делимости
        //Напишите программу, которая проверяет, делится ли одно число на другое без остатка.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        if (num1 % num2 == 0) {
            System.out.println("Данные числа делятся без остатка");
        } else {
            System.out.println("Данные числа делятся с остатком");
        }
    }
}
