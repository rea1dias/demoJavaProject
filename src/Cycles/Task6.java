package Cycles;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        // Задача 7
        // Сумма четных чисел
        // Напишите программу, которая принимает положительное целое число n и вычисляет сумму всех четных чисел от 1 до n.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Число отрицательное");
        }


        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }




    }
}
