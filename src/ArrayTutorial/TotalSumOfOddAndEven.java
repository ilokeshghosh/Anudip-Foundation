package ArrayTutorial;

import java.util.Scanner;

public class TotalSumOfOddAndEven {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of the array ");
		int size= sc.nextInt();
		
		int a[] = new int[size];
		
		int Oddsum=0;
		int Evensum=0;
		int oddc = 0;
		int evenc=0;
		
		//taking input 
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the element at "+i+" index");
			a[i]=sc.nextInt();
			
			if(a[i]%2==0) {
				
				Evensum+=a[i];
				evenc++;
			}
			else {
				Oddsum+=a[i];
				oddc++;
			}

		}
		
		
		
		System.out.println("The Odd  sum is : "+Oddsum);
		System.out.println("Number of  Odd  element  is : "+oddc);
		System.out.println("The Even  sum is : "+Evensum);
		System.out.println("Number of  even  element  is : "+evenc);
		System.out.println("Total Sum is : "+(Oddsum+Evensum));

	}

}
