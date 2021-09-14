package oops;

class Bike {
   public void greet(){
       System.out.println("good morning friends . ! chai pilo");

   }

   public void name(){
       System.out.println("apna Bike ka naam batao sir ");
   }
}

class SuperBike extends Bike{
    public void name(){
        System.out.println("Acha tumharre pas superbike hain");
    }
}




public class Dynamic_dispatch {
 
    public static void main(String[] args) {
        Bike object = new SuperBike() ;  // yes it is allowed 
  
        object.name();
         
    }



}
