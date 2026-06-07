//count frequency of Array..

import java.util.Scanner;

public class FrequencyOfArray {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+n+" Element in array: ");

        for(int i = 0; i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("count frequency of Array");

         for(int i = 0; i <n; i++){
            boolean visited = false;

            //conut sab ky liye hote hai 
            //print srif ek bar hote hai .(duplicate skip).
            for(int j = 0; j<i;j++){
                if(arr[i]==arr[j]){
                    visited = true;
                    break;
                }
             
            }
            if(visited){
                continue;
            }
            int count = 0;
            for(int j = 0; j <n; j++){
                if(arr[i]==arr[j]){
                 count++;
                }
            }
            System.out.println(arr[i]+" ->"+count);
         }
         sc.close();
        }
        
    }
