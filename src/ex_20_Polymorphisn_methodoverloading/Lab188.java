package ex_20_Polymorphisn_methodoverloading;

public class Lab188 {
    public static void main(String[] args) {
        WebAuto au = new WebAuto();
        au.open();
        au.open("chrome");
    }



}

class WebAuto
{
    void open()
    {
        System.out.println("deafult");

    }
    void open(String browser)
    {
        System.out.println("starting" + browser);


    }


}
