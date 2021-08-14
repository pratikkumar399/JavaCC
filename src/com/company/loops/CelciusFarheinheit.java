package loops;

import java.util.Scanner;

public class CelciusFarheinheit {
    private static Scanner input = new Scanner(System.in) ;
    public static void main(String[] args) {
        float initial = input.nextFloat() ;
        float end = input.nextFloat() ;
        float process = input.nextFloat() ;

        float givenFahrenheit = initial ;
        for (; givenFahrenheit <= end ; givenFahrenheit += process) {
            float celciusValue = (float)( (5.0 /9 )*( givenFahrenheit-32 ) ) ;
            System.out.println(String.format("%.2f", celciusValue));
        }
    }
}
