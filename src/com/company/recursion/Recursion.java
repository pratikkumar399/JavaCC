package recursion;

class RectTest{
    int values[] ;
    RectTest(int i){
        values = new int[i] ;
    }

    void printArray(int i){
        if(i==0) return ;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);

    }
}

public class Recursion {
public static void main(String[] args) {
    RectTest object = new RectTest(10) ;
    int i ;

    for (int j = 0; j < 10; j++) {
        object.values[j] = j;

    }
    object.printArray(10);
}

    
}
