package patterns;

import java.util.Scanner;

public class Pattern6 {
    private static Scanner input = new Scanner(System.in) ;
     public static void main(String[] args) {
        int n = input.nextInt();
        int i =1  ;   
        while(i <= n){
           int spaces = 1 ;
           while(spaces <= n-i){
               System.out.print(' ');
            spaces++ ;
           }
           int stars =1 ;
           while(stars <= i){
               System.out.print('*');
               stars++ ;
      
           }
            
            System.out.println();
            i++ ;

        }
     }
}
