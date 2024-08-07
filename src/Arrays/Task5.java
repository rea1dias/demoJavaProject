package Arrays;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        // Задача 5 Поиск элемента в массиве
        // Напишите программу, которая проверяет, содержится ли заданное число в массиве.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();

        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Элементы: " + (i + 1) + ": ");
            array[i] = scanner.nextInt();

        }

        System.out.println("Введите число которую будем искать в массиве: ");
        int number = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            if (array[i] == number) {
                System.out.println("Данное число " + number + " равно " + array[i]);
            } else {
                System.out.println("Нет равных чисел. ");
            }
        }






    }
}
