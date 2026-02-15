package ex_29_Generics;

public class Lab224 {

    // its a core concept work with any type of datatype
    public static void main(String[] args) {

        temp_sum(2,4); // we cannot use diffrenct type of datatype
        temp_sum("ashish", "sharma");



    }
        static  <T> T temp_sum(T a, T b) // t means any datatype you can pass in the main
        {
            System.out.println(a );
            System.out.println(b);

            return null;

        }

    }



