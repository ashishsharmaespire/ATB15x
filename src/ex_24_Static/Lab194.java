package ex_24_Static;

public class Lab194 {

    public static void main(String[] args) {
        A a = new A();
    }
}

class A{

    static {

        System.out.println("called only one class");
        System.out.println("you can write");



    }

    static int a =10;
    static void m1()
    {

        System.out.println("static");

    }


}