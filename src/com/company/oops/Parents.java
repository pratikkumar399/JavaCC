package oops;

// A Java program to demonstrate that overridden  
// method can be called from sub-class 
  
// Base Class 
class Parent1 
{ 
    void show() 
    { 
        System.out.println("Parent's show()"); 
    } 
} 
  
// Inherited class 
class Child1 extends Parent1 
{ 
    // This method overrides show() of Parent 
   
    void show() 
    { 
        
        System.out.println("Child's show()"); 
    } 
} 
  
// Driver class 
class Parents 
{ 
    public static void main(String[] args) 
    { 
        Parent1 obj = new Parent1(); 
        obj.show(); 
        Parent1 obj2 = new Parent1(); 
        obj2.show(); 
        // // char a = 'A' ;
        // // a++ ;
        // int x = 3 ;
        // int y = 5 ;
        // int z = 10 ;
        // System.out.println(++z + y -y + z + x++);
        // // System.out.println(x++ );
    } 
}