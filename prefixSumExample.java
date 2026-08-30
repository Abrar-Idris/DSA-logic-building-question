import java.util.Scanner;

public class prefixSumExample {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     System.out.println("Enter the length of array ");
    int n =sc.nextInt();

    int arr[] = new int[n];
    int prefix[] = new int[n];

    System.out.println("Enter element "+n+ " arry ");
    for(int i = 0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    //prifix sum
    prefix[0] = arr[0];

    for(int i =1; i<n; i++){
        /*index 1 = 1-1+1 
        index 1 =0+1
        index 1 = 2+4
        index 1 = 6
        */

       //..

        /*index 2 = 2-1 +2
          index 2 = 1 +2
          index 2 = value of index one + value of inde 2
          index = 4+8 
          index = 12
        */
      prefix[i] = prefix[i-1]+arr[i];
    }
  

    for(int i =0; i<n;i++){
        System.out.print(prefix[i]+" ");
    }
 }   
}
