package academy.learnprogramming.common;

public class AnotherCommon {

    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
        common.defaultPrint();
        common.protectPrint();
        // common.privatePrint(); // private method so can't be create here

        System.out.println("publicNumber:" + common.publicNumber);
        System.out.println("protectedNumber:" + common.protectedNumber);
        System.out.println("defaultNumber:" + common.defaultNumber);
        // System.out.println("privateNumber:" + common.privateNumber); // cannot access outside it's class
    }
}
