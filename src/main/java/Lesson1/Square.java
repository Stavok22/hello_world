package Lesson1;

public class Square extends Shape {
    private double a;

    public Square(double a) {
        name="Квадрат";
        this.a = a;
    }

    public double area() {
        return a*a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    void showName() {
        System.out.println("Квадрат");
    }


}
