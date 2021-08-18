package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -14 , -12 , -6 ,2, 4, 6, 7, 9 , 12, 23 , 45 , 99} ; 
        int target = -12;
        int ans = binarySearch(arr, target) ;
        System.out.println(ans);
    }

    public static int binarySearch(int[] arr , int target){
        int start = 0 ;
        int end = arr.length -1 ;

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
