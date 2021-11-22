package oops2;

class Employee { 
    public static int base = 10000; 
    int salary() 
    { 
        return base; 
    } 
} 
  
class Manager extends Employee { 
    int salary() 
    { 
        return base + 20000; 
    } 
} 
  
 
class Clerk extends Employee { 
    int salary() 
    { 
        return base + 10000; 
    } 
} 
  
public class Empployee { 
    static void printSalary(Employee e) 
    { 
        System.out.println(e.salary()); 
    } 
  
    public static void main(String[] args) 
    { 
        Employee obj1 = new Manager(); 
  
        System.out.print("Manager's salary : "); 
        printSalary(obj1); 
  
        Employee obj2 = new Clerk(); 
        System.out.print("Clerk's salary : "); 
        printSalary(obj2); 
    } 
}