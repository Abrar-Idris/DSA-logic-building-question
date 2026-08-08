import java.util.Scanner;
//find the sum of both diagonal of a squre matrix 
//day 59

public class findSumOfBothDiagonalSquareMatrix {
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
int primaryDiagonalSum = 0;
int secondaryDialfonalSum = 0;
for(int i =0; i<rows; i++){
    for(int j =0; j<cols; j++){
        if(arr[i]==arr[j]){
            primaryDiagonalSum += arr[i][j];
        }
        if(i+j==cols-1){
        secondaryDialfonalSum += arr[i][j];
        }
    }
}
System.out.println("primary diagonal sum = "+primaryDiagonalSum);
System.out.println("Secondary diagonal sum = "+secondaryDialfonalSum);
    }
}
