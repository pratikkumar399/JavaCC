//Program to print factors of number excluding 1 and the number itself

package loops;

import java.util.Scanner;

public class Factors {
    private static Scanner input = new Scanner(System.in) ;
    public static void main(String[] args) {
        int num = input.nextInt() ;
        // running the loop till n/2 means that the number itself is excluded from the factors list
        for (int i = 2; i <= num/2; i++) {
            if(num % i == 0){
             System.out.print(i + " ");
             
            }
            
        }
        System.out.println();
    }
}
