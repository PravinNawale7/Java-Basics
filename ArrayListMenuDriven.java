import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class MenuDriven {
    ArrayList<Integer> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void insertList() {
        System.out.println("Enter the Elements in List: ");
        for (int i = 0; i < 5; i++) {
            int input = sc.nextInt();
            list.add(input);
        }
        System.out.println("Elements inserted Sucessfully");
    }
   
   /* void insertList() {
        String choice;
        do {
            System.out.println("Enter an element to insert in the list: ");
            int input = sc.nextInt();
            if (list.contains(input)) {
                System.out.println(input + " is already in the list. Duplicate elements are not allowed.");
            } else {
                list.add(input);
                System.out.println(input + " added to the list.");
            }
            System.out.println("Do you want to insert another element? (yes/no): ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("yes"));
    }
  */
    void removeElement() {
        System.out.println("Enter Element You want to remove: ");
        int element = sc.nextInt();
        if (list.remove(Integer.valueOf(element))) {
            System.out.println(element + " removed from the list");
        } else {
            System.out.println(element + " is not in the list");
        }
    }

    void sortList() {
        Collections.sort(list);
        System.out.println("Sorted List is: " + list);
    }

    void display() {
        System.out.println("List is: " + list);
    }
}

public class ArrayListMenuDriven {
    public static void main(String[] args) {
        MenuDriven d = new MenuDriven();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----Menu-----");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Sort");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.println("Enter Your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    d.insertList();
                    break;
                case 2:
                    d.removeElement();
                    break;
                case 3:
                    d.sortList();
                    break;
                case 4:
                    d.display();
                    break;
                case 5:
                    System.out.println("Exit.....");
                    break;
                default:
                    System.out.println("Invalid Choice. Please Enter Valid Choice!");
            }
        } while (choice != 5);
    }
}
