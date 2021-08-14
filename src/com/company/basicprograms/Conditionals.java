package basicprograms;

import java.util.Scanner;

public class Conditionals {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int a , b  ;
        a = s.nextInt() ;
        b = s.nextInt() ;

        if(a> 0 || b> 0) {
            System.out.println("Both the number are positive ");

        }
        else{
            System.out.println("Both are negative");
        }
    }
}
