package Lesson5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.Exchanger;

public class MainTime {
    private static long beginTime = 0;
    public static void main(String[] args) {
        beginTime = System.nanoTime();
        System.out.println("Запуск програми в : "
                +(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime())));
        Exchanger<Long> exchanger = new Exchanger<>();

        BeginTime timeBegin = new BeginTime(beginTime, exchanger);
        timeBegin.start();

        FiveSeconds timeFiveSeconds = new FiveSeconds( exchanger);
        timeFiveSeconds.start();
    }
}
