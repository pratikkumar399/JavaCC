package oops;

public class ClassUse {
    public static void main(String[] args) {
        ClasseObjects obj1 = new ClasseObjects();
        ClasseObjects obj2 = new ClasseObjects();
        obj1.name = "Pratik";

        // cannot access roll number beacause it is private 
        // obj1.rollNumber = 2820 ;

        obj2.name = "Ankit" ;
        obj1.yearofjoin = 2020 ;
        obj1.setROllNmber(2820);
        System.out.println("obj1 " + obj1.name  +  obj1.yearofjoin);
       
     
        System.out.println(obj1.getRollNumber());
     
      
    }
}

