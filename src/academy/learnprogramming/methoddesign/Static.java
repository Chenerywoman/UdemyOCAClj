package academy.learnprogramming.methoddesign;

public class Static { // n.b. to create a class with a keyword, as has capital letter; cauldn't do with lowercase

    private String name = "Static";

    public static void one() {}
    public static void two() {}

    public static void three(){ // static methods can call other static methods
        one();
        two();
        // four(); cannot call non-static method from a static method without instance
        // System.out.println(name);  cannot reference non-static method without instance
    }

    public void four() {
        one();
        two();
        three();
        System.out.println(name);
    }

    public static void main(String[] args) {
        Static.one(); // can reference static method via the class but don't have to as in the same class
        one();
        two();
        three();
        // four(); cannot call without instance as not static

        Static myInstance = new Static();
        myInstance.four();

        new Static().four(); // can call via an instance of the class
     }


}
