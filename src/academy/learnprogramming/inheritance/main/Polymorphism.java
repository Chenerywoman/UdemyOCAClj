package academy.learnprogramming.inheritance.main;

import academy.learnprogramming.inheritance.*;

import java.util.ArrayList;
import java.util.List;

public class Polymorphism {

    public static void main(String[] args) {
        Husky husky = new Husky(5);
        husky.setName("rex");

        Dog dog = husky; // another reference to Husky object in memory
        dog.printDetails();

        HasTail hasTail = husky; // another reference to Husky object in memory
        System.out.println("tailLenght: " + husky.getTailLength());

        CanRun canRun = husky; // another reference to Husky object in memory
        canRun.run(5);

        Animal animal = husky; // another reference to Husky object in memory
        animal.printDetails();

        Object object = husky; // another reference to Husky object in memory

        Husky myDog = (Husky)animal;
        myDog.printName();

        Animal cat = new Cat(2);
        Cat newCat = (Cat)cat;

        // Bird is not polymorphic - can only be assigned to own class plus Object
        Bird bird = new Bird();
        Object birdObject = bird;

        // Eagle is polymorphic
        Eagle eagle = new Eagle();
        Bird eagleBird = eagle;
        Object eagleObject = eagle;

        List<String> list = new ArrayList<>();

        Animal rabbitAnimal = new Rabbit();
        rabbitAnimal.printDetails();
        
    }
}
