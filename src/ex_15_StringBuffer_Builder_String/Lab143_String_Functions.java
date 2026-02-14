package ex_15_StringBuffer_Builder_String;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "    ashish   SHarma    ";
        System.out.println(name.trim());

        String s0 = "ashish";
        String s1 = new String("ashish");

        StringBuffer stringBuffer = new StringBuffer("ashish");
        StringBuilder stringBuilder = new StringBuilder("ashish");

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

    }


}


