package academy.learnprogramming.inheritance;

public interface Run extends Walk{

    default int getSpeed() {
        return 10;
    }
}
