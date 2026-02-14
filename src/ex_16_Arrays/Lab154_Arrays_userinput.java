package ex_16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab154_Arrays_userinput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size");
        int size = scanner.nextInt();

        int[] marks = new int[size];

        for(int i=0 ; i<marks.length;i++)
        {
            System.out.println("enter marks");
            marks[i]=scanner.nextInt();

        }
        System.out.println("====");

        for (int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);

        }




    }
}
