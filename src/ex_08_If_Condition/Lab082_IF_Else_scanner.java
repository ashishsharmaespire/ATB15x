package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_IF_Else_scanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scnner class cannot modified
        System.out.println("Enter age");
        int age = scanner.nextInt();
        //  double d = scanner.nextDouble();
        // float f = scanner.nextFloat();
        System.out.println(age);

        if (age> 20)
        {

            System.out.println("adult");
        }

        else
        {

            System.out.println("no adult");
        }
    }
}
