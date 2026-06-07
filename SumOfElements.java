import java.util.Scanner;
//DAS 19 days sum of elements 
public class SumOfElements {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array:");
        int n =sc.nextInt();

         int arr[] = new int[n];
        System.out.println("Enter "+n+" Element in array: ");

        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;

        for(int i= 0; i<n; i++){
            sum = arr[i]+sum;
        }

        System.out.println("sum of All element : "+sum);
    }
}
