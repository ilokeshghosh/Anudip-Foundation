package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> list1= new ArrayList<Integer>(); //Can be changed to another sub list
		ArrayList<Integer> list2 = new ArrayList<Integer>(); // cant't changed to another sub list 
		list1.add(11);
		list1.add(13);
		list1.add(15);
		System.out.println(list1);
		System.out.println(list1.size());
		list1.add(14);
		list1.add(34);
		System.out.println(list1);
		System.out.println(list1.size());
		list1.add(1,16);
		System.out.println(list1);
		System.out.println(list1.size());
		list1.set(1, 20);
		System.out.println(list1);
		System.out.println(list1.size());
		
		
		//operation can be done using unirary operator
		list1.replaceAll(a -> a*2);
		System.out.println(list1);
		System.out.println(list1.size());
		
		
	
		
		
		
		

	}

}
