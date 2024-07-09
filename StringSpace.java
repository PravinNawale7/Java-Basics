import java.util.Scanner;

public class StringSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input = sc.nextLine();
        for(int i=0;i<input.length();i++){
            System.out.print(input.charAt(i)+" ");
        }
        


    }
    
}
