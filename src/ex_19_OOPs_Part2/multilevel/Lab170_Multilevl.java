package ex_19_OOPs_Part2.multilevel;

public class Lab170_Multilevl {

    public static void main(String[] args) {

        Son ashish= new Son();
        ashish.home();
        ashish.bhk3();
        ashish.extraMoney();
        ashish.gf();

        Father f = new Father();
        f.extraMoney();
        f.gf();
        f.home();
        //f.bhk3 not able to use



        //Dynamic Dispacth - who even object created the refrenc allign to that

        GrandFather g1 = new Son();
        Father f1 = new Son();


    }
}
