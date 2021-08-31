package sorting;

import java.util.Arrays;

public class Bubblesort2 {
  
    public static void main(String[] args) {
        int arr[] = {-45,0,4,22,2 } ;
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionsort(int arr[]){
        
        for (int i = 0; i < arr.length -1; i++) {
        int min  = i ;
        for (int j = i +1; j < arr.length; j++) {
            if(arr[j] < arr[min]){
                min = j ;
            }
            int temp = arr[min] ;
            arr[min] = arr[i] ;
            arr[i] =temp ;
        }    
        }
    }

    static void bubble (int[] arr){
        boolean swapped ;

        for (int i = 0; i < arr.length; i++) {
            swapped= false ;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j] ;
                    arr[j] =arr[j-1] ;
                    arr[j-1] = temp ;
                    swapped = true ;
                }
                
            }
            if(!swapped){
                break ;
            
            }
        }
    }
    
}
