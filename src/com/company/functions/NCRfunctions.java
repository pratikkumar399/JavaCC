package functions;

import java.util.Scanner;


public class NCRfunctions {
    static Scanner input = new Scanner(System.in) ;

    public static int factorial(int num){
         
        int fact = 1;
        for (int j = 1; j <= num; j++) {
            fact = fact * j;
        }
        return fact ;
    }
    public static void main(String[] args) {
        int n = input.nextInt() ;
        int r = input.nextInt() ;

        int factN = factorial(n);
        int factR = factorial(r);
        int factNR = factorial(n-r);
        int result = factN / (factR  * factNR) ;
        System.out.println(result);

    }
}
