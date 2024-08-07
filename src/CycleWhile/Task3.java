package CycleWhile;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        // Задача 3: Поиск факториала числа
        // Напишите программу, которая вычисляет факториал заданного числа.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для факториала: ");
        int number = scanner.nextInt();

        long factorial = 1;
        int i = 1;

        while (i <= number) {
            factorial*=i;
            i++;
        }

        System.out.println(factorial);

        scanner.close();

    }
}
