import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n;
       int sum=0;
      /*while(true){
        System.out.println("Enter the number: ");
        n = sc.nextInt();
        sum+=n;
        System.out.println("Sum is :"+sum);
        if(sum>=100){
            System.out.println("Done");
            break;
        }
       }
   }*/
   for(int i=0;i<=10;i++){
    System.out.println("Enter no: ");
    n = sc.nextInt();
    sum+=n;
    System.out.println("sum is: "+sum);
    if(sum>=100){
        System.out.println("Done");
        break;
    }
   }
}
}

