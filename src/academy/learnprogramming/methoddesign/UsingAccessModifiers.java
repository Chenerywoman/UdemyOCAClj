package academy.learnprogramming.methoddesign;

import academy.learnprogramming.common.Common;

public class UsingAccessModifiers {

    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();

        System.out.println("publicNumber:" + common.publicNumber);
        // System.out.println("protectedNumber:" + common.protectedNumber); // cannot access outside package
        // System.out.println("defaultNumber:" + common.defaultNumber); // cannot access outside package
        // System.out.println("privateNumber:" + common.privateNumber); // cannot access outside package
    }
}
