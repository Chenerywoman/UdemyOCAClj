package academy.learnprogramming.arraylist;

import java.awt.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList2 {

    public static void main(String[] args) {
        List<String> list  = Arrays.asList(createArray());

        // for loop
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
        }

        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("for loop totaltime:" + totalTime +  " ms");

        // foreach loop
        startTime = System.currentTimeMillis();

        /* code to which foreach loop compiled:
            for(Iterator<String> iterator = list.iterator(); iterator.hasNext(); str = iterator.next()){}
        */

        for (String temp : list) { }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("foreach loop totalTime " + totalTime + " ms");

        // Iterator
        startTime = System.currentTimeMillis();

        for(Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
            String temp = iterator.next();
        }
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("iterator totalTime " + totalTime +  "ms");

        // ListIterator
        startTime = System.currentTimeMillis();

        for(ListIterator<String> listIterator = list.listIterator(); listIterator.hasNext();) {
            String temp = listIterator.next();
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("ListIterator totalTime " + totalTime + " ms");
    }

    private static String[] createArray() {
        String[] stringArray = new String[5_000_000]; // can reduce this number if get OutOfMemoryException

        for (int i = 0; i < stringArray.length; i++) { // generates elements in the array
            stringArray[i] = "Array " + i;
        }

        return stringArray;
    }
}
