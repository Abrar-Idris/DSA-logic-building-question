import java.util.Scanner;
//Day 37 DSA 
//find the Row with maximum Sum
public class findRowWithMaximumSum {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("EnterThe Rows : ");
    int rows =sc.nextInt();

    System.out.print("EnterThe Columns : ");
    int cols =sc.nextInt();

    int [][]arr =new int[rows][cols];
    
    for(int i =0; i<rows; i++){
        for(int j = 0; j <cols; j++){
            arr[i][j] =sc.nextInt();
        }
    }
    //logic 
    int maxSum = 0;
    int maxRow = 0;

      for(int i =0; i<rows; i++){
        int sum =0;
        for(int j = 0; j <cols; j++){
            sum +=arr[i][j];
        }
        if(sum>maxSum){
            maxSum = sum;
            maxRow = i;
        }
        
    }
    //output 
    System.out.println("MaxRows : "+maxRow);
    System.out.println("maxsum : "+maxSum);

 }   
}
