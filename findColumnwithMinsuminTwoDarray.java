import java.util.Scanner;
//day 63
// find the coloum ......
public class findColumnwithMinsuminTwoDarray {
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

for(int j =0; j<cols; j++){
    int colSum = 0;
    for(int i =0; i<rows; i++){
       colSum += arr[i][j];
    }
    System.out.println("Column "+j+" sum : "+colSum);
    //check 
    if(colSum<minimumSum){
        minimumSum = colSum;
        index=j;
    }
}

System.out.println("Column "+index+" has minimum Sum : "+minimumSum);

    }
}
