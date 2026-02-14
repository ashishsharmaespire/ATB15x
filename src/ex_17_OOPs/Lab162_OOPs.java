package ex_17_OOPs;

public class Lab162_OOPs {
    public static void main(String[] args) {
        Baby b1 = new Baby();
        Baby b2 = new Baby("Ashish");
        Baby b3 = new Baby("Ashish", "10k");

    }
}
    class Baby{
        String name;

    Baby()
    {

        System.out.println("DC");
    }
    Baby(String name) // one paramter
    {

        System.out.println("Pc-name");
    }

    Baby(String name, String money) // two paramter
    {
        System.out.println("PC-name.age");


    }

    }

