package academy.learnprogramming.classstructure;

public class Main {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("args-size= " +  args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]" + args[i]);
        }

    }

    /**
     * Calculates sum of 2 integers
     * @param a operand
     * @param b operand
     * @return sum
     */
    public static int sum(int a, int b){
        return a + b;
    }
}
