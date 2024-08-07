package SwitchOperators;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        // Задача 3
        //Сезон года: Программа принимает номер месяца (от 1 до 12) и выводит соответствующий сезон года.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число месяца: ");

        int month = scanner.nextInt();
        String season;

        switch(month) {
            case 1:
                season = "Январь";
                break;
            case 2:
                season = "Февраль";
                break;
            case 3:
                season = "Март";
                break;
            case 4:
                season = "Апрель";
                break;
            case 5:
                season = "Май";
                break;
            case 6:
                season = "Июнь";
                break;
            case 7:
                season = "Июль";
                break;
            case 8:
                season = "Август";
                break;
            case 9:
                season = "Сентябрь";
                break;
            case 10:
                season = "Октябрь";
                break;
            case 11:
                season = "Ноябрь";
                break;
            case 12:
                season = "Декабрь";
                break;
            default:
                System.out.println("Неправильное значение");
                return;
        }
        System.out.println("Месяц: " + season);
    }
}
