package CycleWhile;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(10);

        System.out.println("Компьютер загадал число от 1 до 9 (включительно)");

        while (true) {
            System.out.println("Угадайте число");
            int aiNumber = scanner.nextInt();

            if (randomNum == aiNumber) {
                System.out.println("Вы угадали, молодцы!");
                break;
            } else {
                System.out.println("Неверно");
            }
        }






    }
}
