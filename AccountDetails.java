import java.util.Scanner;

public class AccountDetails {
    private Transactions nisarg = new Transactions();
    private String Username = "Nisarg";
    private int Password = 123;

    public AccountDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String inputUsername = sc.nextLine();
        System.out.print("Enter Password: ");
        int inputPassword = sc.nextInt();

        if (inputUsername.equals(Username) && inputPassword == Password) {
            int ch;
            do {
                System.out.println("Enter your Choice: ");
                System.out.println("1. Deposit");
                System.out.println("2. Withdrawal");
                System.out.println("3. Show Balance");
                System.out.println("4. Exit");
                ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        nisarg.deposit();
                        break;
                    case 2:
                        nisarg.withdrawal();
                        break;
                    case 3:
                        nisarg.showBalance();
                        break;
                    case 4:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Invalid choice, please try again.");
                }

            } while (ch != 4);
        } else {
            System.out.println("Access Denied. Please Check Credentials.");
        }

        sc.close();
    }

    public static void main(String[] args) {
        new AccountDetails();
    }
}

class Transactions {
    private int balance = 0;
    Scanner sc = new Scanner(System.in);

    void deposit() {
        System.out.print("Enter Amount to Deposit: ");
        int deposit = sc.nextInt();
        balance += deposit;
        System.out.println(deposit + " Amount Deposited Successfully");
    }

    void withdrawal() {
        System.out.print("Enter Amount to Withdraw: ");
        int withdrawal = sc.nextInt();
        if (withdrawal <= balance) {
            balance -= withdrawal;
            System.out.println(withdrawal + " Amount Withdrawn Successfully");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
