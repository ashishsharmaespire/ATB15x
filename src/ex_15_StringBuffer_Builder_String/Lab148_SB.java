package ex_15_StringBuffer_Builder_String;

public class Lab148_SB {
    public static void main(String[] args) {

            StringBuffer sb = new StringBuffer("Java");
            sb.append("Programing");
        System.out.println(sb);

        sb.replace(0,4,"C++");
        System.out.println(sb);
    }


}


