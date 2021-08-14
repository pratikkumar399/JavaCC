package functions;

import java.util.Scanner;

public class PrimeNumber {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = input.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }

}
