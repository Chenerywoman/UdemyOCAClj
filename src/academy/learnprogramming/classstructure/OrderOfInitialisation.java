package academy.learnprogramming.classstructure;

class Example {
    private String name = "dog";

    // called in the order of numbers below:

    // 2. first instance initialiser
     {
         System.out.println(name);
    }

    private static int COUNT = 0;

    // 1. static initialiser
    static {
        System.out.println(COUNT);
    }

    // 3. second instance initialiser
    {
        COUNT +=10;
        System.out.println(COUNT);
    }

    // 4. constructor
    public Example () {
        System.out.println("constructor");
    }
}

class Demo {

    static {
        add(2);
    }

    static void add(int number) {
        System.out.print(number + " ");
    }

    Demo(){
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static{
        new Demo();
    }

    {
        add(8);
    }

}
public class OrderOfInitialisation {

    public static void main(String[] args) {
       new Example();
       new Demo();
    }
}
