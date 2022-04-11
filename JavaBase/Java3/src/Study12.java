import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Study12 {
    public static void main(String[] args) {
//        Instant instant = Instant.now();
//        System.out.println(instant); // 기준시 UTC, GMT
//        System.out.println(instant.atZone(ZoneId.of("Asia/Seoul")));
//
//        ZoneId zone = ZoneId.systemDefault();
//        System.out.println(zone);
//        ZonedDateTime zonedDateTime = instant.atZone(zone);
//        System.out.println(zonedDateTime);

//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//        LocalDateTime of = LocalDateTime.of(1082, Month.APRIL, 15, 0, 0, 0);
//
//        ZonedDateTime nowInKorea =
//                ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
//        System.out.println(nowInKorea);
//
//        Instant nowInstant = Instant.now();
//        ZonedDateTime zonedDateTime =
//                nowInstant.atZone(ZoneId.of("Asia/Seoul"));
//
//        System.out.println(zonedDateTime);

//        LocalDate today = LocalDate.now();
//        System.out.println(today);
//        LocalDate thisYearBirthday = LocalDate.of(
//                2022, Month.AUGUST, 30
//        );
//        System.out.println(thisYearBirthday);
//
//        Period period = Period.between(today, thisYearBirthday);
//        System.out.println(period.getDays());
//
//        Period until = today.until(thisYearBirthday);
//        System.out.println(period.get(ChronoUnit.DAYS));
//
//        Instant now = Instant.now();
//        Instant plus = now.plus(10, ChronoUnit.SECONDS);
//        Duration between = Duration.between(now, plus);
//        System.out.println(between.getSeconds());

//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//
//        DateTimeFormatter dateTimeFormatter =
//                DateTimeFormatter.ofPattern("MM/dd/yyyy");
//        System.out.println(now.format(dateTimeFormatter));
//
//        LocalDate parse =
//                LocalDate.parse("07/15/1982", dateTimeFormatter);
//        System.out.println(parse);

//        Date date = new Date();
//        Instant instant = date.toInstant();
//        Date newDate = Date.from(instant);
//
//        GregorianCalendar gregorianCalendar = new GregorianCalendar();
//        ZonedDateTime dateTime = gregorianCalendar.toInstant()
//                .atZone(ZoneId.systemDefault());
//        GregorianCalendar from = GregorianCalendar.from(dateTime);
//
//        ZoneId zoneId = TimeZone.getTimeZone("PST").toZoneId();
//        TimeZone timeZone = TimeZone.getTimeZone(zoneId);
//
    }
}
