//day 49
//find the sum of primary and secondary diagonal of 
// squre matrix

import java.util.Scanner;

public class SumOfPrimeAndSceondaryDiagonalOfSqure {
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
        if(rows!=cols){
         System.out.println("it is not a squre matrix ");
         return;
        }
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        //logic
        for(int i = 0; i<rows;i++){
         for(int j = 0; j<cols; j++){
            if(i==j){
                primaryDiagonalSum += arr[i][j];
            }
            if(i+j == cols-1){
              secondaryDiagonalSum += arr[i][j];
            }
         }
        }

        System.out.println("Sum of primary diagonal matrix : "+primaryDiagonalSum);
        System.out.println("sum of secondary diagonal matrix : "+secondaryDiagonalSum);
   } 
   } 
