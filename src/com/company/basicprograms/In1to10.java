package basicprograms;

public class In1to10 {
    static boolean in1To10(int n, boolean outsideMode) {
    if (!outsideMode){
        if(n >= 1 && n <= 10) {
            return true;
        } else {
            return false;
        }
    } else {
        if (n <= 1 || n >= 10) {
            return true;
        } else {
            return false;
        }
    }
}

    public static void main(String[] args) {
        int a;
        In1to10 i=new In1to10();
        System.out.println(In1to10.in1To10(67,true));
        
        
    }

}