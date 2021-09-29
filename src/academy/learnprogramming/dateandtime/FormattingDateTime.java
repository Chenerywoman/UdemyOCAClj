package academy.learnprogramming.dateandtime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class FormattingDateTime {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2010, Month.APRIL, 15);
        LocalTime time = LocalTime.of(11, 22, 33);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));

        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        System.out.println(shortFormatter.format(dateTime));
        System.out.println(mediumFormatter.format(date));
        // System.out.println(shortFormatter.format(time)); // will throw Unsupported
        // temporal tyoe exception as shortFormatter is of Localised Date, not time

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(formatter));
        DateTimeFormatter formatterShortMonth = DateTimeFormatter.ofPattern("MM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(formatterShortMonth));

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");
            System.out.println(dtf.format(dateTime)); // prints 11:22
            System.out.println(dtf.format(time)); // prints 11:22
            // System.out.println(dtf.format(date)); // Exception - Unsupported field:
        // ClockHourOfAmPm

        // Pre-java 8
        SimpleDateFormat sf = new SimpleDateFormat("hh:mm");
        System.out.println(sf.format(new Date()));



    }
}
