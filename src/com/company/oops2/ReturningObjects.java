package oops2;


class Test {
    int a ;
    Test(int a ){
        this.a = a ;
    }

    Test incrmntby(){
   Test temp = new Test(a+10) ;
   return temp ;
    }


}

public class ReturningObjects {
    public static void main(String[] args) {
        Test obj1 = new Test(2) ;
        Test obj2 ;

        obj2 = obj1.incrmntby() ;
        System.out.println("obj1.a " + obj1.a);
        System.out.println("obj2.a " + obj2.a);

        obj2 = obj2.incrmntby();

        System.out.println("obj2 after second increase " + obj2.a);


    }
    
}
