import java.util.Scanner;
//DAS 6 days
//find second largest number in array
public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Lenght of Array: ");
        int n =sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" Element in array:");
           for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
           }
    
           System.out.println("second Largest number");
          int first;
          int second;

          //step 1 select first element and second element 
          if(arr[0]>arr[1]){
            first = arr[0];
            second = arr[1];
          }else{
            first = arr[1];
            second = arr[0];
          }
          //step 2  use both element for verifiy 
          for(int i = 2; i<n; i++){
            if(arr[i]>first){
                //agar index 2 first element se bada ho ga to yah conadistion chale gi..
                second = first;
                first = arr[i];
            }else if(arr[i]>second && arr[i]!=first){
                //index 2 scond se bada hai ,
                //our first ky barabar nahi hai to 
                //index 2 hai wo first ho jaye ga.
             second = arr[i];
            }
          }
    
    System.out.println("second : "+second);
    sc.close();
}

}
