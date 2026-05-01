package NewDateAndTimeAPI;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class DateTimeFormatter {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        java.time.format.DateTimeFormatter dateTimeFormatter = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format = dateTimeFormatter.format(now);
        System.out.println(format);

        String date = "2025/08/25";
        java.time.format.DateTimeFormatter dateTimeFormatter1 = java.time.format.DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate parse1 = LocalDate.parse(date, dateTimeFormatter1);
        System.out.println(parse1);

        String zonedDateTime = "2026-05-02T00:11:59.16+05:30";
        java.time.format.DateTimeFormatter dateTimeFormatter2 = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSXXX");
        ZonedDateTime parse = ZonedDateTime.parse(zonedDateTime, dateTimeFormatter2);
        System.out.println(parse);
    }
}
