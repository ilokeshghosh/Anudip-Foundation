package ArrayTutorial;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOfArray {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of the array ");
		int size= sc.nextInt();
		
		int a[] = new int[size];
		int b[] = new int[size];
		
		//taking input 
		
				
				for(int i=0;i<a.length;i++) {
					System.out.println("Enter the element at "+i+" index");
					a[i]=sc.nextInt();

				}
				System.out.println("Old  array : ");
				System.out.println(Arrays.toString(a));
				for(int i=0;i<a.length;i++) {
					
					b[i]=a[i];

				}
				
				System.out.println("New array : ");
				System.out.println(Arrays.toString(b));
				
			
				
		
	}

}
