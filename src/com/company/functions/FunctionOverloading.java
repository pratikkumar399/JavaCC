package functions ;

import java.util.Arrays;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun("Hello Ji") ;
        fun(57) ;
       int ans1 =  sum(48, 80);
        int ans2 = sum(97, 87, 89);
        System.out.println(ans1 + " " +  ans2);
        overloading("Hello" , "This" , "is", "Function" , "Overloading");
        overloading(1,2,3,4,5,6);
    }

    static void overloading(int ...v){
        System.out.println(Arrays.toString(v));

    }

    static void overloading( String ...v){
        System.out.println(Arrays.toString(v));
    }

    static int sum( int a , int b){
        return a+b ;
    }

    static int sum(int a , int b , int c){
        return a+b+c ;
    }

    static void fun (int a ){
        System.out.println("First one");
        System.out.println(a);

    }

    static void fun ( String name){
        System.out.println("A name passed in string");
        System.out.println(name);
    }
}