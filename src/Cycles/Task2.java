package Cycles;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // Задача 2
        // Факториал числа:
        //Напишите программу, которая принимает положительное целое число n и вычисляет его факториал (n!).

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Данное значение недопустимое: ");
        }

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Факториал " + n + " равен " + factorial);

    }
}
