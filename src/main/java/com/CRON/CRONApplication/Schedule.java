package com.CRON.CRONApplication;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    // 1. CRON expression for running every 5 minutes
    @Scheduled(cron = "0 */5 * * * *")
    public void runJob() {
        System.out.println("Cron job is running...");
    }
}