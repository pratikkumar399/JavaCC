package oops;

class Isoceles{
   
    public void method(){
        System.out.println("I am an Isoceles  traiangle");
    }

}


//in method over riding the method of the subclass is preffered over the method of parent class
class Equilateral extends Isoceles{
    @Override
    public void method(){
        System.out.println("I am an  equilateral traiangle");
        System.out.println("I am  traiangle");
    }
}





public class MethodOverriding {
    public static void main(String[] args) {
    Equilateral a = new Equilateral(); ;
    a.method();

    Isoceles b = new Isoceles(); ; 
    b.method(); 


    }
}
