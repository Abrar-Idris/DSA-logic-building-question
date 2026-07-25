import java.util.Scanner;
//day 48 
//find the trace of a matrix 
//trace mens  sum of diagonal element 

public class TraceOfMatrix {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Row length : ");
        int rows =sc.nextInt();

        System.out.println("Enter the Columns length : ");
        int cols =sc.nextInt();

        int [][]arr =new int[rows][cols];

        for(int i =0; i<rows;i++){
            for(int j=0; j<cols; j++){
             arr[i][j]=sc.nextInt();
            }
        }
        int sumOfTrace = 0;
        //logic
        for(int i = 0; i<rows;i++){
         for(int j = 0; j<cols; j++){
            if(i==j){
                sumOfTrace += arr[i][j];
            }
         }
        }

        System.out.println("Sum of trace matrix : "+sumOfTrace);
   } 
}
