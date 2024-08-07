package OOP;

public class Task1 {

    public static void main(String[] args) {

        Employee user1 = new Employee();
        Workforce user2 = new Workforce();


        System.out.println(user1.id);
        System.out.println(user2.name);


    }


}

class Employee {

    int id = 65;
    String name;
    double balance;

}

class Workforce {

    int id = 95;
    String name = "Dias";
    double balancel;
}
