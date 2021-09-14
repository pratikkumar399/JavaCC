package maths;

public class Primality {
    public static void main(String[] args) {
        if (isPrime(1031)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }
        if (isPrime2(1032)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a prime number");
        }

    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i * i < n; i++) {
            if (n % i == 0)
                return false;

        }
        return true;
    }

    static boolean isPrime2(int n ){
        if( n <= 1) return false ;
        if( n== 2 || n ==3 ) return true ;
        if( n % 2 ==0 || n % 3 == 0)  return false ;

        for (int i = 5; i * i< n; i = i + 6) {
            if( n % i == 0 || n% (i+2) == 0)
               return false ;

        }
        return true ;
    }
}
