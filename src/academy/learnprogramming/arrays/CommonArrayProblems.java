package academy.learnprogramming.arrays;

public class CommonArrayProblems {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // 5 elements; index range 0 - 4

        for (int i = 1; i < numbers.length; i++) {
            System.out.println(i + " - " + numbers[i] );
        }

        for (int i = 1; i <= numbers.length -1; i++) { // need to have -1 so don't get out of range exception
            System.out.println(i + " - " + numbers[i]);
        }

        // int[20] nums;
        int[] nums = new int[20]; // size only at initialisation

        //int size = numbers.length() // length is not a method
        int size2 = numbers.length;

        // cannot change array size once initialised
    }

}
