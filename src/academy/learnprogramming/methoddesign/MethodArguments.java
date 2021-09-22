package academy.learnprogramming.methoddesign;

public class MethodArguments {

    /* DIFFERENT NUMBER OF ARGUMENTS */

    int getZero() { // 0 arguments - niladic
        return 0;
    }

    int increment (int number) { // 1 argument - monadic
        return number++;
    }

    int sum (int a, int b) { // 2 arguments - dyadic
        return a + b;
    }

    int plusMinus(int a, int b, int c) {// 3 arguments - triadic
        return  a + b - c;
    }

    double average(double a, double b, double c, double d) { // 4+ arguments - polyadic
        return (a + b + c + d) / 4.0;
    }

    /* ARGUMENTS SEPARATED BY COMMAS */

        // void test(int a; int b) {} - doesn't compile - arguments separated by semi colon


    /* METHOD BODY */

        // void test() - doesn't compile - no brackets - missing method body

        void test(int a, int b) {}  // compiles with empty body

        // void test(int a);  // missing method body - doesn't compile

    /* RETURN STATEMENT */

}
