package lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

//Card1 class implementing Comparable for storing it in TreeSet 
class Card1
        implements Comparable<Card1> {
    char symbol;
    int number;

    public Card1(char s, int n) {
        this.symbol = s;
        this.number = n;
    }

    @Override
    public String toString() {
        return symbol + " " + number;
    }

    @Override
    public int compareTo(Card1 o) {
        return (this.symbol - o.symbol);
    }
}

public class Card {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter number of Card1s: ");
            int n = sc.nextInt();
            sc.nextLine();
            Set<Card1> Card1s = new TreeSet<Card1>();

            for (int i = 0; i < n; ++i) {
                System.out.println("Enter Card1 " + (i + 1) + ":");
                char s = sc.next().charAt(0);
                int num = sc.nextInt();
                sc.nextLine();
                Card1s.add(new Card1(s, num));
            }

            System.out.println(Card1s.size() + " sybmols gathered in " + n + " crads");
            System.out.println("Crads in set are: ");
            for (Card1 Card1 : Card1s) {
                System.out.println(Card1.toString());
            }
        }
    }
}
