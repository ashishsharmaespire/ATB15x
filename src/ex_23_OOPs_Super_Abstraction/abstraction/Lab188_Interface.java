package ex_23_OOPs_Super_Abstraction.abstraction;

public class Lab188_Interface {


}

interface F1{

    void icm();
    void money();

}
interface F2
{
    void money();


}

class Son implements F1,F2{


    @Override
    public void icm() {

    }

    @Override
    public void money() {

    }
}