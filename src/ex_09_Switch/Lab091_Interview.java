package ex_09_Switch;


public class Lab091_Interview {
    public static void main(String[] args){

// this is also new in after jdk 13 wher we can ue multiple conditoin
        int itemCode =007;
        switch (itemCode)
        {
            // this is new syntax after jdk 13 without using break
            case 001,002,005:
                System.out.println("all are electroninc");
                 break;
            case 003,006,007:
                System.out.println("all are toys");
                break;
            default :
                System.out.println("default");



        }
    }
}



