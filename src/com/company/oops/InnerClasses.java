package oops;

public class InnerClasses{  
    private int data=30;  
    class Inner{  
     void msg(){System.out.println("data is "+data);}  
    }  
    public static void main(String args[]){  
     InnerClasses obj=new InnerClasses();  
     InnerClasses.Inner in=obj.new Inner();  
     in.msg();  
    }  
   } 
