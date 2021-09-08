package oops;

public class FractionUse {
    public static void main(String[] args) {
        Fraction object = new Fraction(4, 6) ;
        object.print() ;
        // object.setNumerator(12) ;
        // object.getNumerator() ;
        // object.increment();
        object.print() ;
    

        Fraction f2 = new Fraction(4,8) ;
        object.add(f2) ;
        object.print(); 

        Fraction f3 = Fraction.add(object,f2) ;
        f3.print();




    }
}
