package ex_30_collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab237_Al_Iteration {
    public static void main(String[] args) {

        List<String> mylist= new ArrayList();


        mylist.add("ashish");
        mylist.add("Lalita");
        mylist.add("sharma");

        for(String name : mylist)
        {
            System.out.println(name);

        }


        System.out.println("to print 3");

        Iterator iterator = mylist.iterator();

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }
    }
}
