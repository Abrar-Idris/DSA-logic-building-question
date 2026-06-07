import java.util.Scanner;
//first day of DAS learning 
public class sumofArray {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //size of array
    System.out.print("Enter the Size of aarry: ");
    int n = sc.nextInt();
    
    int[] arr = new int[n];

    //element of array 
    System.out.print("Enter "+n+" Elements");
    for(int i = 0; i < n;i++){
        arr[i] = sc.nextInt();
    }

   // sum of array 
     int sum = 0;
     for(int i =0; i < n;i++){
        sum += arr[i];
     }
    System.out.print("Sum of array : "+sum);


}   
}
