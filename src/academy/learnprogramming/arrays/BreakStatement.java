package academy.learnprogramming.arrays;

public class BreakStatement {
    public static void main(String[] args) {

        // label example
        myLabel:
        {
            int[] myArray = {1, 2, 3};
        }

        // normal for-loop
        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        for (String animal : animals) {
            System.out.println(animal);
        }

        // for-loop with label and break
        MY_LOOP:
        for (String animal : animals) {
            if (animal.equals("Cat")) { // when get to Cat, breaks the loop - only Dog printed
                break MY_LOOP;
            }
            System.out.println(animal);
        }

        // for-loop with label and break - label same variable name as loop variable
        animal:
        for (String animal : animals) { // confusing example - label and loop variable are both animal
            if (animal.equals("Cat")) {
                break animal;
            }
            System.out.println(animal);
        }

        // for-loop with break - no label
        for (String animal : animals) { // similar loop without label
            if (animal.equals("Lizard")) {
                break;
            }
            System.out.println(animal);
        }

        // while loop
        int index = 0;
        while (index < animals.length) {
            String animal = animals[index];
            if (animal.equals("Lizard")) {
                break;
            }

            System.out.println(animal);
            index++;

        }


    }
}
