package ex_16_Arrays;

import java.util.Scanner;

public class Lab167_Pyramid_Interview {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            // spaces
            for (int space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }

            // stars
            for (int star = 0; star <= 2 * i; star++) {
                System.out.print("*");
            }

            // next line
            System.out.println();
        }
    }
}
