package ex_09_Switch;


public class Lab092_Interview {
    public static void main(String[] args){

// this is also new in after jdk 13 wher we can ue multiple conditoin
        int a =11;
        switch (-1)
        {
            // this is new syntax after jdk 13 without using break
            case -1:
                System.out.println("10");
                 break;
            case 9:
                System.out.println("all are toys");
                break;
            default :
                System.out.println("default");



        }
    }
}



