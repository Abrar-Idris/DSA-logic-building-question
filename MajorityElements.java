import java.util.Scanner;

//using nested loop time complexity n^2

public class MajorityElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the lenegth of array : ");
       int n = sc.nextInt();

       int arr[]=new int[n];
       System.out.println("enter the element ");
       for(int i =0; i<n; i++){
        arr[i]=sc.nextInt();
    }
     boolean found = false;
    for(int i =0; i<n;i++){
      int count = 0;
      for(int j =0;j<n;j++){
        if(arr[i]==arr[j]){
            count++;
        }
      }
      if(count>n/2){
        System.out.println("the majority element is "+arr[i]);
        found = true;
        break;
      }
    }
    if(!found){
        System.out.println("majority element is not exist");
    }
    }
}
