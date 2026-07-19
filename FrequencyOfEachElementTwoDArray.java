import java.util.Scanner;

public class FrequencyOfEachElementTwoDArray {
//day 43
//big challenging question 
// dry run for understanding
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter Columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter Elements:");

        for (int i= 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Logic
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                boolean visited = false;

                // Check if current element
                for (int x = 0; x <= i; x++) {
                    for (int y = 0; y < cols; y++) {

                        if (x == i && y >= j)
                            break;

                        if (arr[i][j] == arr[x][y]) {
                            visited = true;
                            break;
                        }
                    }

                }

                if (visited)
                    continue;

                int count = 0;

                // Count frequency in whole matrix
                for (int x = 0; x < rows; x++) {
                    for (int y = 0; y < cols; y++) {
                        if (arr[i][j] == arr[x][y]) {
                            count++;
                        }
                    }
                }

                System.out.println(arr[i][j] + " -> " + count);
            }
        }

        sc.close();
    }
}