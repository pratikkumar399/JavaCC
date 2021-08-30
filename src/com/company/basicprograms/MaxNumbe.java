package basicprograms;

import java.util.Scanner;

public class MaxNumbe {
    private static Scanner s = new Scanner(System.in) ;
    public static void main(String[] args) {
        int i = 0 ;
        int large = 0 ;
        while((i = s.nextInt()) != 0 ){
           if(i > large){
               large = i ;

           }
        }



        System.out.println(large);
       
    }
}
