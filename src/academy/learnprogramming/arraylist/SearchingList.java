package academy.learnprogramming.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchingList {

    public static void main(String[] args) {

        /** List of Strings **/
        List<String> numsList = new ArrayList<>();
        numsList.add("500");
        numsList.add("10");
        numsList.add("9");
        numsList.add("50");
        numsList.add("40");

        System.out.println(numsList);

        int index = Collections.binarySearch(numsList, "10");
        System.out.println(index);

        Collections.sort(numsList);
        int index2 = Collections.binarySearch(numsList, "10");
        System.out.println(numsList);
        System.out.println(index2);

        /** List of Integers **/
        List<Integer> numbers = Arrays.asList(5, 4, 0, 10, 11, 7, 3);
        System.out.println(numbers);
        int index3 = Collections.binarySearch(numbers, 7);
        System.out.println(index3);

        Collections.sort(numbers);
        System.out.println(numbers);
        index3 = Collections.binarySearch(numbers, 7);
        System.out.println(index3);

    }
}
