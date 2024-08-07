package Arrays;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {


        // Задача 3 Среднее значение массива
        // Напишите программу, которая вычисляет среднее значение элементов массива.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();

        int array[] = new int[size];

        System.out.println("Введите числа для массива: ");

        for (int i = 0; i < size; i++) {
            System.out.println("Элементы: " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += array[i];
            }

        double avgSum = (double) sum / size;

        System.out.println("Авг: " + avgSum);




        }


}
