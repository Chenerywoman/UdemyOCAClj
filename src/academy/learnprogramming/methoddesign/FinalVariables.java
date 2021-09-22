package academy.learnprogramming.methoddesign;

import java.util.ArrayList;
import java.util.List;

public class FinalVariables {

    private static final int SIZE = 10;

    private static final List<String> VALUES = new ArrayList<>();

    public static void main(String[] args) {
        int[] myArray = new int[SIZE];

        /* compiler errors - can't change constant values */
//        SIZE++;
//        SIZE = 10;

        int doubleSize = 2 * SIZE;

        for (int i = 0; i < SIZE; i++) {
            System.out.println(myArray[i]);
        }

        VALUES.add("changed");
        /* cannot re-assign a final variable to a new object */
        // VALUES = new ArrayList<>();

        final int myNumber = 10;
        /* cannot re-asign local final variable */
        // myNumber = 11;
    }
}
