package academy.learnprogramming.methoddesign;

public class PassingDataBetweenMethods {

    public static void main(String[] args) {
        int number = 4;
        System.out.println("number= " + number);
        newNumber(5);
        System.out.println("number= " + number);

        String name = "Jimmy";
        System.out.println("name= " + name);
        newName(name);
        System.out.println("name= " + name);

        StringBuilder sb = new StringBuilder();

        build(sb);
        System.out.println("StringBuilder after build = " + sb);

        build2(sb);
        System.out.println("StringBuilder after build2 = " + sb);

        StringBuilder s = sb;
        s.append(" Anthony");
        System.out.println("Stringbuilder s after assigned value sb:" + s);
        System.out.println("Stringbuilder sb after s assigned value sb:" + s);
    }

    public static void newNumber(int number) {
        System.out.println("in newNumber number= " + number);
        number = 10;
        System.out.println("in newNumber number= " + number);
    }

    public static void newName(String name) {
        System.out.println("in newName name= " + name);
        name = "Timmy";
        System.out.println("in newName name= " + name);
    }

    public static void build(StringBuilder s) {
        s.append("Tom");
    }

    public static void build2(StringBuilder s) {
        s = new StringBuilder();
        s.append("Tim");
    }
}
