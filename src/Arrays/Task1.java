package Arrays;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        // Задача 1: Сумма элементов массива
        // Напишите программу, которая вычисляет сумму всех элементов в массиве целых чисел.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер для данного массива: ");
        int size = scanner.nextInt();

        int array[] = new int[size];

        System.out.println("Введите числа для массива: ");
        for (int i = 0; i < size; i++) {
            System.out.print("Элементы " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Введенный массив: " + array[i]);
        }











    }
}
