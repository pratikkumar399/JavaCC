package loops;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a = input.nextInt() ;
        int sum = 0 ;
        // int sum = (a*(a+1))/2 ; ///by using formula
        for (int i = 0; i <= a; i++) {
            sum = sum + i ;
            }
            System.out.println(sum);
    }
}
