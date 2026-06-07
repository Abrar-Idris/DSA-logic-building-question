import java.util.Scanner;
//DSA 21 count positive and negative and zero in array 
public class CountPositiveNegativeZero {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n =sc.nextInt();

        int arr[] =new int[n];

        System.out.println("Enter "+n+" Element in array: ");

        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i = 0; i<n; i++){
            if(arr[i]>0){
                positive++;
            }if (arr[i]<0) {
                negative++;
            } if(arr[i]==0) {
                zero++;
            } 
        }
       System.out.println("Positive Number = "+positive);
       System.out.println("Negative Number = "+negative);
       System.out.println("Zero number = "+zero);
    }
}
