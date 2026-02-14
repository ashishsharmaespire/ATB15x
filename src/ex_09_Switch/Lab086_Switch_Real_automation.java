package ex_09_Switch;


import java.util.Locale;
import java.util.Scanner;

public class Lab086_Switch_Real_automation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");

        String browser = scanner.next();
        browser = browser.toLowerCase(); // it will match case sesnistive

        switch (browser)
        {
            case "chrome":
                System.out.println("starting chrome");
break;
            case"edge":
                System.out.println("starting edge");
break;
            case"firefox":
                System.out.println("starting firefox");
break;
            default:
                System.out.println("wrong choice");

        }




            }
        }

