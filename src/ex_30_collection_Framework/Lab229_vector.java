package ex_30_collection_Framework;

import java.util.ArrayList;
import java.util.Vector;

public class Lab229_vector {

    public static void main(String[] args) {

        Vector v = new Vector();
        v.add("Ashish");
        v.add("amit");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        v.remove("Ashish");
        System.out.println(v);
        //it is a part of collection only ,similar to arraylist , threadsafe

        ArrayList a = new ArrayList();
        a.add("ashish");
        a.add("sharma");

    }


}



