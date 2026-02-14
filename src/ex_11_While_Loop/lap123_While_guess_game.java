package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class lap123_While_guess_game {
    public static void main(String[] args) {
            //gues a number 1 to 100;

        Random random = new Random();

        int numbertoGuess= random.nextInt(100) ; // bound is teling max value
       // System.out.println(numbertoGuess);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int guess;
        int attempts=0;

        while (true)
        {

                if(!scanner.hasNextInt())
                {
                    System.out.println("invald input");
                    scanner.next();
                    continue;

                }

                    guess= scanner.nextInt();
                attempts++;

                if(guess<numbertoGuess)
                {
                    System.out.println("To low try again");


                } else if (guess>numbertoGuess) {
                    System.out.println("too high, try again");


                }else
                {

                    System.out.println("correct" + attempts);
                    break;
                }

        }


    }
}
