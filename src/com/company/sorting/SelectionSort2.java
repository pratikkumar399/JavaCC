package sorting;

public class SelectionSort2 {

    public static void selectionSort(int array[]) {
       int i ,min , temp ;
       for ( i = 0; i < array.length -1; i++) {
           min = i;
           for (int j = i+1; j < array.length; j++) {
               if(array[j] < array[min]){
                   min = j;
               }
           }

           temp = array[min] ;
           array[min] = array[i] ;
           array[i] = temp ;
       }
    }

    public static void main(String[] args) {
    int array[] = {2, 5,3,9,7,6} ;
    selectionSort(array);
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i] + " ");
    }
    }
}
