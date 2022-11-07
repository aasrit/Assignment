import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeEx {
    public static void main(String[] args) {
        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);
        LocalTime currentTime1=LocalTime.parse("04:20");
        System.out.println(currentTime1);
        LocalTime of=LocalTime.of(9,45);
        System.out.println(of);
        LocalTime plus=of.plus(1, ChronoUnit.HOURS);
        System.out.println(plus);
        boolean before=LocalTime.parse("23:30").isBefore(LocalTime.parse("22:30"));
        System.out.println(before);
        LocalTime maxTime=LocalTime.MAX;
        System.out.println(maxTime);
        LocalTime midnight=LocalTime.MIDNIGHT;
        System.out.println(midnight);
        LocalTime minTime=LocalTime.MIN;
        System.out.println(minTime);


    }
}
