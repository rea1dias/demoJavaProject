package Lesson_3;

import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        boolean isAdult = age >= 18;

        if (isAdult == true) {
            System.out.println("Вы являетесь совершеннолетним");
        } else {
            System.out.println("Вы не являетесь совершеннолетним");
        }





    }
}
