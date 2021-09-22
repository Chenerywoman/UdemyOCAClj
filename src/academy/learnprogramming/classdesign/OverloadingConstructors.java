package academy.learnprogramming.classdesign;

class myDog {
    private String name;
    private String breed;
    private double weight;

    public myDog(String name) {
//        this.name = name;
//        breed = "husky";
//        weight = 30.0;

       // Dog(name, "husky");  // doesn't compile

       // new Dog(name, "husky"); // this compiles but creates new instance

        // System.out.println("constructor 1"); // this will cause an error as call to this needs to be first statement
        // in constructor body
        this(name, "husky"); // calls the second constructor
        System.out.println("first constructor");
    }

    public myDog(String name, String breed ) {
//        this.name = name;
//        this.breed = breed;
//        weight = 30.0;
        this(name, breed, 30.0); // calls the 3rd constructor
        System.out.println("second constructor");
    }

    public myDog(String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        System.out.println("third constructor");
    }

    public void print() {
        System.out.println(name + " " + breed + " " + weight);
    }

}

public class OverloadingConstructors {

    public static void main(String[] args) {
        myDog dog1 = new myDog("Jimmy");
        dog1.print();

        myDog dog2 = new myDog("Anthony", "Shepherd");
        dog2.print();

        myDog dog3 = new myDog("Rex", "German Shepherd", 40);
        dog3.print();
    }
}
