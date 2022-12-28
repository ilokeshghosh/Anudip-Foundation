package ArrayTutorial;

import java.util.Scanner;

public class MultiDimensionArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][]= {
				{1,2,3,1},
				{4,5,6},
				{7,8},
				{9}
		};
		
//		System.out.println();
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]);
			}
			System.out.println();
		}
		

	}

}
