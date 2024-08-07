package IfAndElseOperators;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // Задача 1: Четное или нечетное число
        //Напишите программу, которая проверяет, является ли введенное число четным или нечетным.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Данное число является четным");
        } else {
            System.out.println("Данное число является нечетным");
        }
    }
}
