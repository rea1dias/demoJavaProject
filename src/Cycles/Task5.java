package Cycles;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {


        // Задача 6. Обратный порядок
        // Напишите программу, которая принимает положительное целое число n и выводит числа от n до 1.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("Число равен: " + num);
        } else {
            System.out.println("Число не положительное.");
        }

        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }




    }
}
