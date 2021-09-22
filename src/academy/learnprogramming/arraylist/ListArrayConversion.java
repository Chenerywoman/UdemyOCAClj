package academy.learnprogramming.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversion {

    public static void main(String[] args) {

        /*** Convert ArrayList to Array ***/
        List<String> names = new ArrayList<>();

        names.add("Tony");
        names.add("Jimmy");
        names.add("Anthony");

        // conversion to Array of Objects
        Object[] namesArray = names.toArray();
        System.out.println(namesArray.length);

        // conversion to specific type
        String[] stringArray = names.toArray(new String[0]);  // java will convert to correct size

        // conversion specifying size
        String[] anotherStringArray = names.toArray(new String[names.size()]); // specify size needed

        /*** Convert Array to ArrayList ***/
        String[] petsArray = new String[]{"dog", "cat", "parrot"};
        String[] anotherPetsArray = {"dog", "cat", "parrot"};
        List<String> petsList = Arrays.asList(petsArray);
        List<String> pets2List = Arrays.asList("dog", "cat", "parrot"); // returns a fixed sized list
        System.out.println(pets2List.size());

        /*** change the List & changes the Array **/
        petsList.set(0, "bird");
        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray));

        /*** change the Array & changes the List**/
        petsArray[0] = "husky";
        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray));

        /** try to add to the List **/
        petsList.add("newDog"); // unsupported operation exception - List created with asList() method is fixed size

        /** try to remove from the List **/
        petsList.remove(1);

        /** create a List with asList() method **/
        List<String> list = Arrays.asList("one", "two", "three"); // returns  fixed-size list
        System.out.println(list);
        list.add("four"); // unsupported operation exception - when created with asList() List size cannot be changed






    }
}
