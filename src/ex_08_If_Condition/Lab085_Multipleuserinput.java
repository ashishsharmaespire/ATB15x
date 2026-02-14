package ex_08_If_Condition;

import java.util.Scanner;

public class Lab085_Multipleuserinput {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value 1");

        int side1= scanner.nextInt();


        int side2= scanner.nextInt();

        System.out.println("Enter value 2");

        int side3= scanner.nextInt();
        System.out.println("Enter value 3");

        System.out.println(side1+side2+side3);
        scanner.close();

    }
}
