package ex_15_StringBuffer_Builder_String;

import java.util.Scanner;

public class Lab150_String_Palidrome { // after revrse string same
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String user_input = scanner.next();
        String reverse ="";

        for(int i =user_input.length()-1;i>=0;i--)

        {
            reverse = reverse+user_input.charAt(i);

        }

        if (reverse.equalsIgnoreCase(user_input))
        {

            System.out.println("Palindrome");
        }
    else {

            System.out.println("no palindrome");
        }

    }
}
