package oops2;

class student {
 
    String name;

    public student(String name) {
        this.name = name;
    }

    public student() {
        name = "unknown";
    }
}

public class Students {
    public static void main(String[] args) {
        student obj = new student();
       
       obj.name = "Pratik ";
        System.out.println(obj.name);

    }
}