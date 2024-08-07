package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        // Задача 8 Удаление дубликатов из массива.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();

        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Элемент: " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));
















    }
}
