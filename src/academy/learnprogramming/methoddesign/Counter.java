package academy.learnprogramming.methoddesign;

public class Counter {

    public static int count;
    public int anotherCount;

    public Counter() {
        count++;
        anotherCount++;
    }

    public static void main(String[] args) {
        Counter one = new Counter();
        Counter two = new Counter();
        Counter three = new Counter();
        Counter four = new Counter();

        // count field is static - shared by all instances
        System.out.println(count);
        System.out.println(one.count);
        System.out.println(two.count);
        System.out.println(three.count);
        System.out.println(four.count);
        count++;
        System.out.println(count);
        System.out.println(one.count);
        System.out.println(two.count);
        System.out.println(three.count);
        System.out.println(four.count);

        // anotherCount non-static - each instance has own version of it
        System.out.println(one.anotherCount);
        System.out.println(two.anotherCount);
        System.out.println(three.anotherCount);
        System.out.println(four.anotherCount);

        one.anotherCount = 2;
        System.out.println(one.anotherCount);
        two.anotherCount = 3;
        System.out.println(two.anotherCount);
        three.anotherCount = 4;
        System.out.println(three.anotherCount);
        four.anotherCount = 5;
        System.out.println(four.anotherCount);

    }
}
