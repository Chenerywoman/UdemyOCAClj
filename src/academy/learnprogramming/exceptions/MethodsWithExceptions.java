package academy.learnprogramming.exceptions;

class NoMoreMeatException extends Exception {
}

class NoMorePlantsException extends RuntimeException {
}

interface Omnivore {
    void eatMeat(int amount) throws NoMoreMeatException;

    void eatPlants(int amount);
}

class Bear implements Omnivore {

    @Override
    public void eatMeat(int amount) throws NoMoreMeatException {  // the throws keyword must be in the interface as it is a checked exception and method has to match
        if (amount <= 0) {
            throw new NoMoreMeatException();
        }

        System.out.println("Eating meat.");
    }

    @Override
    public void eatPlants(int amount) {
        if (amount <= 0) {
            throw new NoMorePlantsException();  // unchecked, so don't need to handle or declare
        }

        System.out.println("Eating plants.");
    }
}

public class MethodsWithExceptions {

    public static void main(String[] args) {
        Bear bear = new Bear();

        try {
            bear.eatMeat(2);  // also needs to be handled or declared here
            bear.eatPlants(-2);
        } catch (NoMorePlantsException e) { // this is child of RuntimeException
            e.printStackTrace();
            System.out.println("No more plants");
        } catch (RuntimeException e) { // RuntimeException child of Exception
            System.out.println("Runtime");
        } catch (NoMoreMeatException e) { // extends Exception
            e.printStackTrace();
            System.out.println("Bear is hungry");
        } finally {
            System.out.println("finally");
        }
        // bear.eatPlants(-2); // unchecked exception - no need to put inside try & catch block
    }


}
