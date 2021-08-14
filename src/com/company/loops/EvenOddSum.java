package loops;

import java.util.Scanner;

public class EvenOddSum {
    private static Scanner input = new Scanner(System.in) ;
    public static void main(String[] args) {
        int n = input.nextInt() ;
        int Sum_of_Even_Digits= 0 ;
        int  Sum_of_Odd_Digits = 0;

        while(n > 0) {
            int last = n % 10 ;
            if(last % 2 == 0 ){
                Sum_of_Even_Digits += last ;
            }
            else{
                Sum_of_Odd_Digits += last ;
            }
            n = n/10 ;
        }
        System.out.println(Sum_of_Even_Digits + " " + Sum_of_Odd_Digits);


    }
    
}
