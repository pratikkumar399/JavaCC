package patterns;

import java.util.Scanner;

public class  Character {
    private static Scanner input = new Scanner(System.in) ;
    public static void main(String[] args) {
        // int i = input.nextInt();
        int n = input.nextInt();
        int i =1  ; 

        while( i <= n) {
            int j = 1 ;
             while (j<= n) {
                 System.out.print((char)('A' + j -1));
                 j++ ;
             }
             System.out.println();
             i++ ;
        }
    }
}
