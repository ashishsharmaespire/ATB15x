package ex_23_OOPs_Super_Abstraction.abstraction;

public class Lab185_Abstract {

    public static void main(String[] args) {

        son s1 = new son();
        s1.loan50K();
        s1.load10k();
    }
}

abstract class Father{

    abstract  void loan50K(); // this is incomplate

    void load10k() //this is complete method
    {
        System.out.println("Given");

    }


}

class son extends Father{


    @Override
    void loan50K() {
        System.out.println("GIven by SOn");
    }
}