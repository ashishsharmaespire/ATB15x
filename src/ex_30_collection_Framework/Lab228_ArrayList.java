package ex_30_collection_Framework;

import java.util.*;

public class Lab228_ArrayList {
    public static void main(String[] args) {

        List list = new ArrayList(); // bydfeault it alwsya store the 10

        list.add("ashish");
        list.add(1);
        list.add(true);
        System.out.println(list.size());

        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));
        System.out.println(list.indexOf(2));
        System.out.println(list.lastIndexOf(1));
        System.out.println(list);
        System.out.println("-----");

        for(int i =0; i< list.size();i++)
            {

                System.out.println(list.get(i));

            }

        System.out.println("-------");

        for (Object o:list)
        {

            System.out.println(o);

        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext())
        {

            System.out.println(iterator.next());
        }

    }
}
