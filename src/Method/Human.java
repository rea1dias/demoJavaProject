package Method;



public class Human {

    String name;
    Car car;
    BankAccount bA;

    void info() {

    }


}

class HumanTest {

    public static void main(String[] args) {

        Car car = new Car("Зеленый", "V8");
        BankAccount bank = new BankAccount(29371,567862);

        System.out.println(car.color);



    }
}
class Car {

    Car(String carColor,String carEngine) {
        color = carColor;
        engine = carEngine;
    }

    String color;
    String engine;

}
class BankAccount {


    BankAccount(int bankId, int bankBalance) {
        id = bankId;
        balance = bankBalance;

    }
    int id;
    double balance;


}
