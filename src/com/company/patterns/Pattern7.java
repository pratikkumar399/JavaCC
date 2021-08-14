package patterns;

import java.util.Scanner;

public class Pattern7 {
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
           int val = 1 ;
           while( val<= i){
               System.out.print(val);
               val++ ;
      
           }
            
            System.out.println();
            i++ ;

        }
     }
}
