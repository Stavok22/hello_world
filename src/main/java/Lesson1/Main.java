package Lesson1;

public class Main {

    public static void main(String[] args){
        Circle circle = new Circle(7);
        System.out.print(new NameOfClasses().print(circle)+" :");
        circle.printFigure();// Коло
        RightTriangle triangle=new RightTriangle(15,2);
        System.out.print(new NameOfClasses().print(triangle)+" :");
        triangle.printFigure();// Прямокутний трикутник
        Rectangle rectangle=new Rectangle(5,6);
        System.out.print(new NameOfClasses().print(rectangle)+" :");
        rectangle.printFigure();// Прямокутник
        Square square=new Square(5);
        System.out.print(new NameOfClasses().print(square)+" :");
        square.printFigure();// Квадрат
        RectangularTrapezoid trapezoid=new RectangularTrapezoid(6,4,4);
        System.out.print(new NameOfClasses().print(trapezoid)+" :");
        trapezoid.printFigure(); //Прямокутна трапеція
    }
}
