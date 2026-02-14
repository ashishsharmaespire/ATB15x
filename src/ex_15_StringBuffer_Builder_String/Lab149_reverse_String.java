package ex_15_StringBuffer_Builder_String;

import java.util.Scanner;

public class Lab149_reverse_String {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter here");
        String input = scanner.next();

        String reverse = "";
        for(int i=input.length() -1;i>=0;i--)
        {

            reverse = reverse +input.charAt(i);

        }

        System.out.println(reverse);


    }


}


