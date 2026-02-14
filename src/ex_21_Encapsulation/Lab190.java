package ex_21_Encapsulation;

public class Lab190 {

    public static void main(String[] args) {
        SBIBank ashish = new SBIBank("ashish",200);
        long bal = ashish.getBal();
        System.out.println(bal);

        ashish.setBal(300,false);
        System.out.println(ashish.getBal());

    }

}

class SBIBank
{
    private String name;
    private long bal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if(isCashier)
        {
            this.bal = bal;

        }else {

            System.out.println("not allowed");
        }



    }

    public SBIBank(String name,long bal)
    {

        this.name = name;
        this.bal = bal;


    }


}