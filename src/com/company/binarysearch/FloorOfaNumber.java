package binarysearch;

public class FloorOfaNumber {
    public static void main(String[] args) {
        // int[] arr = { -14 , -12 , -6 ,2, 4, 6, 7, 9 , 12, 23 , 45 , 99} ;
        int[] arr = { 20, 13, 12, 10, 5, 4, 3, -10 };
        int target = 2;
        int ans = floor(arr, target);
        System.out.println("Index of the floor number : " + ans);
        System.out.println("The required number is : " + arr[ans]);
       
    }

    //return the index of the greatest number smaller than equal to target
    // return the index: greatest number <= target
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return end;
    }
}

