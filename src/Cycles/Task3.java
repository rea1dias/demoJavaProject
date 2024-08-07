package Cycles;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        // Задача 3
        // Вывод таблицы умножения:
        // Напишите программу, которая принимает число и выводит таблицу умножения для этого числа.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число для умножение: ");
        int number = scanner.nextInt();

        System.out.println("Таблица для умножения: " + number);


        for (int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
