package com.boot.config;

import com.boot.quartz.MyQuartz;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author bin
 * @date 2023-02-28-19:56
 */
@Configuration
public class QuartzConfig {

    /**
     * Job 工作
     * JobDetail 工作明细
     * Trigger 触发器
     * Scheduler 调度器
     */

    @Bean
    public JobDetail printJobDetail() {
        // 绑定具体的工作
        return JobBuilder.newJob(MyQuartz.class).storeDurably().build();
    }

    @Bean
    public Trigger printJobTrigger() {
        ScheduleBuilder<? extends Trigger> schedBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ?");
        // 绑定对应的工作明细
        return TriggerBuilder.newTrigger().forJob(printJobDetail()).withSchedule(schedBuilder).build();
    }
}
