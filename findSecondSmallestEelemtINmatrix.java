import java.util.Scanner;
//day 65
public class findSecondSmallestEelemtINmatrix {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.print("Enter the row lenght : ");
    int rows =sc.nextInt();

    System.out.print("Enter the cols lenght : ");
    int cols =sc.nextInt();

    int arr[][]=new int[rows][cols];
//input
    for(int i =0; i<rows; i++){
        for(int j =0; j<cols; j++){
            arr[i][j] = sc.nextInt();
        }
       
    }
//print
     for(int i =0; i<rows; i++){
        for(int j =0; j<cols; j++){
            System.out.print(" "+arr[i][j]);
        }
       System.out.println();
    }

    //logic
    int smallest =arr[0][0];
    int secondSmallestElement = arr[0][0];

    for(int i = 0; i< rows; i++){
        for(int j =0; j<cols; j++){

          if(smallest>arr[i][j]){
            secondSmallestElement = smallest;
             smallest = arr[i][j];

          }else if(arr[i][j]>smallest && arr[i][j]<secondSmallestElement) {
            secondSmallestElement = arr[i][j];
          } 

        }
    }
     System.out.println("first smallest Element = "+smallest);
     System.out.println("Second Smallest Element : "+secondSmallestElement);
    
}
}