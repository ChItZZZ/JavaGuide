package org.shzhong.util.timer.demo1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static String getCurrentTime() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main start:" + getCurrentTime());
        startTimer();
    }

    public static void startTimer() {

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("task" + getCurrentTime());
            }
        }, 0, 1000);

    }
}