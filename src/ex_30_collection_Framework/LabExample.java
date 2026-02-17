package ex_30_collection_Framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabExample {
    public static void main(String[] args) {

        // requirement: if we modify collection many times, LinkedList is preferred

        Scanner scanner = new Scanner(System.in);

        String continueInput = "Y";

        List<String> names = new ArrayList<>();

        while (continueInput.equalsIgnoreCase("Y")) {

            System.out.println("Enter the name:");
            String name = scanner.next();   // FIX 1: variable declaration corrected
            names.add(name);

            System.out.println("Do you want to continue (Y/N)?");
            continueInput = scanner.next();  // FIX 2: no need of extra nextLine()
        }

        System.out.println("Names entered are:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close(); // good practice
    }
}
