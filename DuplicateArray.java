import java.util.Scanner;

//DAS 16 find duplicate element in Array

public class DuplicateArray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" Element in array: ");

        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }
         boolean duplicate = false;
        for(int i = 0; i<n;i++){

            // ham second element check kare hai first element se compare
            for(int j =i+1; j<n;j++){
                if(arr[i]==arr[j]){
                    System.out.println("dublicate : "+arr[i]);
                 duplicate = true;
                 break;
                }
            }

        }
        if(!duplicate){
            System.out.println("Not dublicate element find");
        }
        sc.close();
    }
}

