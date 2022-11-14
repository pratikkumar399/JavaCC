package basicprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

class Emp implements Serializable {
    int id;
    String name;
    int salary;
    String post;

    public Emp(int id, String name, int salary, String post) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.post = post;
    }

    public String toString() {
        return "Emp details : " + this.id + " " + this.name + " " + this.salary + " " + this.post;
    }

}

public class Write {

    static void display1(ArrayList<Emp> el) {

        for (Emp it : el) {
            System.out.println(it.id + it.name + it.salary + it.post);
        }
    }

    public static void main(String[] args) {
        int id;
        String name;
        int salary;
        String post;

        Scanner sc = new Scanner(System.in);
        ArrayList<Emp> al = new ArrayList<Emp>();

        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {

            f = new File("E:\\JavaCC\\testout.txt");
            if (f.exists()) {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                al = (ArrayList<Emp>) ois.readObject();
            }

        } catch (Exception exp) {
            System.out.println(exp);
        }
        do {
            System.out.println("1). Add Emp to the DataBase\n" +
                    "2). Search for Emp\n" +
                    "3). EXIT\n");
            System.out.println("Enter your choice : ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("\nEnter the following details to ADD list:\n");
                    System.out.println("Enter ID :");
                    id = sc.nextInt();
                    System.out.println("Enter Name :");
                    name = sc.next();
                    System.out.println("Enter Salary :");
                    salary = sc.nextInt();
                    System.out.println("Enter post:");
                    post = sc.nextLine();
                    al.add(new Emp(id, name, salary, post));
                    display1(al);
                    break;

                case 2:
                    System.out.println("Enter the Emp ID to search :");
                    id = sc.nextInt();
                    int i = 0;
                    for (Emp e : al) {
                        if (id == e.id) {
                            System.out.println(e + "\n");
                            i++;
                        }
                    }
                    if (i == 0) {
                        System.out.println("\nEmp Details are not available, Please enter a valid ID!!");
                    }
                    break;

                case 3:
                    try {
                        fos = new FileOutputStream(f);
                        oos = new ObjectOutputStream(fos);
                        oos.writeObject(al);
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    } finally {
                        try {
                            fis.close();
                            ois.close();
                            fos.close();
                            oos.close();
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }

                    }
                    System.out.println("\nYou have chosen EXIT !! Saving Files and closing the tool.");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nEnter a correct choice from the List :");
                    break;

            }
        } while (true);
    }

}