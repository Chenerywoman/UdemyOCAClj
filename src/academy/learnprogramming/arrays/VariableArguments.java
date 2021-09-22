package academy.learnprogramming.arrays;

import java.util.Arrays;

public class VariableArguments {

//    public static void main(String[] args) {}

    public static void main(String... args) {
        print(args);
        print("Java");
        print("This", "is", "my", "string", "array");
    }

    private static void print (String... myArguments) {
        System.out.println(myArguments.length);
        System.out.println(Arrays.toString(myArguments));
    }
}
