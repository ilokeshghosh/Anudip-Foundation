package ArrayTutorial;

import java.util.Scanner;

public class ArrayCreation {

	public static void main(String[] args) {
		
		//Creating an array in compile time
		int arr[] = {2,5,6,9,8};
		
		
		String name[]= {"Lokesh","Rahul","Ram","Sita"}; 
		System.out.println(arr[4]);
		
		
		char c[] = {'a','b','c','d'};
		
		//Iterating using for loop
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		
		System.out.println();
		
		//Iterating using for-each loop
		for(String i:name) {
			System.out.println(i);
		}
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		//Creating a array in runtime
		int arr1[] = new int[5]; //array is static we cannot change the size of the array
	
		for(int i=0;i<arr1.length;i++) {
			System.out.println("Enter the value  at "+i+" index : ");
			arr1[i]= sc.nextInt();
		}
		
		for(Integer i:arr1) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for(int i:arr1) {
			System.out.println(i);
		}


	}

}
