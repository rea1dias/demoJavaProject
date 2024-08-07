package Lesson_3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test_3 {
    public static void main(String[] args) {

        Scanner computer = new Scanner(System.in);
        int number = computer.nextInt();

        System.out.println("Number: ");

        boolean isEven = number % 2 == 0;

        if(isEven == false) {
            System.out.println("Данное число нечетное");
        }
        else {
            System.out.println("Данное число четное");
        }
    }
}
