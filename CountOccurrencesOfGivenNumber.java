import java.util.Scanner;

public class CountOccurrencesOfGivenNumber {
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

        int count = 0;
        
        for(int i = 0; i<arr.length; i++){
            if (treget == arr[i]) {
                count++;
            }
        }

        System.out.println("Number of Occurrenes "+count);
    }
}
