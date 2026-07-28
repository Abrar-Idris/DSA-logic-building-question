//find the maximum element in a 2D matrix
//day 50

import java.util.Scanner;

public class findMaximumElementInTwoDarray {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the row length : ");
    int rows =sc.nextInt();

    System.out.print("Enter the columns length : ");
    int cols =sc.nextInt();

    int arr[][]=new int[rows][cols];

    for(int i =0; i<rows; i++){
        for(int j = 0; j<cols; j++){
          arr[i][j]=sc.nextInt();
        }
    }
     System.out.println();

    for(int i =0; i<rows; i++){
        for(int j = 0; j<cols; j++){
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

    //logic 
    int maximum = arr[0][0];
 for(int i =0; i<rows; i++){
        for(int j = 0; j<cols; j++){
         if (arr[i][j]>maximum) {
            maximum =arr[i][j];
         }
        }
    }
    
System.out.println("The Maximum Element is "+maximum);
   } 
}
