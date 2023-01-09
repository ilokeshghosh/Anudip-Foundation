package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
		
		System.out.println();
		
//		Iterator<Integer> it =list1.iterator();
		Iterator it =list1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		
		//sort arraylist ascending order
		Collections.sort(list1);
		System.out.println(list1);
		
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println(list1);
		
		System.out.println();
	
		System.out.println("Copied List : ");
		//Copy a arraylist
		list2.addAll(list1);
		System.out.println(list2);
		
		//Sublist
		List<Integer> sublist1 = new ArrayList<Integer>(list1.subList(1, 4));
		
		//Another Way to create sublist
		List<Integer> sublist2 = list1.subList(2,4);
		System.out.println(sublist2);
		
		//Search elements
		System.out.println(list1.contains(26));
		
		
		
		

	}

}
