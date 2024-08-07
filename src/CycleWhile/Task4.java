package CycleWhile;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

//        Написать программу, которая печатает все числа от 1 до 10.
//        Написать программу, которая печатает все чётные числа от 2 до 20.
//        Написать программу, которая печатает таблицу умножения для числа 5.
//        Написать программу, которая суммирует числа от 1 до 100.
//        Написать программу, которая печатает все числа от 10 до 1 в обратном порядке.
//        Написать программу, которая находит факториал числа 5.
//        Написать программу, которая находит сумму цифр числа.
//        Написать программу, которая проверяет, является ли заданное число простым.
//        Написать программу, которая печатает первые 10 чисел последовательности Фибоначчи.
//        Написать программу, которая проверяет, является ли заданное число простым
//        Написать программу, которая находит НОД (наибольший общий делитель) двух чисел, введённых пользователем.

        NumsFrom2to20();

    }


    public static void SumFrom1to20() {

//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + " ");
//        }

        int number = 1;
        while(number <=10) {
            System.out.print(number + " ");
            number++;
        }

    }

    public static void NumsFrom2to20() {

        int number = 2;
        while(number <= 20) {
            System.out.print(number + " ");
            number += 2;
        }
    }

    public static void MultiTableOf5() {

        int number = 1;

        while (number <= 10) {
            System.out.println(number + " * " + "5 = " + (number * 5));
            number++;
        }

    }

    public static void SumOf1to100() {

        int number = 1;
        int sum = 0;

        while(number <= 100) {
            sum += number;
            number++;
        }

        System.out.println("Сумма чисел 1 до 100: " + sum);

    }

    public static void ReverseFrom10to1() {

        int number = 10;

        while (number >= 1) {
            System.out.print(number + " ");
            number--;
        }
    }


    public static void FactorialOf5() {

        int i = 1;
        int factorial = 1;

        while (i <= 5) {
            factorial *= i;
            i++;
        }
        System.out.println("Факториал: " + factorial);
    }

    public static void SumOfDigits() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("Сумма цифр числа: " + sum);

    }

    public static void SumOfOddNum() {

        int evennum = 0;
        int oddnum = 0;
        int sum = 0;

        for (int i = 0; i <= 50; i++) {
            if (i / 2 == 0) {
                sum += evennum;
            } else {
                sum += oddnum;
            }
        }

        System.out.println("Сумма всех четных чисел: " + evennum);
        System.out.println("Сумма всеъ нечетных чисел: " + oddnum);

    }

    public static void CommonDivisor() {

    }
}
