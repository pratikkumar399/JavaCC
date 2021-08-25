package basicprograms;


public class Const {
    int rollnumber;  
    String name;  
    int ageofstudent;  
    
    
    Const(int i,String n){  
    rollnumber = i;  
    name = n;  
    }  
    Const(int i,String n, int age){  
    rollnumber = i;  
    name = n;  
    ageofstudent = age ;
    }  
    void display(){System.out.println(rollnumber +  name  + ageofstudent );}  
   
    public static void main(String args[]){  
        Const s1 = new Const(994,"hks"); 
        Const s2 = new Const(64,"sds");
        Const s3 = new Const(44,"sdd",8);  
    s1.display();  
    s2.display();  
    s3.display();  
   }  
}
