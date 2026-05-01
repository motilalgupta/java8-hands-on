package NewDateAndTimeAPI;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationDemo {
    public static void main(String[] args) throws InterruptedException {
        Instant start = Instant.now();
        int sum = 0;
        for(int i = 1; i<=1000000; i++){
            sum += i + 1;
        }
        Instant end = Instant.now();
        Duration d1 = Duration.between(start, end);
        Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(d1);
        System.out.println(d2);

        int i = d2.compareTo(d1);
        System.out.println(i);

        LocalTime a = LocalTime.now();
        Thread.sleep(2000);
        LocalTime b = LocalTime.now();
        Duration duration = Duration.between(a, b);
        System.out.println(duration);
    }
}
