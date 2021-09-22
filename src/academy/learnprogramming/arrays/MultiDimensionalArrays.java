package academy.learnprogramming.arrays;

public class MultiDimensionalArrays {

    public static void main(String[] args) {
        // 1D array
        int[] myArray = new int[] {0, 1};
        int[] myAnonymousArray = {0, 1};

        // 2D array
        int[][] array = new int[2][4];
        int anotherArray[][] =  new int[2][4];
        int[] myIntArray[] = new int[2][4]; // works, but don't use in own code

        // asymmetrical array
        String[][] my2dArray = new String[][] {
                {"One", "Two"}, // 1st row two elements
                {"Three", "Four", "Five"}, // 2nd row three elements
                {"Six", "Seven", "Eight", "Nine"}, // 3rd row four elements
                null
        };

        int[][] numberTable = new int[2][3];
        numberTable[0][0] = 1;
        numberTable[0][1] = 2;
        numberTable[0][2] = 3;
//        numberTable[0][3] = 4; this is out of bounds - no index 3 in nested array

        // 3D array
        // pages(planes), rows, columns
        int[][][] threeArray = new int [3][3][3];
        threeArray[0][0][0] = 1; // sets the first column in the first row in the first page

        int oneMoreThreeArray[][][] = new int [3][3][3];
        int[] anotherThreeArray[][]; // dimensions specified both after the type of array and after the variable name

        // initialise
        int[][][] threeDArray = {
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };
    }
}
