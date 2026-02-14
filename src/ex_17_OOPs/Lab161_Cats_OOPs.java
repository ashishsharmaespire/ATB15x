package ex_17_OOPs;

public class Lab161_Cats_OOPs {

    public static void main(String[] args) {

        Cat c1 = new Cat();
        Cat c2 = new Cat("lucy");
        Cat c3 = new Cat("ashish");

        System.out.println(c2.name);
        System.out.println(c3.name);
    }
}

class Cat {

    String name;

    // Default constructor
    Cat() {
        System.out.println("Default Constructor");
    }

    // Parameterized constructor
    Cat(String nameGiven) {
        this.name = nameGiven;  //this is a refrence varibale to the currect object
    }
}
