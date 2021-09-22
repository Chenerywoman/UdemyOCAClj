package academy.learnprogramming.arraylist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class UsingWrappersInList {

    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();

        // autoboxing
        doubleList.add(10.5); // autoboxing from double to Double
        doubleList.add(new Double(55.10));
        doubleList.remove(55.10); // autoboxing

        // unboxing
        double first = doubleList.get(0); // unboxing

        System.out.println(doubleList);
        System.out.println(first);

        // ArrayLists with Integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(null);
        System.out.println(numbers);

       // int number = numbers.get(0); // null pointer exception - int cannot be null

        // remove elements from List
        List<Integer> nums = new ArrayList<>();
        nums.add(1); // index 0
        nums.add(2); // index 1
        nums.remove(1); // removing from index 1
        System.out.println(nums); // prints number 1

        nums.remove(new Integer("1"));
        System.out.println(nums);

    }
}
