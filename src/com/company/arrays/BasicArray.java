package arrays;

import java.util.Scanner;



public class BasicArray {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int arr[] = takeInput() ;
        print(arr);
    }

    public static int[] takeInput(){
        int size = input.nextInt() ;
        int arr[] = new int[size] ;
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt() ;
            
        }

        return arr ;
    }

    public static void print(int input[]){
        int size = input.length ;
        for (int i = 0; i < size; i++) {
            System.out.print(input[i] + " ");

        }
        System.out.println();

    }
}
