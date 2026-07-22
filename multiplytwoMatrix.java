import java.util.Scanner;
//Day 45 
//multiply  Two matrix
public class multiplytwoMatrix {
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
          // first row secnod cols
        int[][] matrixMultiply = new int[row1][cols2];

        for(int i = 0; i < row1; i++){
            for(int j = 0; j < cols2; j++){
                matrixMultiply[i][j]= matrixA[i][j] * matrixB[i][j];
            }
        }
       System.out.println("Matrix1 + matrix 2 = sum");
        for(int i = 0; i<row1; i++){
            for(int j =0; j<cols2; j++){
                System.out.print(matrixMultiply[i][j]+" ");
            }
            System.out.println();
        }
  }  
    }
