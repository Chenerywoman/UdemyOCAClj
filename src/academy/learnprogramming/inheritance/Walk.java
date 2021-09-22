package academy.learnprogramming.inheritance;

public interface Walk {

    default int getSpeed() {
        return 5;
    }
}
