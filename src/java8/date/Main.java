package java8.date;

import java.time.*;

/**
 * java8提供的新的时间api
 */
public class Main {

    public static void main(String[] args) {
        //获取当前时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);


        LocalDate localDate = now.toLocalDate();
        System.out.println(localDate);

        LocalDateTime localDateTime = now.withDayOfMonth(10).withYear(2012);
        System.out.println(localDateTime);

        LocalTime parse = LocalTime.parse("20:23:30");
        System.out.println(parse);

        //时区
        ZonedDateTime date1 = ZonedDateTime.parse("2019-02-14T10:15:30+05:30[Asia/Shanghai]");
        System.out.println(date1);

        ZoneId of = ZoneId.of("Europe/Paris");
        System.out.println(of);

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZonedDateTime now1 = ZonedDateTime.now();
        System.out.println(now1);
    }
}
