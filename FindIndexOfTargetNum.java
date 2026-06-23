import java.util.Scanner;
//find the Index of a target Elementhgv c 
public class FindIndexOfTargetNum {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of First array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
         System.out.println("Enter "+n+" Element in array");
        for(int i = 0; i < n; i++){
            arr[i] =sc.nextInt();
        }

        System.out.print("Enter the treget Number: ");
        int treget =sc.nextInt();
        
        boolean visited = false;
        for(int i = 0; i<arr.length; i++){
            if (treget == arr[i]) {
                visited = true;
              System.out.println("Element "+treget+" Index Of  "+i);
               break;
            }
        }

        if(visited == false){
            System.out.println("Element Not Found ");
        }
    }
}
