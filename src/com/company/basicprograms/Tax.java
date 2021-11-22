package basicprograms;

import java.util.Scanner;


public class Tax

{

    public static void main(String[] args)

    {

        Scanner scan = new Scanner(System.in);

        int amount = scan.nextInt();

        if (amount <= 50000)

        {

            System.out.println("amount to be paid is " + amount);

        }

        else if (amount <= 60000)

        {

            amount += (amount / 100) * 10;

            System.out.println("amount to be paid is " + amount);

        }

        else if (amount <= 150000)

        {

            amount += (amount / 100) * 20;

            System.out.println("amount to be paid is " + amount);

        }

        else

        {

            amount += (amount / 100) * 30;

            System.out.println("amount to be paid is " + amount);

        }

        scan.close();

    }

}
