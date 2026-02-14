package ex_20_Polymorphisn_Methodoveridding;


public class Lab189 {
    public static void main(String[] args) {

        ashish a = new ashish();
        a.home();

        Father f1 = new Father();
        f1.home();

        Father f2 = new ashish();
        f2.home();

    }



}

class Father {
    void home() {

        System.out.println("2bhk");

    }


}

class ashish extends Father{
    @Override
    void home()
    {

        System.out.println("3bhk");

    }

}
