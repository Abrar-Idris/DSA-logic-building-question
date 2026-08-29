import java.util.Scanner;
// 69 is complex and challeneging, 

//find the sum of the bounadry element of 2d MATRix
public class findSumofBoundaryElement {
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
int boundarySum =0;


for(int i = 0; i<rows; i++){
    for(int j = 0; j<cols; j++){
        if(i == 0 || i == rows -1 || j == 0 || j== cols -1){
            boundarySum += arr[i][j];
        }
    }
}
System.out.println("Sum Boundar element :"+boundarySum);
   } 
}
