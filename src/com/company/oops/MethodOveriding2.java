package oops;

class Vehicle1 {
    void run() {
        System.out.println("Vehicle is running ");
    }
}

class Bike1 extends Vehicle1 {
    void run() {
        System.out.println("Bike is running ");
    }
}

public class MethodOveriding2 {

    public static void main(String[] args) {
        // so the type of the object called decides which class method will be called 
        Bike1 obj = new Bike1();
        obj.run();
    }

}
