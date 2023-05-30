package com.CRON.CRONApplication;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    // 10. CRON expression for run every hour during the month of January
    @Scheduled(cron = "0 0 * 1 * *")
    public void runJob() {
        System.out.println("Cron job is running...");
    }

//    // 9. CRON expression for run every day at 3:00 AM
//    @Scheduled(cron = "0 0 3 * * *")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 8. CRON expression for run every hour on weekdays between 9:00 AM and 5:00 PM
//    @Scheduled(cron = "0 0 9-17 * * MON-FRI")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 7. CRON expression for run every 15 minutes between 8:00 AM and 10:45 PM every day
//    @Scheduled(cron = "0 */15 8-22 * * *")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 6. CRON expression for run every Sunday at 7:30 PM and 10:30 PM
//    @Scheduled(cron = "0 30 19,22 * * SUN")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 5. CRON expression for run every month on the first day at 3:00 AM
//    @Scheduled(cron = "0 0 3 1 * *")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 4. CRON expression for run every Monday at 8:00 AM
//    @Scheduled(cron = "0 0 8 * * MON")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

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