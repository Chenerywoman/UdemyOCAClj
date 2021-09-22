package academy.learnprogramming.inheritance;

public class Husky extends Dog {

    public Husky(int age) {
        super(age);
        System.out.println("Husky");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Husky is eating");
    }

    @Override
    public void run() {
        System.out.println("Husky is running");
    }

    @Override
    public int getWeight() {
        return 6;
    }

    @Override
    public void printName() {
        System.out.println("husky name is " + getName());
    }

    // if Dog class doesn't override method getTailLength from HasTail interface,
    // Husky class must override it, as this is implemented by Dog class, which Husky extends
    // if Dog class implements it, optional for Husky to implement it

    @Override
    public int getTailLength() {
        return 20;
    }

    @Override
    public void run(int speed) {
        System.out.println("Husky running at speed " + speed);
    }

}
