package academy.learnprogramming.arraylist;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListMethods2 {

    public static void main(String[] args) {
        List<String> pets = new ArrayList<>();

        System.out.println(pets.isEmpty());
        System.out.println(pets.size());

        if(pets.isEmpty()) {
            System.out.println("no pets");
        }

        if(pets.size() == 0) {
            System.out.println("no pets");
        }

        pets.add("cat");
        System.out.println(pets.isEmpty());
        System.out.println(pets.size());

        pets.clear();
        System.out.println(pets.isEmpty());
        System.out.println(pets.size());

        // contains
        pets.add("dog");
        System.out.println(pets.contains("cat")); // false
        System.out.println(pets.contains("dog")); // true

        // equals
        List<String> newPets = new ArrayList<>();
        newPets.add("dog");
        System.out.println(pets.equals(newPets)); // true

        newPets.add("cat");
        System.out.println(pets.equals(newPets)); // false

        pets.add(0, "cat");
        System.out.println(pets); // cat, dog
        System.out.println(newPets); // dog, cat
        System.out.println(pets.equals(newPets)); //false
    }
}
