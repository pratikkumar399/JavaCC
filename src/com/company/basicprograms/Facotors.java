package basicprograms;

import java.util.Scanner;

public class Facotors {
  private static Scanner in = new Scanner(System.in) ;
    public static void main(String[] args) {
      int number = in.nextInt() ;
      for (int i = 1; i <= number; ++i){
        if (number % i == 0){
            System.out.println(i + " ");
        }
      }
    }
}
