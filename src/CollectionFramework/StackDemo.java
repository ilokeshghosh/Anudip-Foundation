package CollectionFramework;

import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		//to add an element in stack we use the method push
		stack.push(23);
		stack.push(11);
		stack.push(32);
		stack.push(45);
		
		System.out.println(stack);
		
		System.out.println("Poping the top element of stack : "+stack.pop());
		
		System.out.println(stack);
		
		System.out.println("Position : "+stack.search(32));
		
		stack.push(90);
		System.out.println("Top element : "+stack.peek());
		System.out.println(stack);

	}

}
