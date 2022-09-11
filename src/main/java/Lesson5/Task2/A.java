package Lesson5.Task2;

public class A extends Thread {
    private int i;
    public A(int i) {
        this.i = i;
    }
    @Override
    synchronized public void run() {
        Counter.fizz(i);
    }
}
