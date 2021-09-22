package academy.learnprogramming.methoddesign;

public class MethodDesign {

    public void jump() {};

    void jump2() {};

    public final void jump3() {};

    public static final void jump4() {}; // warning because static methods cannot be final, although will compile

    public final static void jump5() {}; // still compiles - order of specifiers doesn't matter

    final static public void jump6() {};  // will compile
}
