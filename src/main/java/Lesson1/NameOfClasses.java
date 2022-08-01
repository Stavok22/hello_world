package Lesson1;

public class NameOfClasses  {
    public String print(Shape shape) {
        switch (shape.getClass().getName()){
            case "Lesson1.Circle":return "Коло";
            case "Lesson1.Rectangle":return "Прямокутник";
            case "Lesson1.RectangularTrapezoid":return "Прямокутна трапеція";
            case "Lesson1.Square":return "Квадрат";
            case "Lesson1.RightTriangle":return "Прямокутний трикутник";

        }
        return  null;
    }
}
