package basicprograms;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Main2 implements Serializable {
     int id  ;
     String name ;
     public Main2(int id , String name ){
         this.id = id  ;
         this.name = name ;
     }


}


public class Write{
    public static void main(String[] args) {
        try{

            Main2 obj1 = new Main2(2811, "Piyush" );
            FileOutputStream fout=new FileOutputStream("E:\\JavaCC\\src\\com\\company\\basicprograms\\testout.txt");

            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(obj1);
            out.close();


        }
        catch(Exception e){System.out.println(e);
        }
    }
}