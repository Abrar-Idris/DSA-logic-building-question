import java.util.Scanner;
//find the column with maximum sum in a 2d matrix
// day 61
public class findColumnwithMaxSumInTwoDarray {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the row lenght : ");
    int rows =sc.nextInt();

    System.out.print("Enter the cols lenght : ");
    int cols =sc.nextInt();

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

    System.out.println();
//logic 
int col =0;
int maximumSum = Integer.MIN_VALUE;

for(int j = 0; j<cols; j++){
    int sum = 0;
    for(int i =0; i<rows; i++){
       sum += arr[i][j];
    }
    System.out.println("Row "+j+" sum : "+sum);
    if(sum>maximumSum){
        maximumSum =sum;
        col =j;
    }
}
System.out.println();
  System.out.println("Row "+col+" has Maximum sum : "+maximumSum);
 }   

}
