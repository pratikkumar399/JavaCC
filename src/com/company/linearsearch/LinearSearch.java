package linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[]  arr = {23,34,5,32,54,53,35,67} ;
        int index = 54 ;
        int ans = linearsearch(arr, index) ;
        System.out.println(ans);
    }

    //search the target and return the element
    static int linearsearch2(int[] arr , int index){
       
        if(arr.length == 0){
            return -1 ;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i] ;
            if(element == index){
                return element ;
            }
        }
    return Integer.MAX_VALUE ;

    } 

    //search the target and return true or false
    static boolean linearsearch3(int[] arr , int index){
       
        if(arr.length == 0){
            return false ;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i] ;
            if(element == index){
                return true ;
            }
        }
    return false ;

    } 
    //search in the array : return the index if item found
    //otherwise return -1
    static int linearsearch(int[] arr , int index){
       
        if(arr.length == 0){
            return -1 ;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i] ;
            if(element == index){
                return i ;
            }
        }
    return -1 ;

    } 
     
}
