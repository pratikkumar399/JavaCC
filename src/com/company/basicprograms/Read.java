package basicprograms;

import java.io.*;

public class Read {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("E:\\JavaCC\\src\\com\\company\\basicprograms\\testout.txt");

            ObjectInputStream ois = new ObjectInputStream(fis) ;

             Main1 student = (Main1) ois.readObject();

            //  System.out.println(student.id + " " + student.name);

             ois.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
