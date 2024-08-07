package IfAndElseOperators;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        //Задача 5: Проверка возраста для голосования
        //Напишите программу, которая проверяет, имеет ли человек право голосовать (возраст должен быть 18 лет или старше).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Вы являетесь совершеннолетним");
        } else if (age < 18) {
            System.out.println("Вы являетесь несовершеннолетним");
        } else {
            System.out.println("Возврат неправильный");
        }


    }
}
