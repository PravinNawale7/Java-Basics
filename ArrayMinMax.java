        import java.util.Scanner;

        public class ArrayMinMax {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of Array: ");
                int n = sc.nextInt();
                int arr[] = new int[n];
                System.out.println("Enter the array elements: ");
                for(int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                int max = arr[0];
                int min = arr[0];
                for(int i = 1; i < n; i++) {
                    max = (arr[i] > max) ? arr[i] : max;
                    min = (arr[i] < max) ? arr[i] : min;
                }
                System.out.println("Maximum element is: " + max);
                System.out.println("Minimum element is: "+ min);
            }
        }
        