package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // list.add(45);
        // list.add(235);
        // list.add(4523);
        // list.add(4523);
        // list.add(452);
        // list.add(4545);

        for (int i = 0; i < 6; i++) {
            list.add(input.nextInt());

        }
        for (int i = 0; i < 6; i++) {
            System.out.print(list.get(i) + " ");

        }
    }

}
