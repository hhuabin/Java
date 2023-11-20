package com.boot;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author bin
 * @date 2023-02-28-19:59
 */

/**
 * 原生定时任务
 */
public class TimeTaskApp {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("run...");
            }
        };
        timer.schedule(task, 0, 2000);
    }
}
