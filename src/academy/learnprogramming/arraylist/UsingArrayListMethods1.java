package academy.learnprogramming.arraylist;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethods1 {

    public static void main(String[] args) {

        List list = new ArrayList();
        List<Object> list2 = new ArrayList<>();

        // add method
        list.add("dog");
        list.add(5);

        System.out.println(list);

        List<String> pets = new ArrayList<>();
        pets.add("dog");
        System.out.println(pets);

        // add at specific index
        pets.add(0, "cat");
        System.out.println(pets);
        // cat, dog

        pets.add(1, "parrot"); // cat, parrot, dog
        pets.add(0, "husky"); // husky, cat, parrot, dog
        pets.add(1, "bird"); // husky, bird, cat, parrot, dog

        // remove method
        pets.remove("parrot"); // husky, bird, cat, dog
        System.out.println(pets);

        // remove by index
        pets.remove(2);
        System.out.println(pets); // husky, bird, dog

        // set() method
        pets.set(0, "newBird"); // newBird, bird, dog
        System.out.println(pets);

    }
}
