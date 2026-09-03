import java.util.Scanner;

public class findMaxSubarraySumUsingPerfixSum {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n =sc.nextInt();

        int arr[]= new int[n];
        int prefixSum[] = new int[n];

        System.out.println("Enter element "+n+ " arry ");
        for(int i = 0; i<n; i++){
        arr[i]=sc.nextInt();
        }
         prefixSum[0] = arr[0];

        for(int i =1; i<n; i++){
          prefixSum[i]= prefixSum[i-1]+arr[i];
        }
    System.out.println("Prefix Sum :");
        for(int i =0; i<n; i++){
            System.out.print(prefixSum[i]+" ");
        }
        int max = Integer.MAX_VALUE;

        for(int startIndex = 0;startIndex<n;startIndex++){
            for(int endIndex = startIndex; endIndex<n; endIndex++){
                int sum;
                if(startIndex == 0){
                    sum = prefixSum[endIndex];
                }else{
                    sum = prefixSum[endIndex] - prefixSum[startIndex -1];
                }

                if(sum >max){
                    max =sum;
                }
            }
        }

        
    
System.out.println("Max sub array sum : "+max);
sc.close();
    
   } 
}
