package ex_29_Generics;

import java.util.ArrayList;
import java.util.List;

public class Lab_realexam {

    public static void main(String[] args) {

        // List<String> mylist = new ArrayList<String>();

        List mylist = new ArrayList(); // Raw type

        mylist.add("ashish");
        mylist.add("sharma");

        mylist.add(123);

    }
}
