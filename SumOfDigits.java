import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int sum = 0, result = 0;
        while (n != 0) {
            result = n % 10;
            sum += result;
            n = n / 10;
        }
        System.out.println("Sum of Digit is: " + sum);
    }

}
