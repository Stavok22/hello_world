package Lesson1;

public class RightTriangle extends Shape{

    private double a;
    private double b;

    public RightTriangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public  double getArea() {
        return (a*b)/2;
    }
    public double getPerimeter() {
        return Math.sqrt((a*a)+(b*b)) + a + b;
    }
    public void printFigure() {
        System.out.println(" площа: "+getArea()+"; периметр: "+getPerimeter());
    }
    @Override
    public void printName() {
        System.out.print("Прямокутний трикутник");
    }
}
