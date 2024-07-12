import java.util.Scanner;

public class TwoDimensionArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the no of Column: ");
        int n = sc.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array elements is: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}