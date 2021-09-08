package oops;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplyfy();
    }

    private void simplyfy() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }

    public void setNumerator(int i) {

        this.numerator = i;
    }

    public int getNumerator() {
        return numerator ;

    }

    public void setDenominator(int num){
        if( num == 0){
            denominator =1  ;
        }
        this.denominator =num  ;
    }

    public int getDenominator(){
   return denominator ;
    }



    public void print() {
        System.out.println(numerator + "/" + denominator);
    }

    public void increment() {
        numerator = numerator + denominator;
        simplyfy();
    }

    public void add(Fraction f2){
        //first fraction is the fraction on whcih the function is called
        // Second fraction is passed s arguements 
        this.numerator  = this.numerator * f2.denominator + this.denominator *f2.numerator ;
        this.denominator = this.denominator *f2.denominator ;
        simplyfy(); 
    }
    
    public static Fraction add(Fraction f1, Fraction f2){
        int newNum = f1.numerator *f2.denominator +f1.denominator *f2.numerator ;
        int newDeno = f1.denominator *f2.denominator ;
        Fraction f3 = new Fraction(newNum , newDeno) ;
        return f3 ;

    }
}
