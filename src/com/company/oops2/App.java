package oops2;

import java.util.*;

public class App {
    public static String[][] empTable = {
            { "1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000" },
            { "1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000" },
            { "1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000" },
            { "1004", "Chahat", "29/01/2013", "r", "FrontDesk", "12000", "6000", "2000" },
            { "1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000" },
            { "1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000",

                    "4400" },
            { "1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000" }

    };

    public static String[][] degTable = {
            { "e", "Engineer", "20000" },
            { "c", "Consultant", "32000" },
            { "k", "Clerk", "12000" },
            { "r", "Receptionist", "15000" },
            { "m", "Manager", "40000" }
    };

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee Id: ");
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
            System.out.println("Employee Id not present");
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
            // for(int i=0;i<degTable.length;i++){
            // if(empTable[EmpIndex][3].equals(degTable[i][0])){
            // DIndex = i;
            // break;
            // }
            // }
            int income = Integer.parseInt(empTable[EmpIndex][5]) + Integer.parseInt(empTable[EmpIndex][6])
                    - Integer.parseInt(empTable[EmpIndex][7]) + Integer.parseInt(degTable[DIndex][2]);
            System.out.println("Emp No. = " + empTable[EmpIndex][0]);
            System.out.println("Emp Name = " + empTable[EmpIndex][1]);
            System.out.println("Department = " + empTable[EmpIndex][4]);
            System.out.println("Designation = " + degTable[DIndex][1]);
            System.out.println("Salary = " + income);
        }

    }
}