import java.util.Scanner;

//day 12
//count occurrences of target Element

public class countOccurrencesOfTreagetElement {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Eneter length of Array : ");
    int n =sc.nextInt();

    int arr[] = new int[n];

    System.out.println("Enter "+n+" Element in array");
    for(int i = 0; i < n; i++){
        arr[i]=sc.nextInt();
    }

    System.out.print("Enter target number : ");
    int target = sc.nextInt();

    int count = 0;

    for(int i = 0; i<n; i++){
        if(arr[i]==target){
            count++;
        }
    }

    System.out.println(target+" Occurs "+count+" times");
     sc.close();


   } 
}
