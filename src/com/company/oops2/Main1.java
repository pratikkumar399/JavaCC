package oops2;

import java.util.*;

public class Main1 {

    public static String[] empAssoc = { "EmpNo", "EmpName", "JoinDate", "DesignationCode", "Department", "Basic", "HRA",
            "IT" };
    public static String[][] empTable = new String[][] {
            { "1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000" },
            { "1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000" },
            { "1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000" },
            { "1004", "Chahat", "29/01/2013", "r", "FrontDesk", "12000", "6000", "2000" },
            { "1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000" },
            { "1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400" },
            { "1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000" }
    };

    public static String[] daAssoc = { "DesignationCode", "Designation", "DA" };
    public static String[][] daTable = new String[][] {
            { "e", "Engineer", "20000" },
            { "c", "Consultant", "32000" },
            { "k", "Clerk", "12000" },
            { "r", "Receptionist", "15000" },
            { "m", "Manager", "40000" }
    };

    public static void main(String[] args) {

    }
}
