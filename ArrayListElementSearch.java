import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListElementSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Enter 5 integer elements:");
        for (int i = 0; i < 5; i++) {
            int input = sc.nextInt();
            list.add(input);
        }
        System.out.println("Values in the list: " + list);

        System.out.println("Enter the number to search and remove:");
        int n = sc.nextInt();

        if (list.contains(n)) {
            list.remove(Integer.valueOf(n));
            System.out.println("Element " + n + " was removed.");
            System.out.println("Updated list: " + list);
        } else {
        	System.out.println("Element not found");
        }
    }
}
