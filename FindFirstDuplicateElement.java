import java.util.Scanner;
// find the first Duplicate Element

// i face multiple problem in this question 
public class FindFirstDuplicateElement {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of First array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
         System.out.println("Enter "+n+" Element in array");
        for(int i = 0; i < n; i++){
            arr[i] =sc.nextInt();
        }

        int minDuplicate = n;
        int answer = -1;

        for(int i = 0; i<n; i++){
          for(int j =i+1; j<n; j++){
               if(arr[i]==arr[j]){
                if(j<minDuplicate){
                    minDuplicate=j;
                    answer = arr[i];
                }
               }
          }
        }
     if(answer == -1){
        System.out.println("Not duplicate");
     }else{
        System.out.println("first dublicate Element "+answer);
     }
     sc.close();  
   } 
}
