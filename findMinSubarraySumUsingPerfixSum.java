import java.util.Scanner;

/**
 * day 73 
 * findMinSubarraySumUsingPerfixSum
 */
public class findMinSubarraySumUsingPerfixSum {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n =sc.nextInt();

        int arr[]= new int[n];

         System.out.println("Enter element "+n+ " arry ");
        for(int i = 0; i<n; i++){
        arr[i]=sc.nextInt();
        }

        //create prefix sum array 
        int perfix[]= new int[n];

        //its is fix logic 
        perfix[0]=arr[0];

        for(int i =1; i<n; i++){
            perfix[i]=perfix[i-1]+arr[i];
        }

        //print prefix sum 

        for(int i = 0; i<n; i++){
            System.out.print(perfix[i]+" ");
        }
        System.out.println();


        int min = Integer.MAX_VALUE;
        //use row and colnum techniqe for the solve this question 
        //becuse row 1 run tha all colnum run than row second run than all colnum run
        //so that resion i say use row and colnum patten 

        for(int startIndex = 0; startIndex<n; startIndex++){
            for(int endIndex = startIndex; endIndex<n; endIndex++){
                int sum;

                if(startIndex == 0){
                    sum = perfix[endIndex];
                }else{
                    sum = perfix[endIndex]-perfix[startIndex-1];
                }
               //ky min ,sum se bada hai ..? agar hai to sum kon sum ko min kar do 
               if(sum<min){
                min= sum;
               }

            }
        }
               System.out.println("Min sub array sum : "+min);
                sc.close();

    }
}