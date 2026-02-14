package ex_14_Strings;

public class Lab144_Stringexample3 {

    public static void main(String[] args) {

    String s ="Java".substring(2); // it will remove the start 2
        System.out.println(s);

        char[] arr = "Java".toCharArray();
        System.out.println(arr);

        boolean b = "".isBlank();
        System.out.println(b);

        String s2 ="ab".repeat(2);
        System.out.println(s2);


        boolean b11 = "Java".equalsIgnoreCase("java");
        System.out.println(b11);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);
    }
}
