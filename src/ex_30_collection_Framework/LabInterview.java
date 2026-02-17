package ex_30_collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class LabInterview {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(4);

        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());

        for (Integer o:al)
        {
            System.out.println(6*o);

        }

        Vector v = new Vector();
        v.add("ashish");
        v.add("sharma");
        v.add("amit");

        Enumeration<String> e = v.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());

        }
    }
}
