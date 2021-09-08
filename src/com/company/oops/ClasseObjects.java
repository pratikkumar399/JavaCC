package oops;

public class ClasseObjects {
    public String name;
    int rollNumber;
    static int  numStudents ;
    public int yearsjoin;
    public String address;
    static final double pi1 = 2.14 ;

    // private rollNumber ;

    // public ClasseObjects(String name , int rollNumber){
    //     this.name =name ;
    //     this.rollNumber = rollNumber ;
    // }
    
    public ClasseObjects(){
        name = "Pratik" ;
        numStudents++ ;
        this.rollNumber =numStudents ;
        
    }

    public static int getNumStudent(){
        return numStudents ;
    }

    public void setROllNmber(int rollNumber) {

        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}
