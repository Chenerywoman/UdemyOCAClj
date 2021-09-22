package academy.learnprogramming.arrays;

public class ForEachLoop {

    public static void main(String[] args) {
        String[] names = {"Jimmy", "John", "Anthony"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("name: " + names[i]);
        }

        for (String name : names) {
            System.out.println("name: " + name);
        }

        // cannot change array elements
        for (String name : names) {
            name = name + " " + name;
        }

        for (String name : names) {
            System.out.println("name: " + name);

        }

        StringBuilder[] builders = {
                new StringBuilder("For"),
                new StringBuilder("Loop")
        };

        // can change objects
        for (StringBuilder builder : builders) {
            System.out.println(builder);
        }

        for (StringBuilder builder : builders) { // changes the elements in the individual Stringbuilders
            builder.append("123");
        }

        for(StringBuilder builder: builders) {
            System.out.println(builder);
        }

        // use toCharArray to loop through a String
        String pets = "Parrot";

        for (char c: pets.toCharArray()) {
            System.out.println(c);
        }




    }


}
