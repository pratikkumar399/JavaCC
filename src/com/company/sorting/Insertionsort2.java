package sorting;

public class Insertionsort2 {

    public static void insertionSort2(int arr[]){
      for(int i = 0 ; i < arr.length ; i++){
          int j = i- 1 ;
          int temp = arr[i] ;
          while( j >= 0 && arr[j] > temp){
              arr[j+1] =arr[j] ;
              j-- ;
          }
          arr[j+1] = temp ; 
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,4,7,3,2,8} ;
        insertionSort2(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }


    }
}
