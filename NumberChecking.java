import java.util.Scanner;

public class NumberChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Enter number between 1-8 Range: ");
        int number = sc.nextInt();
        if(number<=8 && number>=0){
            System.out.println("OK Done!");
            break;
        }else{
            System.out.println("Please Enter Valid Input");
        }

        }
    }
    
}
