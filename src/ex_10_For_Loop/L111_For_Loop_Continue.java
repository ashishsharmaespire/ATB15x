package ex_10_For_Loop;

import java.util.Scanner;

public class L111_For_Loop_Continue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = scanner.nextInt();
        for(int i=0;i<num;i++)
        {
            if(i==5){
                continue; // means skip

            }
            System.out.println(i);

        }


    }
}
