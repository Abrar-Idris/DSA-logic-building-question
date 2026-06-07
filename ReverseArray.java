import java.util.Scanner;
//DAY 14  revers array
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" Element in array: ");

        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }

       //reverse array 
        int start =0;
        int end = n-1;

        while (start<end) {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end] = temp;

            start++;
            end--;

        }

        System.out.println("reverse Array :");

        for(int i = 0; i< n; i++){
            System.out.print(arr[i]+" ");
        }
 
    }
}
