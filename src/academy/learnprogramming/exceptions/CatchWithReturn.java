package academy.learnprogramming.exceptions;

public class CatchWithReturn {

    public static void main(String[] args) {
        System.out.println(calculate2());

    }

    public static int calculate() {
        try {
            return 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("error"); // prints
            return 1; // this doesn't get printed - prints error above, then goes to catch block
        } finally {
            System.out.println("finally"); // then this prints
            return 0; // this is returned
        }
    }

    public static int calculate2() {
        try {
            return 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("error"); // prints
           System.exit(0); // this doesn't get printed - prints error above, then goes to catch block
        } finally {
            System.out.println("finally"); // then this prints
            return 0; // this is returned
        }
    }
}
