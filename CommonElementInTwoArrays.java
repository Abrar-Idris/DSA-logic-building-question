import java.util.Scanner;
//Day 26 DSA practice
//find common element in two arrays ..

public class CommonElementInTwoArrays {
    
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
    

         boolean duplicate = false;

        for(int i = 0; i<n1;i++){
            for(int j = 0; j<n2;j++){
                if(arr1[i]==arr2[j]){
                  System.out.println("dublicate : "+arr1[i]);
                 duplicate = true;
                 break;
                }
            }
        }
        
    }
}
