import java.util.Arrays;
import java.util.Scanner;

public class LongestConsercutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the lenegth of array : ");
        int n =sc.nextInt();

       int arr[]= new int[n];
       System.out.println("enter the element ");
         for(int i =0; i<n; i++){
        arr[i]=sc.nextInt();
    }

   //sort th array (new features)
   Arrays.sort(arr);
   
   int count = 1;
   int maxLength = 1;
   for(int i = 0; i<n-1;i++){

    //duplicate check and ignore 
    if(arr[i]==arr[i+1]){
    continue;
    }

    if(arr[i]+1==arr[i+1]){
      count++;
   }else{
    count = 1;
   }
    

   if(count>maxLength){
    maxLength = count;
   }

   }
    System.out.println("Longest consercutive sequence length : "+maxLength);
    sc.close();

    }
}
