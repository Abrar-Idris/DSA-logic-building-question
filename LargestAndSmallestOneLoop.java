import java.util.Scanner;
// day 22 DSA
public class LargestAndSmallestOneLoop {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" Element in array: ");

        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        int smallestElement = arr[0];
        int largestElement = arr[n-1];

        for(int i = 0; i<n; i++){
            if(arr[i]<smallestElement){
                smallestElement =arr[i];
            }if (arr[i]>largestElement) {
                largestElement = arr[i];
                
            } 

        }
        System.out.println("smallest number : "+smallestElement);
        System.out.println("Laregst number "+largestElement);
    }
}
