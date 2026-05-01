package NewDateAndTimeAPI;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime myTime = LocalTime.of(8,30,20);
        System.out.println(myTime);

        LocalTime parse = LocalTime.parse("10:30:15");
        System.out.println(parse);

        int hour = parse.getHour();
        System.out.println(hour);
        int minute = parse.getMinute();
        System.out.println(minute);
        int second = parse.getSecond();
        System.out.println(second);

        LocalTime pastTime = now.minusHours(1);
        System.out.println(pastTime);

        if(now.isAfter(pastTime)){
            System.out.println("Haa bhai");
        }
    }
}
