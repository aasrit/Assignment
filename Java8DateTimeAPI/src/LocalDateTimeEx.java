import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeEx {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDateTime localDateTime1=LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime1);
        LocalDateTime localDateTime2=LocalDateTime.parse("2022-12-05T10:15:30");
        System.out.println(localDateTime2);
        LocalDate localDate=localDateTime2.toLocalDate();
        LocalTime localTime=localDateTime2.toLocalTime();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime.MAX);
        System.out.println(localDateTime.MIN);



    }
}
