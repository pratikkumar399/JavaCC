package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class MultiDImensionalAL {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(input.nextInt());

            }

        }
        System.out.println(list);
    }
}
