import java.util.Scanner;

public class SecondSmallestElemet {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" Element in array");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int firstSmallest= 0;
        int secondSmallest = 0;
         
          if(arr[0]>arr[1]){
           firstSmallest =arr[1];
           secondSmallest = arr[0];
          }if(arr[0]<arr[1]) {
            firstSmallest = arr[0];
            secondSmallest = arr[1];
          }

          for(int i =2; i<n; i++){
            if(arr[i]<firstSmallest){
                secondSmallest = firstSmallest;
                firstSmallest =arr[i];
            }if (arr[i]>firstSmallest && arr[i]<secondSmallest) {
                secondSmallest = arr[i];
            }
          }

          System.out.println("secondSmales : "+secondSmallest );
    }
}
