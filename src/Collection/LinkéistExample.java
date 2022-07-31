package Collection;

import java.util.ArrayList;

public class LinkéistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//linked list stores its data different than array John has the address of leeana and leeana has address oof next.. linkedlist will give u better performance as array list. for large data linkedlist,for small arraylist
		
		LinkedList<String> list1 = new ArrayList<String>();
		
		list1.add("John");
		list1.add("Leeana");
		list1.add("Priyanka");
		list1.add("Rohan");
		list1.add("Laurence");
		
		System.out.println("List is this " + list1);
		System.out.println("Size of Linked List is " + list1.size());
		
	}

}
