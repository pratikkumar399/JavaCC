package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // int [][] arr = {
        // {1,2,3} , {4,5,6} , { 7,8,9}
        // } ;



        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            // for each col in evry row
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        // //for each col in evry row
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print(arr[i][j] + " ");
        // }
        // System.out.println();
        // }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

}
