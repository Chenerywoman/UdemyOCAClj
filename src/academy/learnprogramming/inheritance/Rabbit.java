package academy.learnprogramming.inheritance;

public class Rabbit extends Animal implements Herbivore, Hop{

    public Rabbit() {
        super();
    }

    public Rabbit(int age) {
        this();
        setAge(3); // this calls the set age in Animal class
    }

    @Override
    public void printDetails() {
        System.out.println("Rabbit average jump height " + Hop.getAverageJumpHeight());
    }

    @Override
    public int getWeight() {
        return 2;
    }

    @Override
    public void run() {
        System.out.println("Rabbit is runnning");
    }

    @Override
    public void printName() {

    }
}
