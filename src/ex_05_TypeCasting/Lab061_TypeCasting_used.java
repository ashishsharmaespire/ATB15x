package ex_05_TypeCasting;

public class Lab061_TypeCasting_used {

    public static void main(String[] args) {
        int course =100;
        float NSRT_GST =18.45f;

        //int total = course + NSRT_GST; // narrowirnf implcit not allowed
        int total = course +(int) NSRT_GST; // narrowinf explicit
        System.out.println(total);

        float total2 = course +NSRT_GST; // widdening implicit
        System.out.println(total2);



    }
}
