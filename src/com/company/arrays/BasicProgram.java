package arrays;

import java.util.Scanner;

public class BasicProgram {
    private static Scanner input =  new Scanner(System.in) ;
    public static void main(String[] args) {
        int[]  arr =  new int[5] ;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt() ;
        }

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        for (int i : arr ) {
            System.out.print(i + " ");
        }
    }
}
