package basicprograms;

import java.util.Scanner;

public class Factorial {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int fact = 1;
        int i = s.nextInt() ;
       for (int j = 1 ; j <= i ; j++ ){
           fact = fact*j ;
       }
       System.out.println("Factorial is :  " + fact );

    }
}
