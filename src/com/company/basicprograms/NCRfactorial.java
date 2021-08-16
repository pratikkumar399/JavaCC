package basicprograms;

import java.util.Scanner;

public class NCRfactorial {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int r = s.nextInt();
        
        int factN = 1;
        for (int j = 1; j <= n; j++) {
            factN = factN * j;
        }

        int factR = 1;
        for (int i = 1; i <= r; i++) {
            factR = factR * i;
        }
        int factNR = 1 ;
        for (int i = 1; i < n-1; i++) {
            factNR = factNR * i ;
        }

        int result = factN / (factR  * factNR) ;
        System.out.println(result);
    }
}
