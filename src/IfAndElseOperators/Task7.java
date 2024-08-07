package IfAndElseOperators;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        //Задача 7: Определение времени суток
        //Напишите программу, которая принимает на вход время (в часах) и определяет, какое это время суток (утро, день, вечер или ночь).


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время: ");
        int time = scanner.nextInt();

        if (time >= 0 && time < 6) {
            System.out.println("Сейчас ночь");
        } else if (time >= 6 && time < 12) {
            System.out.println("Сейчас утро");
        } else if (time >= 12 && time < 18) {
            System.out.println("Сейчас обед");
        } else if (time >= 18 && time < 24) {
            System.out.println("Сейчас ночь");
        } else {
            System.out.println("Неверное время");
        }

    }
}
