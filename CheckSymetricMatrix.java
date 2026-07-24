import java.util.Scanner;
//day 47,i think 48
//check  if a symetric 
public class CheckSymetricMatrix {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Row length : ");
        int rows =sc.nextInt();

        System.out.println("Enter the Columns length : ");
        int cols =sc.nextInt();

        int [][]arr =new int[rows][cols];

        for(int i =0; i<rows;i++){
            for(int j=0; j<cols; j++){
             arr[i][j]=sc.nextInt();
            }
        }
//logic
      if(rows != cols){
        System.out.println("row not equal columns ");
        return;
      }
      boolean symetric = true;
      for(int i = 0; i<rows; i++){
        for(int j = i; j<cols; j++){
           if(arr[i][j]!=arr[j][i]){
             symetric = false;
           }
        }

      }

      if(symetric){
        System.out.println("This is sametric Matrix");
      }else{
        System.out.println("Not symetric Matrix");
      }

      }
    }
