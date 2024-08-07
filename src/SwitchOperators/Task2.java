package SwitchOperators;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // Задача 2
        // Оценка буквой: Программа принимает оценку (A, B, C, D, F) и выводит описание оценки.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу оценку: ");
        String grade = scanner.next();

        String RatingofGrade;

        switch (grade) {

            case "A":
                System.out.println("Отлично");
                break;
            case "B":
                System.out.println("Хорошо");
                break;
            case "C":
                System.out.println("Удовлетворительно");
                break;
            case "D":
                System.out.println("Плохо");
                break;

            default:
                System.out.println("Оценка неправильная");
                break;

        }
    }
}
