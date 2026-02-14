package ex_23_OOPs_Super_Abstraction.abstraction;

public class Lab187_Interface {
    public static void main(String[] args) {

        car2 c = new car2();

        c.start();
        c.applyBreak();
        c.stop();
        c.drive();

        // default method call
        c.test();

        // static interface method call
        Enginer1.testEngine();
    }
}

interface Brakes {
    void applyBreak();
}

interface Enginer1 {

    void start();
    void stop();

    default void test() {
        System.out.println("complete");
    }

    static void testEngine() {
        System.out.println("concrete complete");
    }
}

class car2 implements Brakes, Enginer1 {

    void drive() {
        start();
        applyBreak();
        stop();
        System.out.println("Driving...");
    }

    @Override
    public void applyBreak() {
        System.out.println("Brake Applied");
    }

    @Override
    public void start() {
        System.out.println("Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Engine Stop");
    }
}
