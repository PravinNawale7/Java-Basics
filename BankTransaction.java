import java.util.Scanner;

class User {
    String username;
    String password;
    double balance;

    User(String username, String password) {
        this.username = username;
        this.password = password;
        this.balance = 0.0;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User("Pravin", "Password");

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (user.username.equals(username) && user.password.equals(password)) {
            int choice;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Show Balance");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        user.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        user.withdraw(withdrawAmount);
                        break;
                    case 3:
                        user.showBalance();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice != 4);
        } else {
            System.out.println("Invalid credentials. Please try again.");
        }

        scanner.close();
    }
}
