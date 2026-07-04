import java.util.Scanner;

public class TwoDarrayFindLargestElement {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter the Rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter the columns: ");
        int cols = sc.nextInt();

        int [][]arr =new int[rows][cols];
//input
         for(int i =0; i<rows; i++){
            for(int j =0; j<cols; j++){
            arr[i][j]=sc.nextInt();
            }

        }
//logic
        int largest = arr[0][0];

        for(int i =0; i<rows; i++){
            for(int j =0; j<cols; j++){
                if(arr[i][j]>largest){
                    largest = arr[i][j];
                }
            }
        }
//output
       for(int i =0; i< rows; i++){
        for (int j= 0; j <cols; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("largest : "+largest);
    

    }
}
