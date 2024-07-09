import java.util.Scanner;

public class DiscountCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Price of item 1: ");
        double item1Price = scanner.nextDouble();
        
        System.out.print("Price of item 2: ");
        double item2Price = scanner.nextDouble();
        
        System.out.print("Discount in percentage: ");
        int discountPercentage = scanner.nextInt();
        
        double totalAmount = item1Price + item2Price;
        
        double discountAmount = (totalAmount * discountPercentage) / 100.0;
        
        double discountedAmount = totalAmount - discountAmount;
        
        System.out.println("Total amount: "+totalAmount);
        System.out.println("Discounted amount: "+ discountedAmount);
        System.out.println("Saved amount: "+discountAmount);
        
       
    }
}
