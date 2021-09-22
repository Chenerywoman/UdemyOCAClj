package academy.learnprogramming.methoddesign;

import java.util.Arrays;

public class MethodsWithVarArgs {

    /* Var Arg arguments */

    public void jump1(int... numbers){ }

    public void jump2(int start, int... numbers) { }

    // public void jump3(int... numbers, int start){} // doesn't compile - argument after VarArgs\

    // public void jump4(int... start, int... start2) {} // won't compile, can't have 2 VarArgs

    /* Array arguments */

    public void jump5(int[] start, int[] numbers) {}

    public static void jump(int start, int...numbers) {
        System.out.println("start:" + start + "numbers.lenghth:" + numbers.length);
    }

    public static void run(int... numbers) {
        for (int number: numbers) {
            System.out.println("number:" + number);
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        jump(1);
        jump(2, 3);
        jump(4, 5, 6, 7);
        jump(1, new int[]{4, 5, 6}); // redundant array creation for varargs method
        // jump(1, null); // null pointer exception - trying to call .length on null;
        run();
        run(11, 22, 33, 44, 55, 66, 77, 88, 99);
    }
}
