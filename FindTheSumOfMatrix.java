import java.util.Scanner;
//day 35 
//find the sum of all elements in a matrix

public class FindTheSumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter the Rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter the columns: ");
        int cols = sc.nextInt();

        int[][]arr = new int[rows][cols];
        int sum =0;
        for(int i =0; i<rows; i++){
            for(int j =0; j<cols; j++){
                arr[i][j]=sc.nextInt();
                sum += arr[i][j];
            }
        }

       for(int i =0; i< rows; i++){
        for (int j= 0; j <cols; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("Sum of matrix : "+sum);
    
   } 
}

