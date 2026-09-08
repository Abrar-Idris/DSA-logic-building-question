import java.util.Scanner;

public class FirstNonRepeatingElementInArray {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
    System.out.print("enter the length of array : ");
    int n =sc.nextInt();

    int arr[]=new int[n];

    for(int i =0; i<n; i++){
        arr[i]=sc.nextInt();
    }

  //logic 
 
  for(int i =0; i<n; i++){
     int count =0;
    for(int j =0; j<n; j++){
        if(arr[i]==arr[j]){
           count++;
        }
    }
   System.out.println(arr[i]+" "+count+" times");

   if(count == 1){
    System.out.println("non repeating element "+arr[i]);
    break;
   }
  }
  
   } 
}
