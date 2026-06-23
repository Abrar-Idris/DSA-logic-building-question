import java.util.Scanner;
//day 29 count Elements greater than given Number
public class CountElementsGreaterGivenNumber {
    
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
        int count=0;

        for(int i = 0; i<n; i++){
            if(treget<arr[i]){
                count++;
            }
        }
        System.out.println("Number of greater elements of compare to target  : "+count);
    }
}
