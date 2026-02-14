package ex_25_ENUM;

public class Lab200_ {
    public static void main(String[] args) {

        System.out.println(Env.QA.getBaseurl());

        if(Env.QA.getBaseurl().equalsIgnoreCase("qa.com"))
        {

            System.out.println("start on QA");

        }
    }

}


