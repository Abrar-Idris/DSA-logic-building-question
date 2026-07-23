import java.util.Scanner;
//DAY 46
//transpose matrix without using new array,
public class TransposeMatrixWithoutUsingNewArray {
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
//logic 
      for(int i =0; i<rows;i++){
            for(int j=i; j<cols; j++){
             int temp = arr[i][j];
             arr[i][j] = arr[j][i];
             arr[j][i] = temp;
            }
        }
    //transpose matrix 
         for(int i =0; i<cols;i++){
            for(int j=0; j<rows; j++){
             System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


   } 
}
