package com.CRON.CRONApplication;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    // 4. CRON expression for run every Monday at 8:00 AM
    @Scheduled(cron = "0 0 8 * * MON")
    public void runJob() {
        System.out.println("Cron job is running...");
    }

//    // 3. CRON expression for run every day at 2:30 PM
//    @Scheduled(cron = "0 30 14 * * *")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 2. CRON expression for run every hour
//    @Scheduled(cron = "0 0 * * * *")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

    // 1. CRON expression for running every 5 minutes
//    @Scheduled(cron = "0 */5 * * * *")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }
}