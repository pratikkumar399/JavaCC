package basicprograms;

public class GreatestNumber {
    public static void main(String args[]) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            System.exit(0);
        }
        int a[][] = new int[3][3];
        int i = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                a[row][col] = Integer.parseInt(args[i]);
                i++;
            }
        }
        System.out.print("The given array is :");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + a[row][col]);
            }
        }

    }
}
