package ex_06_Ternary_Operator;

public class Lab065_Interview_Age_Classification {

    public static void main(String[] args) {

        //user will give input via comand line

            String AGE = args[0];
            int agr_user = Integer.parseInt(AGE); //25

        String result = (agr_user<18)? "Minor" : (agr_user<=60)?"Adult" : "Senor citizen";

        System.out.println(result);

    }
}
