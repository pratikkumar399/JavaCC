package linearsearch;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = { 
            { 24, 25, 45 }, 
            { 23, 67, 34 },
            { 12, 95, 64 },
            { 1, 2 } };
        int target= 67 ;
        int[] ans = search(arr, target) ; 
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr , int target){
        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ;col++){
            if(arr[row][col] == target) {
                return new int[]{row,col} ;
            }
        }
    }
    return new int[]{-1,-1} ;
}
    static int max(int[][] arr){
        int max = arr[0][0] ;
        // for(int row = 0 ; row < arr.length ; row++){
        //     for(int col = 0 ; col < arr[row].length ;col++){
        //     if(arr[row][col] > max) {
        //        max = arr[row][col];
        //     }
        // }
        for (int[] element : arr) {
            for (int element2 : element) {
            if(element2 > max) {
               max = element2;
            }
        }
    }
    return max ; }

}
