package ex_30_collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab231_Arraylist {
    public static void main(String[] args) {


        List list = new ArrayList();

        list.add(30);
        list.add(true);
        list.add("ashish");

        Iterator iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());


        }

        for (Object o :list)
        {
            System.out.println(o);

        }


    }



}
