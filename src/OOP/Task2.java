package OOP;


//    Задача 1: Создание класса "Автомобиль"
//    Создайте класс Car с полями:
//
//    brand (марка автомобиля)
//    model (модель автомобиля)
//    year (год выпуска)
//    Добавьте методы:
//
//    Конструктор для инициализации полей
//    Метод для вывода информации об автомобиле

class Car {

    private String brand;
    private String model;
    private int year;


    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Марка: " + brand + ", Модель: " + model + ", Год: " + year);
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
public class Task2 {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Camry",2018);
        myCar.displayInfo();

    }
}
