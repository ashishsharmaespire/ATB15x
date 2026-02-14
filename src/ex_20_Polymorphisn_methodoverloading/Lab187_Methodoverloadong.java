package ex_20_Polymorphisn_methodoverloading;

public class Lab187_Methodoverloadong {
    public static void main(String[] args) {

        Math m = new Math();
        int a = m.add(2,4);
        int b = m.add(3,4,5);


    }

}

class Math{

    int add(int a,int b)
    {

        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;


    }
    double add(double a,double b)
    {

        return a+b;
    }


}