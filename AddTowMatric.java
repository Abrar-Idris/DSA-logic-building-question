import java.util.Scanner;

public class AddTowMatric {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    
    //first matrix 

     System.out.print("Enter Rows: ");
        int row1 = sc.nextInt();

        System.out.print("Enter Columns: ");
        int cols1 = sc.nextInt();

        int[][] matrixA = new int[row1][cols1];

        System.out.println("Enter Elements:");

        for (int i= 0; i < row1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrixA[i][j] = sc.nextInt();
            }
        }

        //second matrics

        System.out.print("Enter second matrics Rows: ");
        int row2 = sc.nextInt();

        System.out.print("Enter second matrics Columns: ");
        int cols2 = sc.nextInt();

        int[][] matrixB = new int[row2][cols2];

        System.out.println("Enter Elements:");

        for (int i= 0; i < row2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrixB[i][j] = sc.nextInt();
            }
        }

        //logic

        if(row1 != row2 || cols1 != cols2){
            System.out.println("Matrix addition is not possible");
            return;
        }

        int[][] matrixSum = new int[row1][cols1];

        for(int i = 0; i < row1; i++){
            for(int j = 0; j < cols1; j++){
                matrixSum[i][j]=matrixA[i][j] + matrixB[i][j];
            }
        }
       System.out.println("Matrix1 + matrix 2 = sum");
        for(int i = 0; i<row1; i++){
            for(int j =0; j<cols1; j++){
                System.out.print(matrixSum[i][j]+" ");
            }
            System.out.println();
        }
  }  
}
