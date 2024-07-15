import java.util.Scanner;

public class StringCheckingSmallGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second String: ");
        String s2 = sc.nextLine();
        
        int result = s1.compareTo(s2);
        
        if (result > 0) {
            System.out.println("String " + s1 + " is Greater than String " + s2);
        } else if (result < 0) {
            System.out.println("String " + s1 + " is Smaller than String " + s2);
        } else {
            System.out.println("String " + s1 + " is equal to String " + s2); 
        }
        System.out.println(result);

    }
}
