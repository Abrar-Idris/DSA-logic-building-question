import java.util.Scanner;
//Day 34 2D array 
// Input and Print Matrix
public class PrintMatrix {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Rows: ");
    int rows =sc.nextInt();

    System.out.print("Enter Columns: ");
    int cols =sc.nextInt();

    int[][]arr = new int[rows][cols];

    for(int i=0; i<rows; i++){
        for(int j =0; j<cols; j++){
            arr[i][j]=sc.nextInt();
        }
    }

    for(int i =0; i< rows; i++){
        for (int j= 0; j <cols; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
   } 
}
