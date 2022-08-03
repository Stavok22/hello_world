package Lesson1;

public class Circle extends Shape {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(double r) {
        name = "Коло";
        this.r = r;
    }

    public double area() {
        return r*r*Math.PI;
    }

    //перевизначення абстрактного методу ShowName()
    void showName() {
        System.out.println("Коло");
    }


}
