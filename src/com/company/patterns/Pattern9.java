package patterns;

import java.util.Scanner;

public class Pattern9 {
    private static Scanner input = new Scanner(System.in) ;
    public static void main(String[] args) {
        int n = input.nextInt() ;

        int i = 1 ;
        while(i <= n ){
            int spaces =1 ;
            while(spaces <= n-i) {
                System.out.print(' ');
                spaces++ ;
            }
            int num =1 ;
            while(num <= i) {
                System.out.print(num);
                num++ ;
            }

            int decreasing = i-1 ;
            while(decreasing >= 1){
                System.err.print(decreasing);
                decreasing-- ;
            }
            System.out.println();
            i++ ;
        }
    }
}
