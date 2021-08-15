package patterns;

import java.util.Scanner;

public class Pattern8 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int n = input.nextInt() ;
        int i = 1;
        while( i <= n){
            int j= 1 ;
            while(j <= n-i+1){
                System.out.print(n-i+1);
                j++ ;
            }
            
            i++;
            System.out.println();
        }
    }
}
