import java.util.Scanner;
//DAS 18 count even and Odd in array
public class CountEvenAndOddNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array:");
        int n =sc.nextInt();

         int arr[] = new int[n];
        System.out.println("Enter "+n+" Element in array: ");

        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < n;i++ ){
            if(arr[i]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

            System.out.println("Even = "+evenCount);
            System.out.println("Odd = "+oddCount);

    }
}