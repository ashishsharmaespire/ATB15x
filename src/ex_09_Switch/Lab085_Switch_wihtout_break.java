package ex_09_Switch;


import java.util.Scanner;

public class Lab085_Switch_wihtout_break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1-7");

        if(scanner.hasNextInt()) {


            int day = scanner.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");

                case 3:
                    System.out.println("wed");

                case 4:
                    System.out.println("Thus");
                    break;
                case 5:
                    System.out.println("friday");
                    break;

                case 6:
                    System.out.println("saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;

                default:
                    System.out.println("please enter valid data");


            }
        }
        else {
            System.out.println("Invalid ");
        }
    }
}
