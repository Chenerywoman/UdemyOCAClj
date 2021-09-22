package academy.learnprogramming.classstructure;

import java.util.Random;
// this is redundant - no need to import
import java.lang.System;

import a.b.c.d.*;
//import a.b.c.d.ExampleClass;
//import a.b.c.d.MyClass;
// can replace with

public class ImportExample {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(5));
        MyClass myClass = new MyClass();
        ExampleClass exampleClass = new ExampleClass();
    }
}
