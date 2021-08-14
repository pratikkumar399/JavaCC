package basicprograms;

import java.util.Scanner;

public class EvenOdd {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int i = s.nextInt() ;
        if( i % 2== 0){
            System.out.println("Even Number");

        }
        else{
            System.out.println("Odd");
        }
    }
}
