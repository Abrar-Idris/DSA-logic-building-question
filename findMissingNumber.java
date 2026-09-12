import java.util.Scanner;
//find the missing number 
public class findMissingNumber {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

    System.out.print("Enter the length of array : ");
    int n =sc.nextInt();

    int arr[]=new int[n];

    System.out.println("enter the element ");
    for(int i =0; i<n; i++){
        arr[i]=sc.nextInt();
    }

     //logic 
     int actualSum = 0;
     for(int i =0; i<n; i++){
        actualSum += arr[i];
     }
     
     //expected sum 
    
     int expectedSum =(n+1)*(n+2)/2;

     int missingElement = expectedSum-actualSum;

     System.out.println("the missing number is : "+missingElement);



   } 
}

/*
approch sum difference 
time O(n)
space O(1)
single treversal
pattern mathematic array
 */