package academy.learnprogramming.inheritance;

public class Bear extends Animal implements Omnivore {


    @Override
    public void printName() {
        System.out.println("Bear");
    }

    @Override
    public void run() {
        System.out.println("Bear is running");
    }

    @Override
    public int getWeight() {
        return 2000;
    }

    @Override
    public void eatMeat() {
        System.out.println("Bear eating meat");
    }

    @Override
    public void eatPlants() {
        System.out.println("Bear eating plants");
    }
}
