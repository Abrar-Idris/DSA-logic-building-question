import java.util.Scanner;

//DSA day 31  move all zero in the last postion 

public class MoveAllZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" Element in array: ");

        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }

       int index = 0;

       for(int i = 0; i<n; i++){
        if(arr[i]!=0){
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i]=temp;

            index++;
        }
       }
      System.out.println("array after moving Zeros");
      for(int i = 0; i<n; i++){
        System.out.print(arr[i]+" ");
      }
    }
}