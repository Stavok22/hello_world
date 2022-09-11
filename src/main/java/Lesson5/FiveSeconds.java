package Lesson5;

import java.util.concurrent.Exchanger;

public class FiveSeconds extends Thread {
    public Exchanger<Long> t;
    public FiveSeconds(Exchanger<Long> exchanger) {
        this.t = exchanger;
    }
    @Override
    public void run() {
        long time ;
        try {
            while (true){
                time = t.exchange(0L);
                if (time % 5 == 0 && time !=0) {
                    System.out.println("Минуло 5 секунд");
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
