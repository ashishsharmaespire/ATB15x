package ex_09_Switch;


import java.util.Scanner;

public class Lab089_Interview {
    public static void main(String[] args){


        //boolean is not supported by switch
        char ch ='A';
        switch (ch)
        {
            case 65:
                System.out.println("Match ascii");
        break;

            default:
                System.out.println("NO match");
        }



    }
}



