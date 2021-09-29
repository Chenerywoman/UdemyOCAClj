package academy.learnprogramming.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class UsingPeriod {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 30);
        Period period = Period.ofWeeks(1);

        // convert to a Period
        start.toEpochDay();  // no. of days since 1st January 1970

        System.out.println(start.plus(period));
        // LocalDateTime.now().plus(period); will cause an exception - unsupported unit day

        // Period yearAndMonth = Period.ofYears(1).ofMonths(1); // only the Months will show, as it is a static method - cannot chain methods
        Period yearAndMonth = Period.of(1, 1, 0);
        System.out.println(yearAndMonth);

        cleanAnimalCage(start, end);

        cleanAnimalCage(start, end, period);
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
        while (start.isBefore(end)) {
            System.out.println("need to clean the cage on date: " + start);
            start = start.plus(period);
        }
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end) {
        while (start.isBefore(end)) {
            System.out.println("Need to clean the cage on date " + start);
            start = start.plusMonths(1);
        }
    }
}
