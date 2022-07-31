package Collection;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] array1 = {"abc","pqr"};
		
		//collectors topic		
		ArrayList<String> list1 = new ArrayList<String>();
		
		
		list1.add("John");
		list1.add("Lina");
		list1.add("Lin");
		list1.add("Lia");
		
		System.out.println("This is the List " + list1);
		
		System.out.println("Size is " + list1.size());
		
		list1.remove(1);
		
		list1.set(0,"James");
		
		
		
		for (int index=0; index<list1.size();index++) {
			System.out.println(list1.get(index));
		}
		
		for (String name: list1) {
			System.out.println(name);
		}

		
		
			for(int i = 0; i<list1.size(); i++) {
			            if(list1.get(i).equals("Lin")) {
			                System.out.println(i);
			                break;
			            }	
	}
			
	
}
}
