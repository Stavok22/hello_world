package Lesson1;

public class RectangularTrapezoid extends Shape {
    private double baseA;
    private double baseB;

    public double getBaseA() {
        return baseA;
    }

    public void setBaseA(double baseA) {
        this.baseA = baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    public void setBaseB(double baseB) {
        this.baseB = baseB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double height;

    public RectangularTrapezoid(double baseA, double baseB, double height) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
        name="прямокутна трапеція";
    }

    public double area() {
        return ((baseA+baseB)/2)*height;
    }
    void showName() {
        System.out.println("Прямокутна трапеція");
    }





}
