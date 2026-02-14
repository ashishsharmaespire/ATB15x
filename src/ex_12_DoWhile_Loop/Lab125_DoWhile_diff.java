package ex_12_DoWhile_Loop;

public class Lab125_DoWhile_diff {

    public static void main(String[] args) {

        int a =0;

        while(a<0);
        {
            System.out.println(a); // this will never execute
            a++;
        }

        do {
            System.out.println(a)
            ;

        }while (a<0);

    }
}
