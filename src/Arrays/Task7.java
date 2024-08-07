package Arrays;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        // Задача 7 Подсчет количества положительных, отрицательных и нулевых элементов в массиве.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();

        int array[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Элемент: " + (i + 1) + " ");
            array[i] = scanner.nextInt();
        }

        int positiveNum = 0;
        int negativeNum = 0;
        int zeroNum = 0;

        for (int i : array) {
            if (i > 0) {
                positiveNum++;
            } else if (i < 0) {
                negativeNum++;
            } else {
                zeroNum++;
            }
        }

        System.out.println("Количество положительных элементов: " + positiveNum);
        System.out.println("Количество отрицательных элементов: " + negativeNum);
        System.out.println("Количество нулей в массиве: " + zeroNum);

    }
}
