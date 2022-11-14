package oops;

import java.util.*;

public class Lab {
    public static String[] empAssoc = { "UID", "Name", "age", "Code", "Fee", };
    public static String[][] empTable = new String[][] {
            { "20BCS22001", "Sushma", "20", "CSE1", "9000" },
            { "20BCS22002", "Rahul", "30", "CSE2", "1000" },
            { "20BCS22003", "Chahat", "15", "CSE3", "2000" },
            { "20BCS22004", "Ranjan", "18", "CSE4", "20000" },
            { "20BCS22005", "Suman", "25", "CSE5", "4400" },

    };
    public static String[] daAssoc = { "Code", "Fee" };
    public static String[][] degTable = new String[][] {
            { "CSE1", "20000" },
            { "CSE2", "32000" },
            { "CSE3", "12000" },
            { "CSE4", "15000" },
            { "CSE1", "40000" }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student Id: ");
        String str = sc.nextLine();
        sc.close();
        int EmpIndex = -1, DIndex = 0;
        for (int i = 0; i < empTable.length; i++) {
            if (empTable[i][0].equals(str)) {
                EmpIndex = i;
                break;
            }
        }
        if (EmpIndex == -1) {
            System.out.println("Student Id not present");
        } else {
            switch (empTable[EmpIndex][3]) {
                case "e":
                    DIndex = 0;
                    break;
                case "c":

                    DIndex = 1;
                    break;
                case "k":
                    DIndex = 2;
                    break;
                case "f":
                    DIndex = 3;
                    break;
                case "m":
                    DIndex = 4;
                    break;
            }
            int income = Integer.parseInt(empTable[EmpIndex][4]) + Integer.parseInt(degTable[DIndex][2]);
            System.out.println("Emp No. = " + empTable[EmpIndex][0]);
            System.out.println("Emp Name = " + empTable[EmpIndex][1]);
            System.out.println("Salary = " + income);
        }
    }
}
