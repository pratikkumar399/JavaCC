package binarysearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // int[] arr = { -14 , -12 , -6 ,2, 4, 6, 7, 9 , 12, 23 , 45 , 99} ;
        int[] arr = { 20, 13, 12, 10, 5, 4, 3, -10 };
        int target = -10;
        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
        System.out.println(arr.length);
    }

    public static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            // int mid = ( start + end ) /2 ;
            int mid = start + ((end - start) / 2);

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            }
        }

        return -1;
    }
}
