import java.util.Scanner;

public class StringReverseChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        
        String reversedString = "";
        int end = str.length();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                for (int j = i + 1; j < end; j++) {
                    reversedString += str.charAt(j);
                }
                reversedString += ' ';
                end = i;
            } else if (i == 0) {
                for (int j = i; j < end; j++) {
                    reversedString += str.charAt(j);
                }
            }
        }
        
        System.out.println("Reversed String: " + reversedString);
    }
}
