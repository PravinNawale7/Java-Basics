import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to find factors: ");
        int num = sc.nextInt();
        int sum = 0;
        System.out.print("Factors of "+num+" is " );
        for(int i=1;i<=num;i++){
            if(num%i ==0){
                System.out.print(i+" ");
                sum+=i;
           }
        }
        System.out.println();
         System.out.println("Sum of factor is: "+sum);
    }
    
}
