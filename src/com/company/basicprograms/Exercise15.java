package basicprograms ;

import java.util.Arrays; 
public class Exercise15 {
public static void main(String[] args) 
    {
      int[] array1 = {1 , 2, 3, 4};
      int[] array2 = {3,4,5,6};
 
       System.out.println("Array1 : "+Arrays.toString(array1));
       System.out.println("Array2 : "+Arrays.toString(array2));
 
      int sum = 0 ;
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i] == (array2[j]))
                {
                 
                    sum += array1[i] ;
                    
                 }
           
                
            }
        }
        System.out.println(sum);
 
    }
}
