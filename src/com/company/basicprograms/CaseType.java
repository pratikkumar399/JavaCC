//To find the case of a program
package basicprograms;

import java.util.Scanner;

public class CaseType {
    private static Scanner input = new Scanner(System.in);

    //a= 65
    public static void main(String[] args) {
   int number = input.nextInt() ;
        int number2 = input.nextInt() ;
        if (number>number2){
            System.out.println("Number 1 is greater");
        }
        else{
            System.out.println("Number2 is greater");
        }



//        if (ch >= 'A' && ch <='Z') {
//            System.out.println("UpperCase");
//        } else if (ch >= 'a' && ch <='z') {
//            System.out.println("Lowercase");
//        }
//        else{
//            System.out.println(-1);
//        }

    }
}
