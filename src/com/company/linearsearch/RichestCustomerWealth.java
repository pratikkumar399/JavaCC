package linearsearch;

// https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth {
    public static void main(String[] args) {
     int[][] wealth = {{1,2,3}, {3,2 ,1} }  ;
     System.out.println(maximumWealth(wealth));
    }

    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] account2 : accounts) {
            int sum = 0;
            for (int element : account2) {
                sum += element;
            }

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
