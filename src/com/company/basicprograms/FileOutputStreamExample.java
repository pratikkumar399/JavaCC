package basicprograms;

import java.io.FileOutputStream;  
public class FileOutputStreamExample {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("E:\\JavaCC\\src\\com\\company\\basicprograms\\testout.txt");    
             fout.write(65);    
             fout.close();    
                
            }catch(Exception e){System.out.println(e);}    
      }
      
      // public static void main(String args[]){    
      //       try{    
      //         FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
      //         String s="Welcome to javaTpoint.";    
      //         byte b[]=s.getBytes();//converting string into byte array    
      //         fout.write(b);    
      //         fout.close();    
      //         System.out.println("success...");    
      //        }catch(Exception e){System.out.println(e);}    
      //  }  
      
      
      // FileInputStream
//       import java.io.FileInputStream;  
// public class DataStreamExample {  
//      public static void main(String args[]){    
//           try{    
//             FileInputStream fin=new FileInputStream("D:\\testout.txt");    
//             int i=0;    
//             while((i=fin.read())!=-1){    
//              System.out.print((char)i);    
//             }    
//             fin.close();    
//           }catch(Exception e){System.out.println(e);}    
//          }    
//         }  


// FilterOutput Stream example

// import java.io.*;  
// public class FilterExample {  
//     public static void main(String[] args) throws IOException {  
//         File data = new File("D:\\testout.txt");  
//         FileOutputStream file = new FileOutputStream(data);  
//         FilterOutputStream filter = new FilterOutputStream(file);  
//         String s="Welcome to javaTpoint.";      
//         byte b[]=s.getBytes();      
//         filter.write(b);     
//         filter.flush();  
//         filter.close();  
//         file.close();  
//         System.out.println("Success...");  
//     }  
// }

     
// Writer Class example

// import java.io.*;  
// public class WriterExample {  
//     public static void main(String[] args) {  
//         try {  
//             Writer w = new FileWriter("output.txt");  
//             String content = "I love my country";  
//             w.write(content);  
//             w.close();  
//             System.out.println("Done");  
//         } catch (IOException e) {  
//             e.printStackTrace();  
//         }  
//     }  
// }  

// Reader class exapmle implements

// import java.io.*;  
// public class ReaderExample {  
//     public static void main(String[] args) {  
//         try {  
//             Reader reader = new FileReader("file.txt");  
//             int data = reader.read();  
//             while (data != -1) {  
//                 System.out.print((char) data);  
//                 data = reader.read();  
//             }  
//             reader.close();  
//         } catch (Exception ex) {  
//             System.out.println(ex.getMessage());  
//         }  
//     }  
// }  






}