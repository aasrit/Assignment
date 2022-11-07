import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormatterEx {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.of(2022, Month.NOVEMBER,06,12,00);
        System.out.println(localDateTime);
        String format=localDateTime.format(DateTimeFormatter.ISO_DATE);
        System.out.println(format);
        String format2=localDateTime.format(DateTimeFormatter.ofPattern("dd/mm/yyyy"));
        System.out.println(format2);
        String format3=localDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.UK));
        System.out.println(format3);
}}
