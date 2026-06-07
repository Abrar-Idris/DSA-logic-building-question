import java.util.Scanner;
//DAY 15 DSA check palindrome in array
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" Element in array: ");

        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        int start = 0;
        int end = n-1;

        boolean palindrom = true;

        while (start<end) {

            if(arr[start]!=arr[end]){
             palindrom = false;
             break;
            }
            start++;
            end--;
            
        }

        if(palindrom){
            System.out.println("array is palindrome");
        }else{
            System.out.println("array is not palindrome");
        }


    }
}
