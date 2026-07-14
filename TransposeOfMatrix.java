import java.util.Scanner;
//day 40 DSA
// transpose of matrix 

public class TransposeOfMatrix {
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
//normal matrix 
        for(int i =0; i<rows;i++){
            for(int j=0; j<cols; j++){
             System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
// logic 
    int transpose[][] =new int[cols][rows];

        for(int j =0; j<cols;j++){
            for(int i=0; i<rows; i++){
            transpose[j][i] = arr[i][j];
            }
        }
    //transpose matrix 
         for(int i =0; i<cols;i++){
            for(int j=0; j<rows; j++){
             System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        

    }
}
