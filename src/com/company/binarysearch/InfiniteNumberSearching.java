package binarysearch;

// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfiniteNumberSearching {
    public static void main(String[] args) {
        int arr[] = {3,5,6,7,9,20};
        int target = 9 ;
        System.out.println(ans(arr, target));
    }

    static int ans(int arr[] , int target){
//first find the range 
//first start with a box of size 2 
int start = 0 ;
int end = 1 ;

//condition for the target to lie in the range
   while(target > arr[end]){
       int newStart = end +1 ;
       //double the box value 
    //    end = prevoius end + size of box*2 
       end = end + (end - start + 1 ) * 2  ;
       start = newStart ;
   }
    return binarySearch(arr, target, start, end) ;
    }



    public static int binarySearch(int[] arr , int target, int start , int end){
     

        while(start <= end ){
            // int mid =  ( start + end ) /2 ;
            int  mid = start + ((end - start) /2) ;
            if(target < arr[mid]){
                end = mid -1 ;
            }else if (target > arr[mid]){
                start = mid +1 ;


            }
            else{
                return mid ;
            }

        }
        return -1 ;
    }
}
