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
        this.r = r;
    }

    public double getArea() {
        return r*r*Math.PI;
    }

    public double getPerimeter() {
        return 2*r*Math.PI;
    }

    public void printFigure() {
        System.out.println(" площа: "+getArea()+"; периметр: "+getPerimeter());
    }

    @Override
    public void printName() {
        System.out.print("Коло");
    }
}
