package oops;

class A{
   
    public void method(){
        System.out.println("Method of class A");
    }

}


//in method over riding the method of the subclass is preffered over the method of parent class
class B extends A{
    @Override
    public void method(){
        System.out.println("overidden method os class B");
    }
}




public class MethodOverriding {
    public static void main(String[] args) {
    A a = new A() ;
    a.method();

    B b = new B() ; 
    b.method(); 


    }
}
