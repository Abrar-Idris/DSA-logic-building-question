/*
find the largest difference between two element ,
where the larger element apppers after the smaller element 
day 77
 */

import java.util.Scanner;

public class findMaxImumDifference {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

    System.out.print("Enter the length of array : ");
    int n =sc.nextInt();

    int arr[]=new int[n];

    System.out.println("enter the element ");
    for(int i =0; i<n; i++){
        arr[i]=sc.nextInt();
    }

    //[7,1,4,3,6,4]
    //logic 
    int smallestElement =arr[0];// 7
    int maximumDifferenc = 0;

    for(int i =1; i<n;i++){
       int difference = arr[i]-smallestElement;
       //            -6  =     1-7
       //             3  =      4-7
       //             2  =      3-1
       if(difference>maximumDifferenc){
        //-6>0; condistion fail
        // 3>0
        // 2>3 condistion fail
        maximumDifferenc =difference;
        // 0 = 3  it means maximumdiffernec = 3

       }
        // 1 < 7 consistion true 
        // 4 < 1  condistion field
       if(arr[i]<smallestElement){

        smallestElement = arr[i];
        // smallest = 1;
       }
    }


    System.out.println("Maximum difference :"+maximumDifferenc);
    sc.close();

  }  
}

