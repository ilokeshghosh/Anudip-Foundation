package ArrayTutorial;

import java.util.Scanner;

//WAP to find the sum of all the elements of an array
public class ArraySum {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of the array ");
		int size= sc.nextInt();
		
		int a[] = new int[size];
		
		int sum=0;
		//taking input 
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element at "+i+" index");
			a[i]=sc.nextInt();
//			sum+=a[i];
		}
		
		//finding the sum 
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		
		System.out.println("The sum is : "+sum);

	}

}
