import java.util.Scanner;

/**
 * ReverseArrayWithoutNewArray
 * revrese an array (without creating another array);
 */
public class ReverseArrayWithoutNewArray {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" Element in array: ");

        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        int left = 0;
        int right = n-1;

    
        while (left<right){
                int temp = arr[left];
                arr[left] =arr[right];
                arr[right] = temp;

                left++;
                right--;
            }

       for(int i = 0; i<n; i++){
        System.out.print(arr[i]+" ");
       }
}
    
}