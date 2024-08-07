package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {


        // Задача 6 Сортировка массива

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер для массива: ");
        int size = scanner.nextInt();

        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Элементы: " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Сортированный массив: ");
        for (int i : array) {
            System.out.print(i + " ");
        }


    }

}
