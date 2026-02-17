package ex_30_collection_Framework;

import java.util.Stack;

public class Lab238_Stack {

    public static void main(String[] args) {

        Stack s1 = new Stack();
        //LIFO

        Stack s = new Stack();
        s.add("AShish");
        s.add("sharma");
        s.add("lalita");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek());//lifo // not remove element
        System.out.println(s.pop());// remove the element
        System.out.println(s);

        System.out.println(s.add("amit"));
        System.out.println(s);

        s.push("love"); // top in the stack

        s.add(2,"ravi");




    }
}
