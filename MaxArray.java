import java.util.Scanner;
//second of DSA learning 
public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the "+n+" Element of array");
        for(int i = 0;i < n;i++){
          arr[i] =sc.nextInt();
        }

        int max = arr[0];
        for(int i = 0; i <n; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }

        System.out.print("Maximum number : "+max);

    }
}
