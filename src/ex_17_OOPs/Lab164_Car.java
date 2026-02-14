package ex_17_OOPs;

public class Lab164_Car {
    public static void main(String[] args) {


        car t = new car();
        System.out.println(t.name);
        car p = new car("Xuv");
        car p1 = new car("maruti","2016");
        System.out.println(p.name);
        System.out.println(p1.name);
        System.out.println(p1.model);


    }


}

class  car{

    String name;
    int year;
    String model;

car()
{
    name= "Unknon car";
    year =1992;
    model="XXX";




}
car (String nameGiven)
{

    this.name=nameGiven;

}
    car (String nameGiven,String model)
    {

        this.name=nameGiven;
        this.model= model;

    }


}
