//To find the case of a program
package basicprograms;

import java.util.Scanner;

public class CaseType {
    private static Scanner input = new Scanner(System.in) ;
    public static void main(String[] args) {
        char ch = input.next().charAt(0) ;

        if (ch >= 'A' && ch <='Z') {
            System.out.println("UpperCase");
        } else if (ch >= 'a' && ch <='z') {
            System.out.println("Lowercase");
        }
        else{
            System.out.println(-1);
        }
        
    }
}
