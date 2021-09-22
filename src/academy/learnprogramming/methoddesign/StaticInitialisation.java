package academy.learnprogramming.methoddesign;

import java.util.ArrayList;
import java.util.List;

public class StaticInitialisation {

    private static final int SIZE;

    private static int one;
    private static final int two;
    private static final int three = 3;

    private static final List<String> NAMES = new ArrayList<>();
    // private static final int four; // final variable not initialised - won't compile

    // final variables can only be initialised inside a static block if not done on declaration
    static {
        System.out.println("first static init:");
        int rows = 5;
        int columns = 4;
        SIZE = rows * columns;
    }

    static {
        System.out.println("second static init:");
        one = 1;
        two = 2;
        one = three; // can re-assign as not a final variable
        // three = 3; // cannot re-assign as it is a final variable
        one = 2;
    }

    static {
        System.out.println("third static init");
        NAMES.add("Jimmy");
        NAMES.add("Timmy");
    }

    public static void main(String[] args) {
        System.out.println(NAMES);
    }
}
