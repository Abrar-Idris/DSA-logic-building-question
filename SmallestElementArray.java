import java.util.Scanner;
//DSA day 13 smallest element and highest element 
public class SmallestElementArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" Element in array");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }

       int smallestNumber = arr[0];
       for(int i = 0; i <n; i++){
        if(arr[i]<smallestNumber){ // FIND highest element arr[i]> max 
            smallestNumber = arr[i];
        }
       }
       
       System.out.println("The smallest element is: " + smallestNumber);
       sc.close();
    }

}
