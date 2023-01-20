package ExceptionHandling;

import java.util.*;

public class ExceptionDemo {

	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
		
		try(Scanner sc= new Scanner(System.in)){
			try {
				
				int a,b;
				System.out.println("Enter a value ");
				a= sc.nextInt();
				System.out.println("Enter 2nd value");
				b= sc.nextInt();
				System.out.println("Result : "+(a/b));
				
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				
			}
			System.out.println("Rest of Code :");
			int arr[] = new int[5];
			arr[5] = 90;
			System.out.println("Added value : "+arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occured : Index out of Bounds");
		}
		//finally block is the last block/closing block which will always get executed
		finally {
			//sc.close(); //closing the scanner object
			System.out.println("Finally Blocj always gets executed ");
		}
		
		
	}

}
