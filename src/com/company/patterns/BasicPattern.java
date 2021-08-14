package patterns;

import java.util.Scanner;

public class BasicPattern {
    private static Scanner input = new Scanner(System.in) ;
    public static void main(String[] args) {
        // int i = input.nextInt();
        int n = input.nextInt();
        int i =1  ; 

        while( i <= n) {
            int j =1  ;
             while (j<= n) {
                 System.out.print('*');
                 j++ ;
             }
             System.out.println();
             i++ ;
        }
    }
}
