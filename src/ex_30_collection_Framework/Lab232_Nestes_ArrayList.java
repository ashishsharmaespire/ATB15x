package ex_30_collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab232_Nestes_ArrayList {

    public static void main(String[] args) {

        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("orange");

        System.out.println(fruit);

        List vegetable = new ArrayList();
        fruit.add("apple");
        fruit.add("orange");

        System.out.println(vegetable);

        List all_fruit_Veg = new ArrayList();
        all_fruit_Veg.add(fruit);
        all_fruit_Veg.add(vegetable);
        System.out.println(all_fruit_Veg);
        System.out.println(all_fruit_Veg.size());



    }
}
