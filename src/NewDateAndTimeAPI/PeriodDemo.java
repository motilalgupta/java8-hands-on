package NewDateAndTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate then = LocalDate.of(2003, 01, 30);
        Period period = Period.between(now, then);
        System.out.println(period);

    }
}
