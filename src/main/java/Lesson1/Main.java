package Lesson1;

public class Main {

    public static void main(String[] args){
        // приклад для кола
        Circle circle = new Circle(7);
        circle.printName();
        circle.printFigure();

        //приклад для прямокутного трикутника
        RightTriangle triangle=new RightTriangle(15,2);
        triangle.printName();
        triangle.printFigure();

    }
}
