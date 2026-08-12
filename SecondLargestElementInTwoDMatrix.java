import java.util.Scanner;
//find the second largest element in a 2D matrix
public class SecondLargestElementInTwoDMatrix {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.print("Enter the row lenght : ");
    int rows =sc.nextInt();

    System.out.print("Enter the cols lenght : ");
    int cols =sc.nextInt();

    int arr[][]=new int[rows][cols];
//input
    for(int i =0; i<rows; i++){
        for(int j =0; j<cols; j++){
            arr[i][j] = sc.nextInt();
        }
       
    }
//print
     for(int i =0; i<rows; i++){
        for(int j =0; j<cols; j++){
            System.out.print(" "+arr[i][j]);
        }
       System.out.println();
    }

    //logic
    int largestElement = arr[0][0];
    int secondLargestElement = arr[0][0];

    for(int i = 0; i< rows; i++){
        for(int j =0; j<cols; j++){

          if(largestElement<arr[i][j]){
            secondLargestElement =largestElement;
            largestElement = arr[i][j];

          }  

        }
    }
    System.out.println("Largest Element = "+largestElement);
     System.out.println("Second Largest Element = "+secondLargestElement);
    }
}
