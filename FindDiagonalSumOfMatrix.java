import java.util.Scanner;
//Day 39
//find the diagonal sum of a matrix 
public class FindDiagonalSumOfMatrix {
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

        int diagonal =0;
        for(int i =0; i<rows; i++){
            for(int j = 0; j<cols; j++){
              if(arr[i]==arr[j]){
                diagonal += arr[i][j];
              }
            }
        }
        System.out.println("Diagonal Sum : : "+diagonal);
    }
}
