package ex_14_Strings;

public class Lab135_String_Immutable {

    public static void main(String[] args) {

        String name = "Ashish";
     boolean result=  name.contains("m");
        System.out.println(result);

        //string is immutable in nature

        name.toUpperCase();
        System.out.println(name);

    }
}
