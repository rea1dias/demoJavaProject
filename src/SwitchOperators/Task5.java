package SwitchOperators;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        // Задача 5
        // Тип дня недели: Программа принимает день недели и выводит тип дня ("Рабочий", "Выходной")

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день недели: ");
        String day = scanner.next();
        String typeOfDay = "Недоступимое значение: ";

        switch (day) {
            case "Понедельник":
            case "Вторник":
            case "Среда":
            case "Четверг":
            case "Пятница":
                typeOfDay = "Рабочий день";
                break;
            case "Суббота":
            case "Воскресенье":
                typeOfDay = "Выходной день";
                break;
            default:
                System.out.println("Недоступимое значение");
                break;
        }
        System.out.println("Тип недели: " + typeOfDay);
    }
}
