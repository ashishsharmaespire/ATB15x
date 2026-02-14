package ex_22_AccessModifier.police;

public class Cop {

    private int gun;
    private String icard;

    public Cop(int bullet)
    {

        this.gun =bullet;


    }
    public void canShoot()
    {

        System.out.println("yes");

    }

        void thisDefault(){


            System.out.println("Hi cop");


        }




}
