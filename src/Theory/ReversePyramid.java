package Theory;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n= sc.nextInt();
		for(int row=1;row<=n;row++) { // row
			for(int col=n;col>=row;col--) { //col
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
