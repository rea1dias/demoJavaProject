package IfAndElseOperators;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        //Задача 4: Определение оценки
        //Напишите программу, которая принимает оценку (от 0 до 100) и выводит соответствующий ей уровень: A, B, C, D или F.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вашу оценку: ");
        int grade = scanner.nextInt();

        if (grade >= 80 && grade <= 100) {
            System.out.println("Уровень является - A");
        } else if (grade >= 60 && grade < 80) {
            System.out.println("Уровень является - B");
        } else if (grade >= 40 && grade < 60) {
            System.out.println("Уровень является - С");
        } else if (grade >= 20 && grade <= 0) {
            System.out.println("Уровень является - D");
        } else {
            System.out.println("Оценка неверная");
        }

    }
}
