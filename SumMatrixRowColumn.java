
import java.util.Scanner;

public class SumMatrixRowColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of Rows: ");
        int m = sc.nextInt();
        
        System.out.println("Enter number of Columns: ");
        int n = sc.nextInt();
        
        int[][] arr = new int[m][n];
        
        System.out.println("Enter the elements in Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            int sumRow = 0;
            for (int j = 0; j < n; j++) {
                sumRow += arr[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sumRow);
        }
        for (int j = 0; j < n; j++) {
            int sumCol = 0;
            for (int i = 0; i < m; i++) {
                sumCol += arr[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + sumCol);
        }
        
    }
}
