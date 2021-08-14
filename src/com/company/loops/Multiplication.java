package loops;
import java.util.Scanner;

public class Multiplication {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = input.nextInt() ;
        int product = n ;
        for (int i = 1; i <=10; i++) {
           product = i*n ;         
           System.out.println(product);
        }
    }

}
