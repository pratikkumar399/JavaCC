package patterns;

import java.util.Scanner;

public class Traingle1 {
    private static Scanner input = new Scanner(System.in) ;
    public static void main(String[] args) {
        // int i = input.nextInt();
        int n = input.nextInt();
        int i =1  ; 

        while( i <= n) {
            int j =1  ;
             while (j<= i) {
                 System.out.print(j);
                 j++ ;
             }
             System.out.println();
             i++ ;
        }
    }
}
