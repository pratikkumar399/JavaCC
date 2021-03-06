package arrays;

import static java.lang.Integer.MIN_VALUE;

import java.util.Scanner;

public class BasicArray {
    static Scanner input = new Scanner(System.in);
    private static int minValue = MIN_VALUE;
 
    //function to print max value
    public static int maximum(int[] input) {
        int max = minValue;

        for (int element : input) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        int max =maximum(arr) ;
        //printing the array entered by the user
        print(arr);
        //printing the maximum number
        System.out.println("Maximum number : " + max);
    }
    
    //function to take array as input from user
    public static int[] takeInput() {
        int size = input.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();

        }

        return arr;
    }
    
    // function to print array
    public static void print(int input[]) {
        int size = input.length;
        for (int i = 0; i < size; i++) {
            System.out.print(input[i] + " ");

        }
        System.out.println();

    }
}
