package ex_08_If_Condition;

public class Lab079_IF {

    public static void main(String[] args) {
        System.out.println("enter age");

        int age = Integer.parseInt(args[0]);

        if(age>18)
        {

            System.out.println("you are adult");
        }
        else {

            System.out.println("no vote");

        }

    }
}
