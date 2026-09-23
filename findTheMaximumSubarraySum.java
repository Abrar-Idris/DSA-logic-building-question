import java.util.Scanner;

/**
 * findMaxSubarraySum
 * day 80
 */
public class findTheMaximumSubarraySum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

       System.out.print("enter the lenegth of array : ");
       int n = sc.nextInt();

       int arr[]=new int[n];
       System.out.println("enter the element ");
       for(int i =0; i<n; i++){
        arr[i]=sc.nextInt();
    }
        int maxSum = 0;

        for(int i =0; i<n; i++){
               int sum = 0;
            for(int j=i; j<n;j++){
             sum += arr[j];

             if(sum>maxSum){
                maxSum = sum;
             }
            }
        }

        System.out.println("Max sub array sum is : "+maxSum);
  }
    
}