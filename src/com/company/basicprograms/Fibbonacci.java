package basicprograms;

import java.util.Scanner;

public class Fibbonacci {
    private static Scanner s = new Scanner(System.in) ;
    public static void main(String[] args) {
        int a = 0 ;
        int b =  1 ;
        int n = s.nextInt() ;

        for (int i = 2; i <=n; i++) {
            int temp  = b ;
            b = b+a ; 
            a = temp ;
        }
        System.out.println(b);
    }
}
