package com.CRON.CRONApplication;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    // 24. CRON expression for run at 10:00 PM every day in the month of December
    @Scheduled(cron = "0 0 22 * 12 *")
    public void runJob() {
        System.out.println("Cron job is running...");
    }

//    // 23. CRON expression for run at 8:15 AM every weekday except Friday
//    @Scheduled(cron = "0 0 9-17 15 * *0 15 8 * * MON-THU")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 22. CRON expression for run at the top of every hour between 9:00 AM and 5:00 PM on the 15th day of the month
//    @Scheduled(cron = "0 0 9-17 15 * *")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 21. CRON expression for run at 3:30 AM every day except Saturday and Sunday
//    @Scheduled(cron = "0 30 3 * * MON-FRI")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 20. CRON expression for run every 5 minutes but only between 9:00 AM and 6:00 PM on weekends
//    @Scheduled(cron = "0 */5 9-18 * * FRI,SAT")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 19. CRON expression for run every hour but only on even-numbered days of the month
//    @Scheduled(cron = "0 0 * */2 * *")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 18. CRON expression for run at 11:30 PM every Friday the 13th
//    @Scheduled(cron = "0 30 23 13 * FRI")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 17. CRON expression for run every 5 minutes on weekdays and every 15 minutes on weekends
//    @Scheduled(cron = "0 */5 * * * SUN-THU && 0 */15 * * * FRI,SAT")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 16. CRON expression for run every hour during the first half of the month
//    @Scheduled(cron = "0 0 * 1/2 * *")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 15. CRON expression for run every 10 minutes between 9:00 AM and 6:00 PM on weekdays
//    @Scheduled(cron = "0 */10 9-18 * * SUN-THU")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 14. CRON expression for run every 5 minutes on weekdays and every 15 minutes on weekends
//    @Scheduled(cron = "0 */5 * * * SUN-THU && 0 */15 * * * FRI,SAT")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 13. CRON expression for run every day at 6:00 PM during daylight saving time (DST) in the United States
//    @Scheduled(cron = "0 0 18 * * *")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 12. CRON expression for run every hour on the 15th day of the month
//    @Scheduled(cron = "0 0 * 15 * *")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 11. CRON expression for run every 30 minutes during business hours (8:00 AM to 5:00 PM) on weekdays
//    @Scheduled(cron = "0 0/30 8-16 * * SUN-THU")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 10. CRON expression for run every hour during the month of January
//    @Scheduled(cron = "0 0 * 1 * *")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 9. CRON expression for run every day at 3:00 AM
//    @Scheduled(cron = "0 0 3 * * *")
//    public void runJob() {
//        System.out.println("Cron job is running...");
//    }

//    // 8. CRON expression for run every hour on weekdays between 9:00 AM and 5:00 PM
//    @Scheduled(cron = "0 0 9-17 * * SUN-THU")
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