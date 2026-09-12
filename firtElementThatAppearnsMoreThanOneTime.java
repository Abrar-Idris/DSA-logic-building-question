/*given an integer array,find the first element that
appearns more than once 
 */

import java.util.Scanner;

public class firtElementThatAppearnsMoreThanOneTime {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the length of array : ");
    int n =sc.nextInt();

    int arr[]=new int[n];

    System.out.println("enter the element ");
    for(int i =0; i<n; i++){
        arr[i]=sc.nextInt();
    }

    //logic 
   
    boolean found =false;

   for(int i =0; i<n; i++){
    for(int j =0; j<i; j++){
    
        if(arr[i]==arr[j]);
        {
         System.out.println("first repeating element: "+arr[i]);
        found = true;
        break;

        //first loop stop
        }
    }
    if(found){
        break;
    }
    //second loop stop 
   }

    if(!found){
   System.out.println("no repeating element ");
    }
    sc.close();
    }
}
