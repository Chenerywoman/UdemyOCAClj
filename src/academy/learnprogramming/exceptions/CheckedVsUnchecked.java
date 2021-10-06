package academy.learnprogramming.exceptions;

public class CheckedVsUnchecked {

    public static void main(String[] args) throws Exception{
        myMethod(); // unhandled checked exception if no throws statement in this method
        anotherMethod();
    }

    public static void myMethod() throws Exception{
        throw new Exception("failed to load");
    }

    public static void anotherMethod() throws RuntimeException{
        throw new RuntimeException("Wrong parameter");
    }
}
