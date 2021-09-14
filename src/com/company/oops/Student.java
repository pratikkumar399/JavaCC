package oops;

import java.util.Scanner;

public class Student {
    static Scanner  input = new Scanner(System.in) ;
    public static void main(String[] args) {
        ClasseObjects obj1 = new ClasseObjects() ;
        

        for (int i = 1; i <= 5; i++) {
            
            System.out.println("Enter name of student number " + i + " : " );
            obj1.name = input.next() ;
            System.out.println("Enter roll number of student number " + i + " : " );
            // obj1.rollNumber = input.nextInt() ;
            System.out.println("Enter address of student number " + i + " : " );
            obj1.address = input.next() ;
            System.out.println("Enter  the year in which the student number " + i + " joined the school : " );
            obj1.yearsjoin = input.nextInt() ;
            System.out.println("Name of student  "  + i  +  " is : "  + obj1.name + " " + " Address is : "+ obj1.address + " " +  "Rollnumber is : " + obj1.rollNumber + " " + " Year to join is :  " + obj1.yearsjoin);
        }


       
    }
}
