package NewDateAndTimeAPI;

import java.time.ZoneId;

public class ZonedDateTime {
    public static void main(String[] args) {
        java.time.ZonedDateTime now = java.time.ZonedDateTime.now();
        System.out.println(now);

        java.time.ZonedDateTime customezonedDateTime = java.time.ZonedDateTime.of(2026, 5, 23, 8, 25, 36, 30, ZoneId.of("America/New_York"));
        System.out.println(customezonedDateTime);

        java.time.ZonedDateTime parse = java.time.ZonedDateTime.parse("2026-05-23T08:25:36.000000030-04:00[America/New_York]");
        System.out.println(parse);

        ZoneId zone = parse.getZone();
        System.out.println(zone);

        ZoneId zone1 = now.getZone();
        System.out.println(zone1);

    }
}
