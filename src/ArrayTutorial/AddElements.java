package ArrayTutorial;

import java.util.Arrays;
import java.util.Scanner;

public class AddElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int size = sc.nextInt();
		
		int[] a = new int[size];
		
		System.out.println("Enter "+size+ " element in 1st array ");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
			
		}
		
		int[] b = new int[size];
		System.out.println("Enter "+size+ " element in 2nd array ");
		for(int i=0;i<size;i++) {
			b[i]=sc.nextInt();
			
		}
		
		int[] ans = new int[size];
		for(int i=0;i<size;i++) {
			ans[i]=a[i]+b[i];
			
		}
		
		System.out.println("The final array is ");
		System.out.println(Arrays.toString(ans));
		

	}

}
