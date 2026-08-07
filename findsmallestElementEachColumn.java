import java.util.Scanner;
//day 58
//find the smallest element in each column
public class findsmallestElementEachColumn {
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
for(int j = 0; j< cols; j++){
    int smallest = arr[j][0];
    for(int i =0; i<rows; i++){
        if(arr[i][j]<smallest){
            smallest=arr[i][j];
        }

    }
    System.out.println("column "+j+" smallest Element : "+smallest);
    }
}
}