package academy.learnprogramming.exceptions;

import java.util.Locale;

public class UsingFinally {

    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "John ";

        try {
            String element = firstToUpperCase(array );
            System.out.println("element:" + element);
        } catch (NullPointerException npe) {
            System.out.println("Error message: "+ npe.getMessage());
        } finally {
            System.out.println("finally block");
        }

        // exam
        String str = " ";
        try {
            str += "a";
           int result = 10 / 0;
        } catch (Exception e) {
            str += "b";
        } finally {
            str += "c";
        }
        str += "d";

        System.out.println(str);

    }

    public static String firstToUpperCase(String[] array) {
            return array[0].toUpperCase();
    }
}
