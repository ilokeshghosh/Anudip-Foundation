package CollectionFramework;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		 List<Integer> num = new LinkedList<>();
	        num.add(6);
	        num.add(8);
	        num.add(9);
	        num.add(44);
	    

	        
	        //Iterating the list using while loop
	        int x=0;
	        while(x<num.size()) {
	        	 System.out.print(num.get(x)+" ");
	        	 x++;
	        }
	        
	        System.out.println();
	        
	        
	        //Iterating the list using for loop
	        for(int i=0;i<num.size();i++){
	            System.out.print(num.get(i)+" ");
	        }

	        
	        System.out.println();

	        
	        //Iterating the list using for-each loop
	        for(Integer i:num){
	            System.out.print(i+" ");
	        }

	        
	        System.out.println();
	        

	        //Iterating the list using  Iterator Interface
	        Iterator<Integer> it = num.iterator();
	        while(it.hasNext()){
	            System.out.println("iterator "+ it.next());
	        }
	        
	        LinkedList<String> name = new LinkedList<>();
	        name.addFirst("Sunita");
	        name.addLast("Suborno");
	        name.add("Amrita");
	        name.add("Rahul");
	        name.add(2,"Lokesh");
	        System.out.println(name);
	        
	        System.out.println();
	        
	        System.out.println("performing removing operation :");
	        name.removeFirst(); //removing form first position
	        name.removeLast(); // removing from last position
	        name.remove(1);//removing from index 2
	        System.out.println(name.remove("Lokesh"));
	        System.out.println(name);
	        
	        System.out.println();
	        System.out.println("performing set and get method ");
	        name.set(1, "Lokesh");
	        System.out.println(name);
//	        String names = name.get(0);
//	        System.out.println(names);
	        System.out.println(name.get(1));
	        System.out.println(name);
	        
	        name.removeAll(name);
	        System.out.println(name);
	        
	        name.addFirst("Sunita");
	        name.addLast("Suborno");
	        name.add("Amrita");
	        name.add("Rahul");
	        
	        ListIterator listit =name.listIterator();
	        
	        System.out.println("Forward Direction ");
	        while(listit.hasNext()) {
	        	System.out.println(listit.next());
	        }
	        
	        System.out.println();
	        
	        
	        System.out.println("Backward Directions");
	        
	        while(listit.hasPrevious()) {
	        	System.out.println(listit.previous());
	        }
	        
	        
	        System.out.println();
	        
	        
	        System.out.println("Printing in reverse using descending interator");
	        
	        
	        Iterator itr1= name.descendingIterator();
	        while(itr1.hasNext()) {
	        	System.out.println(itr1.next());
	        }
	        
	        System.out.println();
	        
	        Scanner sc= new Scanner(System.in);
	        System.out.println("Enter a name to check : ");
	        String str = sc.next();
	        //Checking the contents using if loop using contains keyword 
	        
	        if(name.contains(str)) {
	        	System.out.println("Data is present");
	        }
	        else {
	        	System.out.println("Data  is not present");
	        	
	        }
	        
	        
//	        System.out.println(name);
	        
	        
	        name.add("Sabdick");
	        System.out.println(name);
	        System.out.println(name.lastIndexOf("Rahul"));
	        
	        System.out.println("Element popped : "+name.pop());
	        System.out.println(name);
	        
	        System.out.println("Element poll : "+name.poll());
	        System.out.println(name);
	        
	        System.out.println("Element poll : "+name.pollFirst());
	        System.out.println(name);
	        
	        System.out.println("Element poll : "+name.pollLast());
	        System.out.println(name);
	        
	        name.push("Sandip");
	        name.push("Arnab");
	        
	        //converting linked list into array list
	        List<String>  arlist = new ArrayList<>(name);
	        System.out.println("Converting linked llist to array list : ");
	        System.out.println(name);
	        
	        System.out.println();
	        
	        //converting linked list into array
	        String array[] = name.toArray(new String[name.size()]);
	        System.out.println("Converting linked list to array");
	        System.out.println(Arrays.toString(array));

	        
	        
	        
	        
	        
	}

}
