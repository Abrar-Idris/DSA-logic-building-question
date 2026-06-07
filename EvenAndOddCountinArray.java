import java.util.Scanner;

public class EvenAndOddCountinArray {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length of array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter "+n+" Element in array..");
    for(int i = 0; i< n; i++){
        arr[i]=sc.nextInt();
    }

    //Even AND Odd count in array logic 
       int even = 0;
       int odd = 0;
    for(int i = 0; i<n;i++){
        if(arr[i]%2==0){
          even++;
        }else{
            odd++;
        }
    }
    System.out.println("total even number : "+even);
    System.out.println("totla odd number : "+odd);

}
    
}