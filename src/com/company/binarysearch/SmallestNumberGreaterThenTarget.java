package binarysearch;

//smallest letter greater than target

public class SmallestNumberGreaterThenTarget {
    public static void main(String[] args) {
       
    }

    // return the index of smallest number >= target
    // return the index: greatest number <= target
    static int floor(int[] letters, int target) {
        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            } 
        }
        return letters[start % letters.length];
    }
}