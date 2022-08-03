package Lesson1;

public abstract class Shape {
    protected String name=""; // Ім'я фігури

    abstract void showName(); //вивести ім'я фігури

    abstract double area(); // визначення площі

    //метод,який повертає назву фігури
    String getName() {
        return name;

    }
}
