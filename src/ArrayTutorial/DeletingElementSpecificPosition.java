package ArrayTutorial;

import java.util.Scanner;

public class DeletingElementSpecificPosition {

	public static void main(String[] args) {
		int[] ar = new int[20]; // size 20;
		Scanner sc = new Scanner(System.in);

		int i, pos;

		System.out.println("How many elements do you want to enter ");
		int ele = sc.nextInt();

		System.out.println("Enter  " + ele + " elements : ");
		for (i = 0; i < ele; i++) {
			ar[i] = sc.nextInt();

		}
		System.out.println("Original Array");

		for (i = 0; i < ele; i++) {
			System.out.print(ar[i] + " ");
		}
		System.out.println();
		System.out.println("Enter which position  you want to delete");
		pos = sc.nextInt();

		if (pos > ele + 1 || pos < 0) {
			System.out.println("invalid position");
		} else {
			for (i = pos; i < ele; i++) {
				ar[i] = ar[i + 1];
			}
			ele--;

			System.out.println("Array after insertion");
			for (i = 0; i < ele; i++) {
				System.out.print(ar[i] + " ");
			}
		}

	}

}
