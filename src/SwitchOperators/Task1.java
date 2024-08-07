package SwitchOperators;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //Задача 1
        //Определение дня недели: Напишите программу, которая принимает число от 1 до 7 и выводит соответствующий день недели (1 - Понедельник, 2 - Вторник и т.д.).


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день: ");
        int day = scanner.nextInt();

        switch (day) {

            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;

            default:
                System.out.println("Число не является днем");
                break;
        }


    }
}
