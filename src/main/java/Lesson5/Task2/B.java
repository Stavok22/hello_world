package Lesson5.Task2;

public class B extends Thread {
    private int i;
    public B(int i) {
        this.i = i;
    }
    @Override
    synchronized public void run() {
        Counter.buzz(i);
    }
}
