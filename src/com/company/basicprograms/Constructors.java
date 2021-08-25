package basicprograms;


public class Constructors {
    int id;  
    String name;  
    int age1;  
    
    
    Constructors(int i,String n){  
    id = i;  
    name = n;  
    }  
    Constructors(int i,String n, int age){  
    id = i;  
    name = n;  
    age1 = age ;
    }  
    void display(){System.out.println("UId is " + id  +" name is :"+name+" age is :  "+ age1);}  
   
    public static void main(String args[]){  
        Constructors obj3 = new Constructors(2834,"Lovepreet");  //default 
        Constructors obj1 = new Constructors(2820,"Pratik");  //paramaterized
        Constructors obj2 = new Constructors(2830,"Ravi",65);  //overloaded
    obj1.display();  
    obj2.display();  
    obj3.display();  
   }  
}
