import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount: ");
        float principleAmt = sc.nextFloat();
        System.out.println("Enter Rate of interest: ");
        float rateOfInterest = sc.nextFloat();
        System.out.println("Enter the Time period: ");
        float time = sc.nextFloat();
        float SI = principleAmt*rateOfInterest*time/100;
        System.out.println("Simple Interest is :  "+SI);
    }
}