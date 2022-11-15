package lab;

import java.io.*;
import java.util.*;

class employee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        String name, designation;
        int id, salary;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        do {
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.println("ENTER YOUR CHOICE : ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    try {
                        fileWriter = new FileWriter("employee.txt",
                                true);
                        bufferedWriter = new BufferedWriter(fileWriter);
                        System.out.println("ENTER NAME : ");
                        name = input.next();
                        System.out.println("ENTER ID : ");
                        id = input.nextInt();
                        System.out.println("ENTER DESIGNATION : ");
                        designation = input.next();
                        System.out.println("ENTER SALARY : ");
                        salary = input.nextInt();
                        bufferedWriter.write(name + " " + id + " " +
                                designation + " " + salary);
                        bufferedWriter.newLine();
                        bufferedWriter.close();
                    } catch (IOException e) {
                        System.out.println("ERROR OCCURED");
                    }
                    break;
                case 2:
                    try {
                        fileReader = new FileReader("employee.txt");
                        bufferedReader = new BufferedReader(fileReader);
                        String line;
                        while ((line = bufferedReader.readLine()) != null) {
                            System.out.println(line);
                        }
                        bufferedReader.close();
                    } catch (IOException e) {
                        System.out.println("ERROR OCCURED");
                    }
                    break;
                case 3:
                    System.out.println("EXITING");
                    break;
                default:
                    System.out.println("INVALID CHOICE");
            }
        } while (choice != 3);
    }
}
