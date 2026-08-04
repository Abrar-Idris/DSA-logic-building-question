// day 55
//find the largest element in each Row of a 2D matrix 

import java.util.Scanner;

public class FindLargestElementInEachRow {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Row length : ");
    int rows = sc.nextInt();

    System.out.print("Enter the Cols length : ");
    int cols = sc.nextInt();

    int arr[][]= new int[rows][cols];
//input
    for(int i =0; i<rows; i++){
        for(int j =0; j<cols; j++){
            arr[i][j] = sc.nextInt();
        }
    }
// print matrix 
    for(int i =0; i<rows; i++){
        for(int j =0; j<cols; j++){
            System.out.print(" "+arr[i][j]);
        }
        System.out.println();
    }

//logic 
       for(int i =0; i<rows; i++){
        int largestElement = 0;
        for(int j =0; j<cols; j++){
         if(arr[i][j]>largestElement){
         largestElement=arr[i][j];
         }
        }

    System.out.println("Row "+i+" Largest = "+largestElement);

    }
    sc.close();
   } 
}
