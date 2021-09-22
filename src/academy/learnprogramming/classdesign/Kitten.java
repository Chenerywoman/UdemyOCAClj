package academy.learnprogramming.classdesign;

public class Kitten {

    // examples of constructor with different access modifiers
    // can't have different constructors with different access modifiers but same parameters
    private Kitten() {}

    public Kitten(String kitten) {}

    protected Kitten(int kitten) {}
}
