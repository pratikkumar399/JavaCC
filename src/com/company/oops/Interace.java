package oops;

interface Car1 {
    void type();
 }
 interface Car2 {
    void type2();
 }
 interface Car3 {
    void type3();
 }
 class Car123 implements Car1, Car2, Car3 {
    public void type() {
       System.out.println("NAno");
    }
    public void type2() {
       System.out.println("Lambho");
    }
    public void type3() {
       System.out.println("Audi Q8");
    }
 }

public class Interace {
    public static void main(String args[]) {
        Car123 a = new Car123();
        a.type();
        a.type2();
        a.type3();
     }
}
