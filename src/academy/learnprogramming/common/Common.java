package academy.learnprogramming.common;

public class Common {

    public int publicNumber = 10;
    protected int protectedNumber = 20;
    int defaultNumber = 30;
    private int privateNumber = 40;

    public void publicPrint() {
        System.out.println("public");
    }

    protected void protectPrint() {
        System.out.println("protected");
    }

    void defaultPrint() {
        System.out.println("default");
    }

    private void privatePrint() {
        System.out.println("private");
    }

    public static void main(String[] args) {

        /* can call all methods from the same class */
        Common common = new Common();
        common.publicPrint();
        common.protectPrint();
        common.defaultPrint();
        common.privatePrint();

        /* fields with access modifiers */
        System.out.println("publicNumber:" + common.publicNumber);
        System.out.println("protectedNumber:" + common.protectedNumber);
        System.out.println("defaultNumber:" + common.defaultNumber);
        System.out.println("privateNumber:" + common.privateNumber);
    }
}
