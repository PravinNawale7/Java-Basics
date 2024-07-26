import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {
    public static void main(String[] args) {
		ArrayList<String> homogeneousList = new ArrayList<>();
		homogeneousList.add("Pravin");
		homogeneousList.add("Nisarg");
		homogeneousList.add("Chetan");
		homogeneousList.add("Yashodeep");
		homogeneousList.add("kshitij");
		homogeneousList.add("Sachin");

		System.out.println("Homogeneous List: "+homogeneousList);
		
	    ArrayList<Object> heterogeneousList = new ArrayList<>();
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the integer");
	    int a = sc.nextInt();
	    heterogeneousList.add(a);
	    
	    System.out.println("Enter the floating value: ");
	    float b = sc.nextFloat();
	    heterogeneousList.add(b);
	    sc.nextLine();
	    
	    System.out.println("Enter the String Value: ");
	    String c = sc.nextLine();
	    heterogeneousList.add(c);
	    
	    System.out.println("Enter boolean Value: ");
	    boolean d = sc.nextBoolean();
	    heterogeneousList.add(d);
	    
	    System.out.println("Heterogeneus List: "+heterogeneousList);
		
		
		
	}

}
