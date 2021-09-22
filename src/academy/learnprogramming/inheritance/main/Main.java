package academy.learnprogramming.inheritance.main;

import academy.learnprogramming.inheritance.*;

public class Main {

    public static void main(String[] args) {
        Husky husky = new Husky(5);
        husky.printDetails();

        // Dog class made abstract so cannot be instantiated
//        Dog dog = new Dog(3);
//        dog.setName("Rex");
//        dog.printDetails();

        husky.eat();
        System.out.println("husky average weight:" + husky.getAverageWeight());
        husky.setName("Rex");
        husky.printName();
        husky.setAge(7);
        husky.printDetails();
        husky.run(30);
        System.out.println("husky weight: " + husky.getWeight());
        System.out.println("husky tail: " + husky.getTailLength());

        Bird bird = new Bird();
        bird.fly();

        Bear bear = new Bear();
        bear.setName("Jimmy");
        bear.setAge(10);
        bear.eatMeat();
        bear.eatPlants();
        bear.printDetails();

        Rabbit rabbit = new Rabbit();
        rabbit.eatPlants();
        rabbit.printDetails();

        Cat cat = new Cat(2);
        int speed = cat.getSpeed();
        System.out.println("cat speed is " + speed);
    }
}
