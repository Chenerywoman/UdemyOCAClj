package academy.learnprogramming.arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class NestedLoops {

    public static void main(String[] args) {

        // prints hours and minutes up to 6:59
        for (int hours = 1; hours <= 6; hours++) {
            for (int minutes = 0; minutes < 60; minutes++) {
                // System.out.println(hours + ":" + minutes);
            }
        }

        // 2D array
        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // prints hash code: [[I@4554617c
        System.out.println(myArray);
        // prints hash code & nested hash code: [[I@74a14482, [I@1540e19d, [I@677327b6]
        System.out.println(Arrays.toString(myArray));

        System.out.println();
        System.out.println("*********************");
        // Breaking inner loop example
        OUTER:
        for (int[] rowArray : myArray) {
            INNER:
            for (int i = 0; i < rowArray.length; i++) {
                if (rowArray[i] % 2 == 0) {
                    break INNER;
                }
                System.out.print(rowArray[i] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("*********************");
        // Breaking outer loop example
        OUTER:
        for (int[] rowArray : myArray) {
            INNER:
            for (int i = 0; i < rowArray.length; i++) {
                if (rowArray[i] % 2 == 0) {
                    break OUTER;
                }
                System.out.print(rowArray[i] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("*******************");
        // continue inner loop example
        OUTER:
        for (int[] rowArray : myArray) {
            INNER:
            for (int i = 0; i < rowArray.length; i++) {
                if (rowArray[i] % 2 == 0) {
                    continue INNER;
                }
                System.out.print(rowArray[i] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("*********************");
        // continue outer loop example
        OUTER:
        for (int[] rowArray : myArray) {
            INNER:
            for (int i = 0; i < rowArray.length; i++) {
                if (rowArray[i] % 2 == 0) {
                    continue OUTER;
                }
                System.out.print(rowArray[i] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("*********************");
        // nested loops: while & do while
        int x = 10;
        while (x > 0) {

            do {
                // 1. executes until x = 5;
                // 3. x = 3;
                // 5. x-- -> x = 1;

                x -= 1;
            } while (x > 5);

            // 2. x-- -> x = 4
            // 4. x-- -> x = 2
            // 6. x-- -> x = 0

            x--;
            System.out.println(x);
            // prints 4 (step 2 above)
            // prints 2 (step 4 above)
            // prints 0 (step 6 above)

        }


    }
}

