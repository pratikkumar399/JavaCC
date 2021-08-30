package oops ;

public class ClassUse{
    public static void main(String[] args) {
        ClasseObjects obj1 = new ClasseObjects() ;
        ClasseObjects obj2 = new ClasseObjects() ;
        obj1.name = "Pratik" ;
        obj1.rollNumber = 2820 ;

        obj2.name = "Ankit" ;
        obj2.rollNumber = 50 ;
         System.out.println(obj1);
        System.out.println(obj1.name + " " + obj1.rollNumber);
        System.out.println(obj2.name + " " + obj1.rollNumber);
    }
}