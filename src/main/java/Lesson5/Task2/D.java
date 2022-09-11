package Lesson5.Task2;

public class D extends Thread {
    private int i;

    public D(int i) {
        this.i = i;
    }

    @Override
    synchronized public void run() {
        Counter.number(i);
    }
}
