package oops;

import java.util.Scanner;

public class Student {
    static Scanner  input = new Scanner(System.in) ;
    public static void main(String[] args) {
        ClasseObjects obj1 = new ClasseObjects() ;
        

        for (int i = 0; i < 2; i++) {
            
            obj1.name = input.next() ;
            obj1.rollNumber = input.nextInt() ;
            obj1.address = input.next() ;
            obj1.yearsjoin = input.nextInt() ;
            System.out.println("Name is " + obj1.name + " " + " Address is "+ obj1.address + " " +  "Rollnumber is" + obj1.rollNumber + " " + " Year to join is" + obj1.yearsjoin);
        }


       
    }
}
