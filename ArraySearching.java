import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element you want to search: ");
        int ele = sc.nextInt();

        int flag = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) {
                flag = 0;
                System.out.println("Element found at position " + (i + 1));
                break; 
            }
        }
        
        if (flag == 1) {
            System.out.println("Element is not found");
        }
    }
}
