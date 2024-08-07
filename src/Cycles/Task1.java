package Cycles;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // Задача 1
        // Определение длины месяца: Программа принимает номер месяца и год и выводит количество дней в этом месяце.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

    }
}
