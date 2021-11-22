package oops;

import java.util.Scanner;

class Employee {
    int salary;
    int numberofhours;

    public void getInfo(int salary, int numberofhours) {
        this.salary = salary;
        this.numberofhours = numberofhours;
    }

    public int AddSal() {
        if (salary < 500) {
            salary = salary + 10;
        }
        return salary ;
    }

}

public class Salary {
    private Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
      Employee obj = new Employee() ;
      obj.getInfo(435, 10) ;
  
      System.out.println( obj.AddSal());

     }

}
