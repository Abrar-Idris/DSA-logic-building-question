import java.util.Scanner;
//Day 36 of DSA
//find tha smallest element in matrix
public class findSmallestElementInMatrix {
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
    int smallest = arr[0][0];
    for(int i =0; i<rows; i++){
        for(int j = 0; j <cols; j++){
            if(arr[i][j]<smallest){
                arr[i][j]= smallest;
            }
        }
    }

    for(int i =0; i<rows; i++){
        for(int j = 0; j <cols; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }

     System.out.println("smallest Element : "+smallest);
    
    }
}
