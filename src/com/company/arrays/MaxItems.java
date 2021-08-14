package arrays;

public class MaxItems {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 9, 18 };
        System.out.println(max(arr));
        System.out.println(maxRange(arr , 3 ,4));
    }

    static int maxRange(int[] arr, int start, int end) {
        int maxValue = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    static int max(int[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

}
