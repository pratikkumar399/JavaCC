package basicprograms;

public class Heap {
     static int getVoteCount(int a ,int  b) {
        return a - b;
          }
    public static void main(String[] args) {
        int n = getVoteCount(13, 0);
        System.out.println(n);
    }


}
