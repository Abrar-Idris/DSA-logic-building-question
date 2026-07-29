import java.util.Scanner;

/**
 * CountEvenAndOddinTwoDarray
 */
public class CountEvenAndOddinTwoDarray {

    public static void main(String[] args) {
         
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the row length : ");
    int rows =sc.nextInt();

    System.out.print("Enter the columns length : ");
    int cols =sc.nextInt();

    int arr[][]=new int[rows][cols];

    for(int i =0; i<rows; i++){
        for(int j = 0; j<cols; j++){
          arr[i][j]=sc.nextInt();
        }
    }
     System.out.println();

    for(int i =0; i<rows; i++){
        for(int j = 0; j<cols; j++){
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

    //logic
    int evenNumber = 0;
    int oddNumber = 0;

    for(int i =0; i<rows; i++){
        for(int j = 0; j<cols; j++){
         if(arr[i][j]%2==0){
            evenNumber++;
         }else{
            oddNumber++;
         }
        }   
    }

    System.out.println("total Even number : "+evenNumber);
    System.out.println("total Odd number : "+oddNumber);

    }

}