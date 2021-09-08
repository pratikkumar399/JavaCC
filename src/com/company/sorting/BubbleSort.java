package sorting ;

public class BubbleSort {

    public static void bubbleSort(int input[]){
        int swap = 0 ;
        for (int i = 0; i < input.length-1; i++) {
            for (int j = 0; j < input.length-1; j++) {
                if (input[j] > input[j+1]) {
                    int temp = input[j] ;
                    input[j] = input[j+1] ;
                    input[j+1] =temp ;
                    swap =1 ;
                }
            }
        
        if(swap == 0){
          break ;
        }
    }
    }
    public static void main(String[] args) {
      int input[] = {1,2,3,5,4} ;
      bubbleSort(input);
      for (int i = 0; i < input.length; i++) {
          System.out.println(input[i] + " ");
      }
    }
}
