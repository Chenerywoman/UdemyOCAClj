package academy.learnprogramming.methoddesign;

public class OverloadingMethods {

    public void walk(int miles) {
    }

    public void walk(short feet) {
    } // different parameter type

    public boolean walk() {
        return false;
    }  // different return type

    void walk(int miles, short feet) {} // different number of parameters & different access modifier

    public void walk(float miles) {} // different parameter type
    public void walk(int[] lengths) {}

    public static void run(int length) {}
    public static void run(Integer length) {}
    public static void run(double kilometers) {}

    public static void jump(String s ) {
        System.out.println("string");
    }

    public static void jump(Object o) {
        System.out.println("object");
    }

    public static int sum(int a, int b) {
        System.out.println("int sum");
        return a + b;
    }

    public static long sum(long a, long b) {
        System.out.println("long sum");
        return a + b;
    }

    public static Integer sum(Integer a, Integer b) {
        System.out.println("Integer sum");
        return a + b;
    }

    public static int sum(int... numbers) {
        System.out.println("varargs");
        int sum = 0;

        for (int i : numbers) {
            sum+= i;
        }

        return sum;
    }

    public static void main(String[] args) {
        run(9l); // long promoted to double type
        run(1.0); // float promoted to double
        jump("test");
        jump(25);

        sum(1, 2); // calls int method


    }

}
