import java.util.Scanner;
//Day 41 DAS 
//count Even and Odd Number in a matrix
public class CountEvenOddInMatrix {
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
    int odd = 0;
    int even = 0;

    for(int i =0; i<rows; i++){
        for(int j =0; j<rows; j++){
            if(arr[i][j]%2==0){
              even++;
            }else{
                odd++;
            }
        }
    }

    //output 
    System.out.println("total Even number in matrix: "+even);
    System.out.println("total Odd Number in Matrix: "+odd);
   } 
}
