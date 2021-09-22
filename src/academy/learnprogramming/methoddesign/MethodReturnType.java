package academy.learnprogramming.methoddesign;

public class MethodReturnType {

    public void jump() {
    } // return type void

    public void jump2() { // return type void
        return; // return statement is redundant if retrun type is void
    }

    public String jump3() {
        return "";
    }

    // non-void return type
    String jump6(int a) {
        if (a == 5) {
            return " ";
        }

        return "abc";
    }

    int getInt() {
        return 9;
    }

    // correct return type
    int getLong() {
        return (int)9L; // need to cast long to int so it compiles
    }

    // using local variables

    int expanded() {
        int temp = 10;
        return temp;
    }

    int refactoredExpanded() {
        return 10; // shorter than writing two lines of code
    }

    // boolean return type
    boolean isTrue() {
        return 5 < 10;
    }

    // method names
    public void test() {}

    // public void 2test() {} // cannot start method name with a number - won't compile

    // public void void() {} // cannot use keyword in method name - won't compile

    public void $test() {} // compiles
    public void _test() {} // compiles


}
