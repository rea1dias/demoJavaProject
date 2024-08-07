package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {


        // Задача 9. Обратный порядок массива
        // Переверните массив и выведите его в обратном порядке.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();

        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Элемент: " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        reverseArray(array);

        System.out.println("Элементы в обратном порядке: ");

        for (int i : array) {
            System.out.println(i + " ");
        }
    }

    public static void reverseArray(int[] array) {

        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;

        }

    }
}
