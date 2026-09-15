import java.util.Scanner;
//find the length longest contiguous subarray in which
//every element is greather then the element before it ..
//day 78

public class LongestIncreasingContiguousSubarray {
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
    int currentLength = 1;
    int maxlenght = 1;
     
    for(int i =0; i<n-1; i++){

        if(arr[i]<arr[i+1]){
         currentLength++;
        }else{
            currentLength = 1;
        }

    if(currentLength>maxlenght){
        maxlenght = currentLength;
    }
    }
     

    System.out.println("the longest increasing contiguouse Sub array is "+maxlenght);
    }
}
