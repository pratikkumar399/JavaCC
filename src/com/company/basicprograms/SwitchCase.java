package basicprograms;

import java.util.Scanner;

public class SwitchCase {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String fruits = input.next() ;

        switch (fruits) {
            case "Mango" -> System.out.println("Best Fruits");
            case "Apple" -> System.out.println("Sweet fruit");
            default -> System.out.println("Enter a valid option");
        }

    }
    
}
