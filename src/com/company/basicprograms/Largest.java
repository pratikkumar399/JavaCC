package basicprograms ;

import java.util.Scanner;

public class Largest {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = Math.max(c, Math.max(a, b)) ;
//        max = a ;
//         if(b>max){
//             max =b ;
//         }
//         if (c>max){
//             max = c ;
//         }

        System.out.println(max);
    }
    
}
