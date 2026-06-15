import java.util.Scanner;

public class CheckTowArrayEqual {
  //  check if two arrays are equal
  // order and element both are check

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

       if(n1!=n2){
        System.out.println("array length isNot equal");
        return;
       }

       boolean equal = true;

       for(int i = 0; i<n1; i++){
        if(arr1[i]!= arr2[i]){
            equal = false;
            break;
        }
       }
       if(equal){
        System.out.println("both array are Equal");
       }else{
        System.out.println("both array are not equal");
       }
       sc.close();
  }
}
