package patterns;

import java.util.Scanner;

public class Triangle2 {
    private static Scanner input = new Scanner(System.in) ;
    public static void main(String[] args) {
        // int i = input.nextInt();
        int n = input.nextInt();
        int i =1  ; 
        int p = 1;

        while( i <= n) {
            int j =1  ;
             while (j<= i) {
                 System.out.print(p + " ");
                 p++ ;
                 j++ ;
             }
             System.out.println();
             i++ ;
        }
    }
}
