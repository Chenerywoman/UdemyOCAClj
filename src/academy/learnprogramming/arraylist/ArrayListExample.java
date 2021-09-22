package academy.learnprogramming.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        ArrayList<Object> myList2 = new ArrayList<Object>(); // same as line above

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<>(); // don't have to enter type in the right hand side
        List<String> list3 = new ArrayList<>();  // using interface as type
        // ArrayList<String> list4 = new List<String>(); // cannot instantiate an ArrayList with a List type

        List<String> list5 = new ArrayList<>(20); //set initial capacity
    }

}
