// find duplicate number in arr ay 
//Day 7 DAS Learning


import java.util.Scanner;
public class removeDuplicateNumber {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter length of Array: ");
    int n =sc.nextInt();

    int arr[] = new int[n];
System.out.println("Enter "+n+" Element in Array");
    for(int i = 0; i<n;i++){
        arr[i]=sc.nextInt();
    }
     boolean isduplicate = false;
    for(int i = 0; i<n; i++){
        for(int j = 0; j < i; j++){
            if(arr[i]==arr[j]){
                isduplicate = true;
                break;
            }
        }
        if(isduplicate = false){
            System.out.print(arr[i]+" ");
        }
    }

}
}
