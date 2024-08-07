package Arrays;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        // Задача 4 Обратный порядок элементов массива
        // Напишите программу, которая выводит элементы массива в обратном порядке.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();

        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Элементы: " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Элементы в обратном порядке: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }




    }
}
