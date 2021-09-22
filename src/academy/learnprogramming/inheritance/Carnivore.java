package academy.learnprogramming.inheritance;

public interface Carnivore {

    default void eatMeat() {
        System.out.println("eating meat");
    }
}
