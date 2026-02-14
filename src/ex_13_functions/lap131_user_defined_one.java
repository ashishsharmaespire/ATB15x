package ex_13_functions;

import java.util.Scanner;

public class lap131_user_defined_one {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number a =");
        int a = scanner.nextInt();
        System.out.println("Enter a number b =");
        int b = scanner.nextInt();
        int sum = sum_two_number(a,b);
        System.out.println("sum of integer" +sum);


    }

    static int sum_two_number(int x ,int y) //categeory 4
    {
        return x+y;

    }



}
