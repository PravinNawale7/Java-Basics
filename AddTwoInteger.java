import java.util.Scanner;

public class AddTwoInteger {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;
       int a = sc.nextInt();
       int b = sc.nextInt();
       int sum = a+b;
       if(sum<0){
        System.out.println(-1);
       }
       else{
        System.out.println(sum);
       }
    }
}
