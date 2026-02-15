package ex_30_collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab227_List
{

    public static void main(String[] args) {

        List fruits = List.of("orange","apple","Mango"); //static method pnly, losy is an interface


        System.out.println(fruits);

        // we cannot create object

        List arrayList = new ArrayList();

        arrayList.add("Ashish");
        arrayList.add(123);
        arrayList.add(true);
        // can store any type of datatype




    }


}
