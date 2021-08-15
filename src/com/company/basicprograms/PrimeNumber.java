package basicprograms;

import java.util.Scanner;

public class PrimeNumber {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = input.nextInt();
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

}
