package ArrayTutorial;

import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {23, 56, 77, 90, 45};
		int ele = 45;
		
		Arrays.sort(arr);
		System.out.println("Sorted array : ");
		System.out.println(Arrays.toString(arr));
		int result = Arrays.binarySearch(arr, ele);
		
		System.out.println("Element found at index : "+ (result));
	

	}

}
