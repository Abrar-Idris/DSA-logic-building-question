import java.util.Scanner;

/**
 * find the row with the maximum Number of even element
 * day 67
 */
public class findRowWithMaxNumberOfEvenElement {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the row lenght : ");
    int rows =sc.nextInt();

    System.out.print("Enter the cols lenght : ");
    int cols =sc.nextInt();

    int arr[][]=new int[rows][cols];
//input
    for(int i =0; i<rows; i++){
        for(int j =0; j<cols; j++){
            arr[i][j] = sc.nextInt();
        }
       
    }
//print
     for(int i =0; i<rows; i++){
        for(int j =0; j<cols; j++){
            System.out.print(" "+arr[i][j]);
        }
       System.out.println();
    }

    //logic
    int countElement= 0;
    int maximumEvenNumberRow= 0;

    for(int i =0; i<rows; i++){

        int evenElementInRow = 0;

        for(int j =0; j<cols; j++){
            
         if(arr[i][j]%2==0){
            evenElementInRow++;
         }    
        }

        if (countElement<evenElementInRow) {
            countElement = evenElementInRow;
            maximumEvenNumberRow =i;
        }
       
    }

    System.out.println("MaximumEven Number in this Row "+maximumEvenNumberRow);

}
    
}