package academy.learnprogramming.classdesign;

class Dog {

    private String colour;

    public Dog(String colour) {
        System.out.println("constructor");
        this.colour = colour;
    }

    public void printColour() {
        System.out.println("colour: " + this.colour);
    }
}

class Cat {
    private String colour;
    private int height;
    private int length;

    public Cat(int length, int theHeight) {
        this.length = length;
        height = theHeight;
        colour = "white";
    }

    public void printInfo() {
        System.out.println("Cat length = " + this.length + " height: " + this.height + " colour: " + colour );
    }
}

public class ClassConstructors {

    public static void main(String[] args) {

        Dog dog = new Dog("Mandy");
        dog.printColour();

        Cat cat = new Cat(10, 12);
        cat.printInfo();

    }
}
