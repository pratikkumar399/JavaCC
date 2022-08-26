package oops;

class show1 {
    void show() {
        System.out.println("Parent class method");
    }
}

class show2 extends show1{
    void show() {
        super.show();
        System.out.println("Child class method");
    }
}

public class AnotherOverriding {
    public static void main(String[] args) {
        show2 obj1 = new show2();
        obj1.show();

        show1 obj2 = new show1();
        obj2.show();
    }
}
