package ArrayTutorial;

import java.util.Scanner;

public class SearchNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = sc.nextInt();
		
		int[] ar = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.print("Enter the elements at "+i+" index : ");
			ar[i]=sc.nextInt();
		}
		
		System.out.print("Enter which element you want to search : ");
		int num=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			if(ar[i]==num) {
				System.out.println("The elment "+num+" found at "+i+" index");
//				break;
			}
			else {
				System.out.println("The elment "+num+" not found at "+i+" index");
			}
		}

	}

}
