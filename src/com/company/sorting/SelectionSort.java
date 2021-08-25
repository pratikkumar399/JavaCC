package sorting;

public class SelectionSort {

    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                array[minIndex] = array[i];
                array[i] = min;
            }

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
