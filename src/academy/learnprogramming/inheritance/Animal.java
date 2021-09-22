package academy.learnprogramming.inheritance;

public abstract class Animal {

    private int age;
    protected String name;

    public Animal() {}

    public Animal(int age) {
        System.out.println("Animal");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public double getAverageWeight() {
        return 10.0;
    }

    public abstract void printName();

    public void printDetails() {
        printName();
        System.out.println("age: " + age);
    }

    public abstract void run();

    public abstract int getWeight();
}

