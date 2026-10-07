import java.util.Scanner;

/**
 * EquilibriumIndex
 */
public class EquilibriumIndex {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Length of Array: ");
    int n = sc.nextInt();
     
    int arr[]=new int[n];

    System.out.println("enter the element ");
    for(int i=0; i<n; i++){
      arr[i]=sc.nextInt();
    }
   var totalSum = 0;
   var leftSum = 0;
   var rightSum = 0;
   int index =0;
   
   for(int i=0; i<n; i++){
      totalSum +=arr[i];
   }

 for(int i =0; i<n; i++){
    rightSum = totalSum - leftSum-arr[i];
    if (leftSum == rightSum) {
        index = i;
        break;
    }
 leftSum +=arr[i];
 }

System.out.println("Equilibrium index : "+index);

}
    
}