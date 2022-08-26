package oops ;

import java.io.*;
class Triangle{
    
    public  void triangle(){
          
          System.out.println("I am a triangle");
       }
 };
 
 class Isosceles extends Triangle{
      
      public void isosceles(){
           System.out.println("I am an isosceles triangle");
         }
 };
 
 
 class Equilateral1 extends Isosceles{
      
      public void equilateral(){
           System.out.println("I am an equilateral triangle");
         }
 };
    
 //Write your code here.


public class Hello {
    public static void main(String[] args) {
        Equilateral1 eqr = new Equilateral1();
     eqr.equilateral();
     eqr.isosceles();
     eqr.triangle();
        
    }
}