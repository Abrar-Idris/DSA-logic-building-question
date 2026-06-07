import java.util.Scanner;

public class LeftRotateArray {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Array: ");
        int n =sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" Element in Array");
        for(int i = 0; i<n;i++){
        arr[i]=sc.nextInt();
    }

       int first = arr[0];


       //left shift
        for(int i = 0;i<n-1;i++){
           arr[i]=arr[i+1];
        }
        
       //put first element at last 
      arr[n-1]= first;

       System.out.println(" rotate array: ");
       for(int i = 0; i<n;i++){
        System.out.println(arr[i]+" ");
       }
       sc.close();
    }
}
