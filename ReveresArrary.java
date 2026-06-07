import java.util.Scanner;
//third day of DSA leraning 
public class ReveresArrary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the "+n+" Element in array");
         for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
         }
        //  System.out.println("reverse using for loop");
        //  for(int i = n-1;i>=0;i--){
        //     System.out.println(arr[i]+ " ");
        //  }
      
       
        System.out.println("without Reverse ");
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

    System.out.println("");
        int start = 0;
        int end = n-1;

        while (start<end) {
            int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            
        }

        System.out.println("with Reverse :");
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

    
    }
    
}