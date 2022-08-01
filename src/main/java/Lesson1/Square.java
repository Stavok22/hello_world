package Lesson1;

public class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getArea() {
        return a*a;
    }
    public double getPerimeter() {
        return 4*a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void printFigure() {
        System.out.println(" площа: "+getArea()+"; периметр: "+getPerimeter());
    }
}
