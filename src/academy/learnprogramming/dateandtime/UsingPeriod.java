package academy.learnprogramming.dateandtime;

import java.time.LocalDate;
import java.time.Month;

public class UsingPeriod {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 30);
        cleanAnimalCage(start, end);

    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end) {
        while (start.isBefore(end)) {
            System.out.println("Need to clean the cage on date " + start);
            start = start.plusMonths(1);
        }
    }
}
