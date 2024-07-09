import java.util.Scanner;
public class Login {
    public static void main(String[] args){
    String username = "Pravin";
    String password = "123456";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Username: ");
    String user = sc.nextLine();
    System.out.println("Enter Your Password: ");
    String pass = sc.nextLine();
        if (username.equals(user) ) {
            if (password .equals(pass)) {
                System.out.println("Login successfully!");
            } else {
                System.out.println("Password is wrong.");
            }
        } else {
            if (password .equals(pass)
            ) {
                System.out.println("Username is wrong.");
            } else {
                System.out.println("Both username and password are wrong.");
            }
        }

    }
}