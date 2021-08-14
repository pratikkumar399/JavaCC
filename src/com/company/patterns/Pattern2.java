package patterns;

import java.util.Scanner;

public class Pattern2 {
    private static Scanner input = new Scanner(System.in) ;
    public static void main(String[] args) {
        // int i = input.nextInt();
        int n = input.nextInt();
        int i =1  ; 

        while( i <= n) {
            int j =1  ;
             while (j<= n) {
                 System.out.print(i);
                 j++ ;
             }
             System.out.println();
             i++ ;
        }
    }
}
