package ex_13_functions;

import java.util.Scanner;

public class lab134_funtion_arthime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner,"Enter the num 1");
        int b = readInt(scanner,"enter the num2"); // read int will check weather it is int or not


        int sum_result= sum(a,b);
        int sub_result= sub(a,b);
        int mul_result= mul(a,b);
        int div_result= div(a,b);
        int mod_result= mod(a,b);

        System.out.println(sum_result);
        System.out.println(sub_result);
        System.out.println(mul_result);
        System.out.println(div_result);
        System.out.println(mod_result);



        scanner.close();



    }

    static int readInt(Scanner scanner,String prompt) {
        System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();

        } else {
            System.out.println("enter ont int value");
            System.exit(0);
            return 0;
        }
    }
        static int sum(int a, int b)
        {
            return a+b;

        }
    static int mul(int a, int b)
    {
        return a*b;

    }
    static int sub(int a, int b)
    {
        return a-b;

    }
    static int div(int a, int b)
    {
        if(b==0)
        {
            throw new ArithmeticException("division not allowed");

        }
        return a/b;

    }

    static int mod(int a, int b)
    {
        return a%b;

    }





}
