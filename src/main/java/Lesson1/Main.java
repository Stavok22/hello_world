package Lesson1;
// клас, який використовує абстрактний клас Shape
public class Main {

        // метод, який отримує посилання на базовый класс
        static String getName(Shape figure) {
            return figure.getName(); // виклик методу базового класу
        }
        static double getArea(Shape figure) {
            return figure.area(); // виклик методу визначення площі
        }
        public static void main(String[] args) {
            Shape figure1 = new Circle(7); // екземпляр класу Circle
            Shape figure2 = new Rectangle(5,6) ; // экземпляр класу Rectangle
            double area;

            // виводимо назви екземплярів figure1, figure2
            figure1.showName(); // Коло
            figure2.showName(); // Прямокутник


            String name;
            name = getName(figure1); // name = "Коло"
            System.out.println(name);

            name = getName(figure2); // name = "Прямокутник"
            System.out.println(name);


            area = getArea(figure1); //
            System.out.println("Площа кола = " + area);


            area = getArea(figure2); //
            System.out.println("Площа прямокутника = " + area);
        }
    }
