package basicprograms;

public class ArraySUm {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5} ;
        int ans = 0 ;
       for(int i = 0 ; i<arr.length ; i=i+2){
           ans += arr[i]*arr[i] ;
        }
        System.out.println(ans);
        int ans2 = 0 ;
       for(int i = 1 ; i<arr.length ; i=i+2){
           ans2 += arr[i]*arr[i]*arr[i] ;
        }
        System.out.println(ans2);

        if(ans == ans2) {
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }

    }

    // static int reversDigits(int num)
    // {
    //     int rev_num = 0;
    //     while (num > 0) {
    //         rev_num = rev_num * 10 + num % 10;
    //         num = num / 10;
    //     }
    //     return rev_num;
    // }
 
    // // Driver code
    // public static void main(String[] args)
    // {
    //     int num = 4562;
    //     int num2 = 4562 ;
    //     if(num == num2){
    //         System.out.println("Reverse of no. is "
    //                        + reversDigits(num));
    //     }
    //     else{
    //         int temp = num ;
    //         num = num2 ;
    //         num2 = temp ;
    //     }
    // }
     
  

    
}
