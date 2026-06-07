import java.util.Scanner;
//DSA 20 day average find
public class AverageOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n =sc.nextInt();

        int arr[] =new int[n];

        System.out.println("Enter "+n+" Element in array: ");

        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        int sum =0;
        int totalNumber =0;

        for(int i = 0; i<n; i++){
            sum = sum+arr[i];
            totalNumber++;
        }

        int average = sum /totalNumber;
        System.out.println("Average of Array : "+average);

    }
}
