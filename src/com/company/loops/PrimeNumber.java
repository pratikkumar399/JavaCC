package loops;

import java.util.Scanner;

public class PrimeNumber {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = input.nextInt() ;
        boolean isPrime = true ;
        for (int div = 2; div <= n/2; div++ ) {
            if( n % div == 0){
                System.out.println("Composite");
                isPrime =false ;
                return ;
            }
        }
        if( isPrime){
            System.out.println("Prime");
        }
      
    }
    
}
