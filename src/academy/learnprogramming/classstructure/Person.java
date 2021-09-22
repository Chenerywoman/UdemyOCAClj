package academy.learnprogramming.classstructure;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person() {
        this("Eric", "Johnson");
    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        // this.lastName = lastName; // don't need to differentiate
        lastName = lastName;
        String last = "myName";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
       // return this.firstName;
        return firstName;
    }

    public String getFullName() {
        // return this.firstName + " " + this.lastName;  // this not necessary as no local variable or parameters
        // with same name
        return firstName + lastName;
    }
}
