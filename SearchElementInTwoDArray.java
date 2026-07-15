import java.util.Scanner;

/**
 * Day 42 DSA practice 
 * SearchElementInTwoDArray
 */
public class SearchElementInTwoDArray {
  
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

    System.out.print("Enter Rows length: ");
    int rows =sc.nextInt();

    System.out.print("Enter columns length: ");
    int cols =sc.nextInt();

    int arr[][] = new int[rows][cols];

    for(int i =0; i<rows; i++){
        for(int j =0; j<cols; j++){
            arr[i][j] =sc.nextInt();
        }
    }
//logic 
    System.out.print("enter the target Number : ");
    int target =sc.nextInt();
    boolean found = false;
     
    for(int i =0; i<rows; i++){
        for(int j =0; j<cols; j++){
            if(target == arr[i][j]){
                found = true;
            }
        }
    }
    if(found){
        System.out.println("Target is found ");
    }else{
        System.out.println("Target is Not Found");
    }
}
    
}