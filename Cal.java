import java.util.Scanner;
public class Cal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Frist Number: ");
        float a = sc.nextFloat();
        System.out.println("Enter the Second Number: ");
        float b = sc.nextFloat();
        System.out.println("Enter Symbol to perform Operation: ");
        char ch = sc.next().charAt(0);
        if(ch=='+'){
            System.out.println("Addition: "+(a+b));
        }else if (ch=='-') {
            System.out.println("Substration: "+(a-b));
        }else if (ch=='*') {
            System.out.println("Multiplication: "+(a*b));
        }else if (ch=='/') {
            System.out.println("Division: "+(a/b));   
        }else{
            System.out.println("Invalid Input");
        }
    }
}