package ex_10_For_Loop;

import java.util.Scanner;

public class Lab115_Factorial_Interview {

    public static void main(String[] args) {

        //for negtive value asnwer will e 1 always

        System.out.println("welcome factorial");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the positive int number");
       int fact =1;
            if(scanner.hasNextInt()) {
                int n = scanner.nextInt();
                System.out.println(n);


                for (int i = 1; i <= n; i++) {

                    fact = fact * i;

                }
                System.out.println("Factorial is " +fact);
            }

            else
            {
                System.out.println("please emter the correct data");

            }

        scanner.close();


    }
}
