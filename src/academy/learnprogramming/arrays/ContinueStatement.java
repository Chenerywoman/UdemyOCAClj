package academy.learnprogramming.arrays;

public class ContinueStatement {
    public static void main(String[] args) {
        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        for (String animal : animals) {
            System.out.println(animal);
        }

        MY_LOOP:
        for (String animal : animals) {
            if (animal.equals("Cat")) {
                continue MY_LOOP;
            }
            System.out.println(animal);
        }

        animal:
        // example - confusing as label is same as loop variable
        for (String animal : animals) {
            if (animal.equals("Cat")) {
                continue animal;
            }
            System.out.println(animal);
        }

        // example with 2 conditions
        for (String animal :
                animals) {
            if (animal.equals("Lizard") || animal.equals("Cat")) {
                continue;
            }
            System.out.println(animal);
        }

        // While loop example
        // creates endless loop - index increment not reached after continue
//        int index = 0;
//        while (index < animals.length) {
//            String animal = animals[index];
//
//            if (animal.equals("Lizard")){
//                continue;
//            }
//
//            System.out.println(animal);
//            index++;
//        }

//        int index = 0;
//        while (index < animals.length) {
//            index++;  // putting the increment statement here fixes the infinite loop
//            // but creates an index out of bounds exception
//            String animal = animals[index];
//
//            if (animal.equals("Lizard")){
//                continue;
//            }
//
//            System.out.println(animal);
//        }

        int index = 0;
        while (index < animals.length) {
            String animal = animals[index];
            index++;  // moving the increment statement here fixes the out of bounds exception
            //highest index in the array is 4, so line above won't try to access index 5

            if (animal.equals("Lizard")){
                continue;
            }

            System.out.println(animal);
        }

    }

}
