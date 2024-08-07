package OOP;

public class Task3 {

    public static void main(String[] args) {

        Person person1 = new Person();

        person1.setName("");
        person1.setAge(21);
        person1.speak();

    }
}

class Person {

    String name;
    int age;

    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("Пустые данные");
        } else {
            name = username;
        }
    }
    public String getName() {
        return name;
    }

    public void setAge(int userage) {
        age = userage;
    }
    public int getAge() {
        return age;
    }

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }

}
