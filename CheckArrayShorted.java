import java.util.Scanner;

public class CheckArrayShorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the lenght of array :");

        int n =sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter "+n+" Element in array");
        for(int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }

        boolean sorted = true;

        for(int i = 0; i < n-1; i++){
         if (arr[i]>arr[i+1]) {
            sorted = false;
            break;
         }
        }
     if(sorted){
     System.out.println(" shorted array ");
     }else{
        System.out.println("array is not sorted ");
     }
    }
}