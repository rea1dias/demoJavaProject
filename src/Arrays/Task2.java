package Arrays;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        // Задача 2: Максимальный элемент массива
        // Напишите программу, которая находит максимальный элемент в массиве целых чисел.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");

        int size = scanner.nextInt();
        int array[] = new int[size];

        System.out.println("Введите числа для массива: ");

        for (int i = 0; i < size; i++) {
            System.out.println("Элементы: " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Элементы: " + array[i]);
        }

        int max = array[0];

        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Максимальный элемент массива: " + max);





    }
}
