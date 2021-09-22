package academy.learnprogramming.arraylist;

import java.util.*;

public class IteratingList1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        /** cannot iterate with a loop and modify a list
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("element at index " + i + " is " + numbers.get(i));
            numbers.remove(i); // IndexOutOfBoundsException
        }

        for (Integer number : numbers) {
            System.out.println("number: " + number);
            numbers.remove(2);  // concurrent modification exception
        }
        **/

        // iterator
        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();
            System.out.println(number);
            iterator.remove();
        }
        System.out.println(numbers);

        // List iterator
        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6)); // adding elements as list empty following previous iterator

        for(ListIterator<Integer>listIterator = numbers.listIterator(3); listIterator.hasPrevious();) {
            System.out.println(listIterator.previous());
            listIterator.remove();
        }
        System.out.println(numbers);



    }
}
