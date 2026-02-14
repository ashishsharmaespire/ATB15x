package ex_14_Strings;

public class Lab143_StringExample {

    public static void main(String[] args) {

        String s ="Java";
        char c = s.charAt(2); // charat means start from 0 index
        System.out.println(c); // at 2 v is present

        int result ="abc".compareTo("ABC"); // compare two string based on unique both same give 0
        System.out.println(result);

        int idx = "JAva".indexOf("a");
        System.out.println(idx);
        int idx2 = "JAva".lastIndexOf("a");
        System.out.println(idx2);

        boolean b = "".isEmpty();
        System.out.println(b);

        String s11 = String.join("*","Java","Python");
        System.out.println(s11);

        String s12="Java".replace('a','o');
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja");
        System.out.println(b1);




    }
}
