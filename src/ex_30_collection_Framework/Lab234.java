package ex_30_collection_Framework;

import java.util.LinkedList;

public class Lab234 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Apple");
        list.add("Apple");
        list.add("Apple");
        list.add("Mango");

        list.addFirst("Ashish");
        list.addLast("sharma");
        System.out.println(list);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(2));
        list.removeFirst();
        System.out.println(list.contains("lalita"));
            list.remove(2);

    }
}
