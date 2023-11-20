package com.boot.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author bin
 * @date 2023-02-28-20:21
 */
@Component
public class TaskBean {

    @Scheduled(cron = "0/1 * * * * ?")
    public void print() {
        System.out.println(Thread.currentThread().getName() + "spring task run......");
    }
}
