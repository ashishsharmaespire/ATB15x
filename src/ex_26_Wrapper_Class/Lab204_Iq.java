package ex_26_Wrapper_Class;

public class Lab204_Iq {

    public static void main(String[] args) {


        Integer a = 127;
        Integer b = 127;

        System.out.println(a==b); // cahed

        Integer c=128;
        Integer d=128;

        System.out.println(c==d);//not cathched

        System.out.println(c.equals(d));

        Integer aa=104;
        System.out.println(aa.toString());
        System.out.println(aa.toString() instanceof String);



    }
}