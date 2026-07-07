import java.util.Scanner;

/**
 * Day 38
 * find the column with maximum 
 * ColumnsWithMaximumSum
 */
public class ColumnsWithMaximumSum {

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

     System.out.print("EnterThe Rows : ");
     int rows =sc.nextInt();

    System.out.print("EnterThe Columns : ");
    int cols =sc.nextInt();

    int [][]arr =new int[rows][cols];
    
    for(int i =0; i<rows; i++){
        for(int j = 0; j <cols; j++){
            arr[i][j] =sc.nextInt();
        }
    }
    //logic 
    int maxSum = 0;
    int maxCols = 0;

    for(int j = 0; j<cols; j++){
        int sum =0;
     for(int i = 0; i<rows;i++){
       sum +=arr[i][j];
     }

     if(sum>maxSum){
        maxSum = sum;
        maxCols =j;
     }
    }

        
    
    //output 
    System.out.println("MaxRows : "+maxCols);
    System.out.println("maxsum : "+maxSum);

   } 
}