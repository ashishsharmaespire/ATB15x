package ex_09_Switch;


public class Lab090_Interview {
    public static void main(String[] args){


        int itemCode =002;
        switch (itemCode)
        {
            // this is new syntax after jdk 13 without using break
            case 001 -> System.out.println("001");
            case 002-> System.out.println("002");
            case 003-> System.out.println("003");
            default -> System.out.println("default");



        }
    }
}



