import java.util.Scanner;

public class MergeTwoArrays {
    //day 25 Merge two arrays 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of First array: ");
        int n1 = sc.nextInt();

        int arr1[] = new int[n1];
        System.out.println("Enter "+n1+" Element in array");
        for(int i = 0; i<n1; i++){
            arr1[i]= sc.nextInt();
        }

        System.out.println("Enter length of Second array: ");
        int n2 = sc.nextInt();

        int arr2[] = new int[n2];
        System.out.println("Enter "+n2+" Element in array");
        for(int i = 0; i<n2; i++){
            arr2[i]= sc.nextInt();
        }

       int n = n1+n2;
       int merged[] = new int[n];

       int k =0;
       
       for(int i = 0; i<arr1.length;i++){
        merged[k]=arr1[i];
        k++;
       }

       for(int i = 0; i<arr2.length;i++){
        merged[k]=arr2[i];
        k++;
       }

       for(int i = 0; i<merged.length;i++){
        System.out.print(" "+merged[i]);
       }
       

    }
}
