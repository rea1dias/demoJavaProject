package IfAndElseOperators;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Задача 2: Положительное, отрицательное или ноль
        //Напишите программу, которая определяет, является ли введенное число положительным, отрицательным или нулем.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Данное число является положительным");
        } else if (number < 0) {
            System.out.println("Данное число является отрицательным");
        } else {
            System.out.println("Данное число является нулем");
        }
    }
}
