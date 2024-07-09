import java.util.Scanner;

public class ArrayDiagonalAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the values for the matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                
            }
        }
        System.out.println("Matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        int calculate = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // sum = arr[0][0]+arr[1][1]+arr[2][2];
                if (i == j) {
                    sum += arr[i][j];
                }
                if (i == (n - 1 - j)) {
                    calculate += arr[i][j];

                }

            }

        }
        System.out.println("Addition of Diagonal :" + sum);
        System.out.println("Addition of another Diagonal :" + calculate);

    }
}
