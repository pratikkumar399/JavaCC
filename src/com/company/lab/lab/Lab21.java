package lab;

import java.util.*;

public class Lab21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> valueList = new ArrayList<Integer>();
        TreeMap<String, List<Integer>> mapObj = new TreeMap<String, List<Integer>>();
        int totalCards, index, value, sum = 0, count = 0;

        System.out.println("ENTER NUMBER OF CARDS : ");
        totalCards = input.nextInt();
        String symbol;

        for (index = 1; index <= totalCards; index++) {
            System.out.println("ENTER CARD" + " " + index);
            symbol = input.next();
            value = input.nextInt();

            if (mapObj.containsKey(symbol)) {
                valueList = mapObj.get(symbol);
                valueList.add(value);
            } else {
                valueList = new ArrayList<Integer>();
                valueList.add(value);
                mapObj.put(symbol, valueList);
            }
        }

        System.out.println("DISTINCT SYMBOLS ARE :");
        for (Map.Entry getData : mapObj.entrySet()) {
            System.out.print(getData.getKey() + " ");

        }
        System.out.println();

        for (Map.Entry getData : mapObj.entrySet()) {
            System.out.println("CARDS IN " + getData.getKey() + "  SYMBOL :");
            ArrayList<Integer> temp = (ArrayList<Integer>) getData.getValue();
            Iterator itr = temp.iterator();
            while (itr.hasNext()) {
                count++;
                int val = (int) itr.next();
                System.out.print(getData.getKey());
                System.out.println(" " + val);
                sum += val;
            }

            System.out.println("NUMBER OF CARDS : " + count);
            System.out.println("SUM OF NUMBERS : " + sum);
            sum = 0;
        }
    }
}