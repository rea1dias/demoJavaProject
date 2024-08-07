package SwitchOperators;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        // Задача 6
        // Определение длины месяца: Программа принимает номер месяца и год и выводит количество дней в этом месяце.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число месяца: ");
        int month = scanner.nextInt();
        int amount;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                amount = 31;
                break;
            case 2:
                amount = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                amount = 30;
                break;
            default:
                System.out.println("Недоступимое значение");
                return;
        }
        System.out.println("Количество дней: " + amount);

    }
}
