package ex_14_Strings;

public class Lab140_String_Interview_p2 {

    public static void main(String[] args) {

    String s1 ="Hello";
    String s4 ="hello";
    String s11= "Hello";

    String s2 = new String("hello"); // for new always crate a new space
        String s3 = new String("Hello");

        //== comparsion opeator
        System.out.println(s1==s2); // false becusd one present in object and nother in string pool

        System.out.println(s2==s3);// false
        System.out.println(s1==s11);// true becuase same loation

        System.out.println(s1.equals(s2)); // true brcause it check only value

        System.out.println(s2.equalsIgnoreCase(s3));// it will ignore the case
    }
}
