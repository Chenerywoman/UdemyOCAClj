package academy.learnprogramming.exceptions;

public class CatchingExceptions {

    static class MuseumClosed extends RuntimeException {
    } // superclass

    static class MuseumClosedForLunch extends MuseumClosed {
    }

    public static void main(String[] args) {
        try {
            visitMuseum();
        } catch (MuseumClosedForLunch mc) {
            System.out.println("Closed for lunch, come back in two hours.");
        } catch (MuseumClosed mc) {
            System.out.println("Closed");
        }

        System.out.println(calculate());
    }

    public static void visitMuseum() {
        boolean b = Math.random() < 0.5;

        if (b) {
            throw new MuseumClosed();
        }

        throw new MuseumClosedForLunch();
    }

    public static String calculate() {
        String result = "";
        String str = null;

        try {
            try {
                result += "start"; // result = start
                str.length();
                result += "end";

            } catch (NullPointerException e) {
                result += "npe"; // result = startnpe
                throw new RuntimeException();
            } finally {
                result += "finally";  // result = startnpefinally
                throw new Exception();
            }

        } catch (Exception e) {
            result += "finished"; // result  = startnpefinallyfinished
        }

        return result;
    }
}
