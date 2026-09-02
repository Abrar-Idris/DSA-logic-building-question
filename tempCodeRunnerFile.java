import java.util.Scanner;

public class findSumOftwoindexUsingPrefix {
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

        //user input  
       System.out.println("enter the first Index :");
       int startIndex =sc.nextInt();

       System.out.println("enter the Second Index :");
       int endIndex =sc.nextInt();

        //rule no.1 prefixsum And first index of are both are the same
        prefixSum[0]=arr[0];

        //covert arr into prifixsum 
        for(int i =1; i<n;i++){
            prefixSum[i] =arr[i-1]+arr[i];
        }

        int sum = 0;

        if(startIndex ==0){
          sum = prefixSum[endIndex];

        }else if(startIndex>0){
          sum = prefixSum[endIndex]-prefixSum[startIndex-1];
        }
    
       System.out.println("sum of prefix by given index : "+sum);
    



    }
}
