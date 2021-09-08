package sorting;

public class InsertionSort{  
    public static void insertionSort(int arr[]) {  
        int n = arr.length;  
        for (int j = 1; j < n; j++) {  
            int key = arr[j];  
            int i = j-1;  
            while ( (i > -1) && ( arr [i] > key ) ) {  
                arr [i+1] = arr [i];  
                i--;  
            }  
            arr[i+1] = key;  
        }  
    }  
       
    public static void main(String a[]){    
        int[] array = {78,85,5,7,45,96,23};    
        System.out.println("The unsorted array is ");    
        for(int i:array){    
            System.out.print( i + " ");    
        }    
        System.out.println();    
            
        insertionSort(array);//sorting arr using insertion sort    
           
        System.out.println("The sorted array after insertion sort is ");    
        for(int i:array){    
            System.out.print(i+" ");    
        }
    }    
    }    