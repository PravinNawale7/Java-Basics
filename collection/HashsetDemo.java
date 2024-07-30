package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class HashsetDemo {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  HashSet<Integer> set = new HashSet<>();
	System.out.println("Enter the Elements in a Set: ");
	for(int i=0;i<4;i++) {
		int input = sc.nextInt();
		set.add(input);
	}
	System.out.println(set);
	ArrayList<Integer> list = new ArrayList<>();
	System.out.println("Enter the Elements in a List: ");
	for(int i=0;i<4;i++) {
		int input = sc.nextInt();
	    list.add(input);
	}
	System.out.println(list);
    list.addAll(set);
     System.out.println("After Merging the ArrayList and Hashset "+list);
	
    Iterator<Integer> itr = set.iterator();
    while(itr.hasNext()) {
    	System.out.println(itr.next());
    	
    }
    

}
}
