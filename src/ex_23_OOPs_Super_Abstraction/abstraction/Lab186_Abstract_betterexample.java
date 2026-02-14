package ex_23_OOPs_Super_Abstraction.abstraction;

public class Lab186_Abstract_betterexample {


    public static void main(String[] args) {


         car c = new car();
         c.drive();
    }
}




abstract class car1
{

    abstract void startcar();
    abstract void stopcar();


}


class  car extends car1
{

        void drive()
        {

            System.out.println("Drive car");
            startcar();

            stopcar();



        }

    @Override
    void startcar() {
        System.out.println("Statting a car");
    }

    @Override
    void stopcar() {

        System.out.println("stop the car");
    }
}