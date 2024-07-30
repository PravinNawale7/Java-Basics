package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListIteratorDemo {
	public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<>();
	list.add(10);
	list.add(15);
	list.add(20);
	list.add(25);
	
	Iterator<Integer> itr = list.iterator();
	System.out.println("List Elements is: ");

	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	ListIterator<Integer> itr1 = list.listIterator(list.size());
	System.out.println("List Elements in Reverse Order: ");
	int count=0;
	while(itr1.hasPrevious() && count<2) {
		System.out.println(itr1.previous());
		count++;
	}
  }
}
