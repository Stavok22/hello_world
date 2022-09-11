package Lesson5.Task2;

public class Counter {
    public static int number = 0;
    public Counter(int number) {
        Counter.number = number;
    }
    public static void main(String[] args) throws InterruptedException {
        Counter Count = new Counter(35);
        for(int i = 1; i<= number; i++) {
            A a = new A(i);
            a.start();

            B b = new B(i);
            b.start();
            b.join();

            C c = new C(i);
            c.start();
            c.join();

            D d = new D(i);
            d.start();
            d.join();
        }
    }
    public static void fizz(Integer number) {
        try {
            if (number % 3 == 0) {
                System.out.print("fizz ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Потрібно ввести число");
        }
    }
    public static void buzz(Integer number) {
        try {
            if (number % 5 == 0) {
                System.out.print("buzz ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Потрібно ввести число");
        }
    }
    public static void fizzbuzz(Integer number) {
        try {
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.print("fizzbuzz ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Потрібно ввести число");
        }
    }
    public static void number(Integer number) {
        try {
            if (number % 3 != 0 && number % 5 != 0) {
                System.out.print(number + " ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Потрібно ввести число");
        }
    }
}
