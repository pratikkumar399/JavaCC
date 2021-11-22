package oops2;

public class Main {
    public static void main(String[] args) {
        int row = 5;

        int arr[][] = new int[row][];

        for (int k = 0; k < arr.length; k++)

        {
            arr[k] = new int[k + 1];
        }
        int sum = 0;

        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < i + 1; ++j)

                arr[i][j] = j + 1;
        }
        for (int i = 0; i < row; ++i)

            for (int j = 0; j < i + 1; ++j)

                sum += arr[i][j];

        System.out.print(sum);

    }
}
