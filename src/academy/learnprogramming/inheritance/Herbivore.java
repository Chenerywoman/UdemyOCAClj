package academy.learnprogramming.inheritance;

public interface Herbivore {

    default void eatPlants() {
        System.out.println("eating plants");
    }

}
