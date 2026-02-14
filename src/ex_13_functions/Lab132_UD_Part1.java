package ex_13_functions;

import java.util.Scanner;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {



        ///without parameter without return type

        wop_wor_greet();

        //2: withot para but return type

        String msg = wop_wr_greet_2();

        // 3: with para but no return

        greet_with_details("ashish",65,100);

        //with parmater and with return type
        int sum = sum_of_two_numbers(3,4);
    }

    static int sum_of_two_numbers(int i, int i1) {
     return i+ i1;

    }

    static void greet_with_details(String ashish, int i, int i1) {
    }

    static String wop_wr_greet_2() {
        return "ashish";
    }

    static void wop_wor_greet() {
    }


}
