import java.util.Scanner;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("enter the lenegth of array : ");
       int n = sc.nextInt();

       int arr[]=new int[n];
       System.out.println("enter the element ");
       for(int i =0; i<n; i++){
        arr[i]=sc.nextInt();
    }
        System.out.println("inter the the k :");
        int k =sc.nextInt();

        int maxLength = 0;
         
        
        for(int i =0; i<n; i++){
            int sum = 0;
            for(int j =i; j<n;j++){
                sum += arr[j];
                if(sum == k){
               int length =j-i+1;

                if(length>maxLength){
                 maxLength = length;
                    }
                
                }
            }
     
        }
        System.out.println("the longest subarray with sum k is : "+maxLength);

    }
}
