package oops;

abstract class Parent12 {
    abstract void message();
}

class Type12 extends Parent12 {
    void message() {
        System.out.println("This is first subclass");
    }
}

class Type123 extends Parent12 {
    void message() {
        System.out.println("This is first subclass");
    }
}

public class Parentsabstract {
    public static void main(String[] args) {
        Type12 obj1 = new Type12();
        Type123 obj2 = new Type123();
        obj1.message();
        obj2.message();

    }
}
