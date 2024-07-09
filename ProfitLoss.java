import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of dozens of toys purchased: ");
        int x = sc.nextInt();
        System.out.println("Enter the price per dozen: ");
        float y = sc.nextFloat();
        System.out.println("Enter the selling price of 1 toy: ");
        float z = sc.nextFloat();
        float costPricePerToy = y / 12;
        float profit = z - costPricePerToy;
        float profitPercentage = profit / costPricePerToy * 100;
        System.out.println("Profit is " + profitPercentage + "%");
    }
}
