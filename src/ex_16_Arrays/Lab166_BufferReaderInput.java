package ex_16_Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lab166_BufferReaderInput {

    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value");

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        System.out.println("You entered: " + N);
    }
}
