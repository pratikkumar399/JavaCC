package functions;

// import java.util.Scanner;

public class Armstrong {
    // private static Scanner input = new Scanner(System.in) ;
    public static void main(String[] args) {
        // int n = input.nextInt() ;
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }

        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            rem = (int) (Math.pow(rem, 3));
            n = n / 10;
            sum = sum + rem;

        }
        return sum == original;
    }

}
