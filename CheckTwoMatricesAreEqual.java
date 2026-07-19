import java.util.Scanner;
//Day 43 DSA practice
//check if two matrices are equal
public class CheckTwoMatricesAreEqual {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //first matrix 

     System.out.print("Enter Rows: ");
        int row1 = sc.nextInt();

        System.out.print("Enter Columns: ");
        int cols1 = sc.nextInt();

        int[][] arr1 = new int[row1][cols1];

        System.out.println("Enter Elements:");

        for (int i= 0; i < row1; i++) {
            for (int j = 0; j < cols1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        //second matrics

        System.out.print("Enter second matrics Rows: ");
        int row2 = sc.nextInt();

        System.out.print("Enter second matrics Columns: ");
        int cols2 = sc.nextInt();

        int[][] arr2 = new int[row2][cols2];

        System.out.println("Enter Elements:");

        for (int i= 0; i < row2; i++) {
            for (int j = 0; j < cols2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        //logic
        if(row1 != row2 || cols1 != cols2){
            System.out.println("Matrices length isNot equal");
        return;
        }
        
        boolean equal = true;

        for(int i = 0; i<row1; i++){
            for(int j = 0; j<cols1; j++){
                if(arr1[i][j]!=arr2[i][j]){
                 equal = false;
                 break;
                }
            }
        }

        if(equal){
            System.out.println("Both Matrices are equal ");
        }else{
            System.out.println("both matrices are not equal");
        }
    
    

  }  
}
