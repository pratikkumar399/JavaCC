package functions;

import java.util.Scanner;

public class Functions {
    static Scanner input  = new Scanner(System.in) ;
    public static void main(String[] args) {
        sum() ;
    }

    static void sum() {
        System.out.println("Enter  number 1 : ");
        int num1 = input.nextInt() ;
        
        System.out.println("Enter  number 2 : ");
        int num2 = input.nextInt() ;

        int sum = num1 + num2 ;
        System.out.println("The sum is : " + sum);
    }
}
