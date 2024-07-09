import java.util.Scanner;
public class employee{
    public static void main(String[] args){
        String name;
        float basicsalary,withdrawal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of employee: ");
        name = sc.nextLine();
        System.out.println("Enter Your Basic Salary: ");
        basicsalary = sc.nextFloat();
        System.out.println("Enter Your Withdrawal: ");
        withdrawal = sc.nextFloat();
        float remaining = basicsalary - withdrawal;
        System.out.println(name);
        System.out.println(basicsalary);
        System.out.println(withdrawal);
        System.out.println("Remaining Balance: "+remaining);
        
    }
}