package academy.learnprogramming.exceptions;

public class DealingWithExceptions {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = divide(a, b);
            System.out.println("result:" + result);
        } catch (ArithmeticException e){
            e.printStackTrace(); // prints stack trace
            System.out.println("Error dividing message = " + e.getMessage()); // prints error
            // message
        }

    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
