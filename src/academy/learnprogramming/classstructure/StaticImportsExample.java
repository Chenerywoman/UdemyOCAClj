package academy.learnprogramming.classstructure;

import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;
import static academy.learnprogramming.classstructure.Config.*;

public class StaticImportsExample {
    public static void main(String[] args) {
        int min = min(5, 7);
        out.println(min);
        out.println(PI);

        printConfig();

        out.println("name =" + NAME);
        out.print(MAX_COLUMN_COUNT);
    }
}
