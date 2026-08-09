import java.util.Scanner;

public class findrowWithMaxSumInTwoDarray {
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
int row =0;
int maximumSum = 0;

for(int i = 0; i<rows; i++){
    int sum = 0;
    for(int j =0; j<cols; j++){
       sum += arr[i][j];
    }
    System.out.println("Row "+i+" sum : "+sum);
    if(sum>maximumSum){
        maximumSum =sum;
        row =i;
    }
}
System.out.println();
  System.out.println("Row "+row+" has Maximum sum : "+maximumSum);
 }   
}
