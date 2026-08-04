import java.util.Scanner;
//Day 54
//find the sum of column in a 2D Matrix
public class findSumofColumnInTwoDarray {
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
    for(int j =0; j<cols; j++){
        int sum = 0;
        for(int i = 0; i<rows; i++){
          sum += arr[i][j];
        }
        System.out.println("columns "+j+" sum = "+sum);
    }
    }
}
