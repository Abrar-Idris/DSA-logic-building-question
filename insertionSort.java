/**
 * insertionSort
 * just prectice insertion sort ...
 */
public class insertionSort {

    public static void main(String[] args) {
        int arr[] ={13,11,12,6,5};

        for(int i =1;i<arr.length;i++){
            int num = arr[i];
            int j = i-1;

            while (j>=0 && arr[j]>num) {
                arr[j+1]=arr[j];
                j--;
            }
             // -1+1 = 0  num asing index 0 
            arr[j+1]=num;
        }

       for(int i = 0; i<arr.length; i++){
        System.out.println(arr[i]+" ");
       }
    }
}