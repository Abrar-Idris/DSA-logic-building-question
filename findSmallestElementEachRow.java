import java.util.Scanner;

public class findSmallestElementEachRow {
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
for(int i = 0; i< rows; i++){
    int smallestElement =arr[i][0];
    for(int j =0; j<cols; j++){
        if(arr[i][j]<smallestElement){
            smallestElement=arr[i][j];
        }

    }
    System.out.println("Row "+i+" Smallest Element : "+smallestElement);
}

   } 
}
