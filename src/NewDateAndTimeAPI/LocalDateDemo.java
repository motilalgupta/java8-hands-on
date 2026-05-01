package NewDateAndTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate MyDate = LocalDate.of(2020, 7, 6);
        System.out.println(MyDate);

        int day = today.getDayOfMonth();
        System.out.println(day);
//        Month month = today.getMonth();
        int month = today.getMonthValue();
        System.out.println(month);
        int year = today.getYear();
        System.out.println(year);

        LocalDate yesterday = today.minusDays(1);
        System.out.println(yesterday);

        LocalDate pastDate = today.minusMonths(100);
        System.out.println(pastDate);

        if (today.isAfter(yesterday)) {
            System.out.println("Haa bhai...");
        }
    }
}
