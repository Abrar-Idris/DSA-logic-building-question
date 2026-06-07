import java.util.Scanner;

//DSA day 17  move all zero in the last postion 

public class MoveAllZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" Element in array: ");

        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        int index = 0; 
        for(int i = 0; i<n;i++){
            if(arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
    
        }
         while (index <n) {
               arr[index] =0;
               index++;
            }

            for(int i =0; i<n;i++){
                System.out.print(arr[i]+" ");
            }



    }
}