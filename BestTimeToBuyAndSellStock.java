import java.util.Scanner;

/**
 * BestTimeToBuyAndSellStock
 */
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total wroking stock day : ");
        int n =sc.nextInt();

       int arr[]= new int[n];
       System.out.println("Enter the stock price each day: ");
         for(int i =0; i<n; i++){
        arr[i]=sc.nextInt();
    }


    int minPrice = arr[0];
    int maxProfit = 0;
    for(int i =1; i<n;i++){
        int currentProfit = arr[i]-minPrice;

        if(currentProfit>maxProfit){
            maxProfit =currentProfit;
        }

        if(arr[i]<minPrice){
            minPrice = arr[i];
        }
    }
    System.out.println("Maximum Profit : "+maxProfit);
}
    
}