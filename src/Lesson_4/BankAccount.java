package Lesson_4;

public class BankAccount {

    int id;
    String name;
    double balance;

}

class BankAccountTest {

    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();


        MyAccount.id = 1;
        MyAccount.name = "Dias";
        MyAccount.balance = 1000.0;


        System.out.println(MyAccount.name);
        System.out.println(YourAccount.name);
    }

}

