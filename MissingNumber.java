import java.util.Scanner;

public class MissingNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.print("Enter length of Array: ");
    int n =sc.nextInt();

          
    int arr[] = new int[n];

     System.out.println("Enter "+n+" Element in Array");
    for(int i = 0; i<n;i++){
        arr[i]=sc.nextInt();
    } 


    //excpected sum se array of sum ko minus kare de ga ..
     int sum= 0;
    //step 1 
    int size = n+1;
    sum =size*(size+1)/2;
    System.out.println("Expected sum :"+sum);

    //Aarray of sum 
    int sumofArray= 0;
    for(int i = 0; i<n; i++){
     sumofArray +=arr[i];
    
    }
    System.out.println("sum of array: "+sumofArray);
     
    int missingNumber = (sumofArray -sum);

    System.out.println("Missing numbar : "+missingNumber);
    }
}
