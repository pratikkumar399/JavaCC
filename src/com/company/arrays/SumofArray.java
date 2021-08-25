package arrays;

import java.util.Scanner;

public class SumofArray {
    static Scanner input = new Scanner(System.in);

    // function to print max value
    public static int sum(int[] input) {
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        int max = sum(arr);
        // printing the array entered by the user
        print(arr);
        // printing the maximum number
        System.out.println("Total sum is  : " + max);
    }

    // function to take array as input from user
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
