package academy.learnprogramming.inheritance;

public class Eagle extends Bird {

    public int fly(int height ){
        System.out.println("Eagle is flying at " + height + " km/h");
        return height;
    }

    @Override
    public void eat(int amount) {
        super.eat(amount);
    }
}
