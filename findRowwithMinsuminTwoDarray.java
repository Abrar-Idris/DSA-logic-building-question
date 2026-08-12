import java.util.Scanner;

/**
 * day 62
 * findRowwithMinsuminTwoDarray
 */
public class findRowwithMinsuminTwoDarray {
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
//logic 
int minimumSum =Integer.MAX_VALUE;
int index =0;

for(int i =0;i<rows; i++){
    int rowSum = 0;
    for(int j =0; j<cols; j++){
       rowSum += arr[i][j];
    }
    System.out.println("Row "+i+" sum : "+rowSum);
    //check 
    if(rowSum<minimumSum){
        minimumSum = rowSum;
        index=i;
    }
}

System.out.println("Row "+index+" has minimum Sum : "+minimumSum);

}
    
}