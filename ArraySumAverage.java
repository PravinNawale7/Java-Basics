import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array input: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Array elements are: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
        }
        System.out.println("Sum of Array is:"+sum);
        int avg=0;
        for(int i=0;i<n;i++){
            avg=sum/n;
        }
        System.out.println("Average of Array is: "+avg);
    }
    
}
