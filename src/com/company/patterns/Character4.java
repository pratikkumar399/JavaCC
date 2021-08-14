package patterns;

import java.util.Scanner;

public class Character4 {
    private static Scanner input = new Scanner(System.in) ;
     public static void main(String[] args) {
        int n = input.nextInt();
        int i =1  ;   
        while(i <= n){
           char p = (char)('A' + n -1) ;
           int j = 1 ;
            while(j <= i){
                System.out.print(p);
                p =(char)(p+1) ;
                j++ ;
            }
            System.out.println();
            i++ ;

        }
     }
}
