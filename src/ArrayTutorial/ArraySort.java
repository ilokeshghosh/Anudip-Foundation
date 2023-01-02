package ArrayTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
	
		
	
		int[] b = {12, 10, 9, 5, 43};
		
		int temp=0;
		System.out.println("Original Array ");
		
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]<b[j]) {
					temp = b[i];
					b[i]=b[j];
					b[j]=temp;
					
				}
			}
		}
		System.out.println("Sorted in Descending oder ");
		System.out.println(Arrays.toString(b));
		
		
		
	
		System.out.println("Second Method ");
		Integer arr[] = {12, 55, 99, 35, 9};
	
	 Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
		
		

	}

}
