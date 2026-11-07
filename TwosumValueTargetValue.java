import java.util.Scanner;


public class TwosumValueTargetValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the lenegth of array : ");
        int n =sc.nextInt();

       int arr[]= new int[n];
       System.out.println("enter the element ");
         for(int i =0; i<n; i++){
        arr[i]=sc.nextInt();
    }
     System.out.println("Enter the target value: ");
     int targetValue = sc.nextInt();
      

     boolean found = false;

     int index1 = -1;
     int index2 = -1;

     for(int i =0; i<n && !found; i++){
        for(int j =i+1; j<n;j++){

            if(arr[i]+arr[j]==targetValue){
               found = true;
               index2 =j;
                index1= i;
               break; 
            }
        }
     }

     if(found){
        System.out.println("indices : "+index1+"  "+index2);
     }else{
        System.out.println("No pair found");
     }
    }
    
}
