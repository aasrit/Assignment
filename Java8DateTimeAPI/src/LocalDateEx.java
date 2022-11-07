import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateEx {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek=LocalDate.parse("2020-02-12").getDayOfWeek();
        System.out.println(dayOfWeek);
        int dayOfMonth = LocalDate.parse("2022-11-04").getDayOfMonth();
        System.out.println(dayOfMonth);
        LocalDate thisYear=LocalDate.now();
        System.out.println(thisYear.isLeapYear());
        LocalDate previousYear=LocalDate.now().minusDays(1500);
        System.out.println(previousYear.isLeapYear());
        boolean Before= LocalDate.parse("2022-02-25").isBefore(LocalDate.parse("2022-05-10"));
        System.out.println(Before);
        boolean After= LocalDate.parse("2022-08-25").isAfter(LocalDate.parse("2022-05-10"));
        System.out.println(After);
        LocalDateTime atStartOfDay=LocalDate.parse("2022-11-04").atStartOfDay();
        System.out.println(atStartOfDay);
        LocalDate with=LocalDate.parse("2022-11-04").with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(with);




System.out.println("---------------------------------------------------------------------------------------------");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        Clock clock = Clock.systemDefaultZone();
        LocalDate localDate1 = LocalDate.now(clock);
        System.out.println(localDate1);
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        LocalDate localDate2 = LocalDate.now(zoneId);
        System.out.println(localDate2);
        System.out.println("-----------------------------------------");
        LocalDate localDate3 = LocalDate.of(2001, 12, 05);
        System.out.println(localDate3);
        LocalDate localDate4 = LocalDate.parse("2002-02-12");
        System.out.println(localDate4);
        LocalDate localDate5 = localDate4.plusDays(2);
        System.out.println(localDate5);
        LocalDate localDate6=localDate5.minusDays(20);
        System.out.println(localDate6);
    }
}
