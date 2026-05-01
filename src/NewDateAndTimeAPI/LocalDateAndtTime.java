package NewDateAndTimeAPI;

import java.time.LocalDateTime;

public class LocalDateAndtTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime myDateTime = LocalDateTime.parse("2026-05-03T15:45:30");
        System.out.println(myDateTime);
        LocalDateTime pastDateTime = myDateTime.minusDays(2);
        System.out.println(pastDateTime);
        if(myDateTime.isAfter(pastDateTime)){
            System.out.println("Haa bhai....");
        }
    }
}
