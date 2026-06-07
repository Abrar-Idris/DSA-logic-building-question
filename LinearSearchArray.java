import java.util.Scanner;

public class LinearSearchArray {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of ArraY: ");
        int n = sc.nextInt();
        //initilize array
        int[] arr = new int[n];

        System.out.println("Enter "+n+" Element in Array :");
        for(int i =0;i<n;i ++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter target Number : ");
        int target = sc.nextInt();
         
        boolean found = false;
        for(int i = 0;i<n;i++){
            if(arr[i]== target){
                 found = true;
                System.out.println(target+" Found at Index : "+i);
                System.out.println("Target number is Availbel in Array ");
                break;
            
            }
           
        }
        if ( found == false) {
            System.out.println("element not found");
        }


    }
    
}