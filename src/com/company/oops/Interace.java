package oops;

interface Car1 {
   void type();

   final int a = 0;

   static void dis1() {
      System.out.println("Static method in interfaces , implemented after updates in java 8");
   }

   default void display() {
      System.out.println("Hello there , Im the default method of interface car1");
   }
}

interface Car2 {
   void type2();
}

interface Car3 {
   void type3();
}

interface Hell01 extends Car3{

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
      a.display();
      a.type();
      a.type2();
      a.type3();
   }
}
