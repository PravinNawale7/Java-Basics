import java.util.Scanner;

public class CheckSpaceString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String: ");
        String str = sc.nextLine();
        int count=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        System.out.println("Space count in a String is "+count);
    }
}