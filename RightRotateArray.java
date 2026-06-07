import java.util.Scanner;

//DSA day 9 

public class RightRotateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " Elements in Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 1. Last element ko save karein
        int last = arr[n - 1];

        // 2. Right shift loop (Sahi logic)
        // Hum n-1 se shuru karenge aur 1 tak jayenge
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; // Pichle element ko ek kadam aage badhayein
        }

        // 3. Pehle index par saved element rakhein
        arr[0] = last;

        System.out.println("Right rotated array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}