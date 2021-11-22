package patterns;

import java.util.Scanner;

public class Character2 {
    private static Scanner input = new Scanner(System.in) ;
    public static void main(String[] args) {
        int n = input.nextInt() ;
        int i = 1 ;
        
        while( i <= n ){
            int j =  1 ;
            
            while(j <= i){
                System.out.print( i );
           
                j++ ;

            }
            System.out.println();
            i++ ;
        }
    }
    
}
