package ArrayTutorial;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count=0,i,size;
		System.out.println("Enter the size ");
		size = sc.nextInt();
		
		int a1[] = new int[size];
		
		System.out.println("Enter the elements : "); //taking elements in array
		
		for(i=0;i<size;i++) {
			a1[i]= sc.nextInt();
			
		}

		//printing the elments
//		for(i=0;i<size;i++) {
//			System.out.println(a1[i]+" ");
//			
//		}
		
		for(i=0;i<size-1;i++) {
			for(int j=i+1;j<size;j++) {
				if(a1[i]==a1[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println("The number of duplicate items : "+count);
	}

}
