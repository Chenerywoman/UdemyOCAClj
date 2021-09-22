package academy.learnprogramming.arrays;

import java.util.Arrays;

public class WorkingWithArrays {

    public static void main (String[] args) {
        int[] one = new int[3]; // array with 3 elements
        int[] two = new int[]{10, 11, 12}; // array with 3 elements

        // double[] a = new double[2.35] // can't use decimals for array length
        double[] b = new double[ 4 * 5 / 2]; // creates array with 10 elements

        int x = 4;
        int y = 4;

        double[] c = new double[x * y]; // creates empty array with 16 elements

        int[] three = {10,11,12}; // anonymous array
        int[] four = {};

        int[] a1;
        int[] a2;
        int a3[];
        int a4[];

        int[] ids, types; // creates 2 arrays
        int ids2[], types2; // creates array and int, bad practice

        // arrays of objects

        String[] animals = {"Parrot", "Dog", "Cat"};
        String[] myAnimals = animals;
        String[] otherAnimals = {"Parrot", "Dog", "Cat"};

        System.out.println(animals.equals(myAnimals));
        System.out.println(animals == myAnimals);
        System.out.println(Arrays.equals(animals, myAnimals));


        System.out.println(animals.equals(otherAnimals));
        System.out.println(animals == otherAnimals);
        System.out.println(Arrays.equals(animals, otherAnimals));

        // toString() method: prints hash code and type of array
        System.out.println(animals);
        System.out.println(animals.toString());

        // Arrays.toString() method: prints contents
        System.out.println(Arrays.toString(animals));


    }
}
