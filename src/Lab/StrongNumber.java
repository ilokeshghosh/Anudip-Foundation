package Lab;

import java.util.Scanner;

//WAP to check whether a number is  strong number or not

public class StrongNumber {

	public static void main(String[] args) {
		
		//Taking input
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number to check whether");
		int num = sc.nextInt();
		
		//Storing num in temp variable to compare later
		int tmp=num;
		int sum=0;
		
		//running loop to find factorial and add them  
		while(num>0) {
			
			//taking out last digit of a number by taking out remainder;
			int r = num%10;
			
			//calling a function that returns the factorial of the remainder
			sum+=fact(r);
			
			//Resizing the number
			num/=10;
		}
		
		//Checking whether the number is strong or not
		if(sum==tmp) {
			System.out.println(tmp+" is strong number ");
		}
		else {
			System.out.println(tmp+" is not a strong number ");
		}
		sc.close();

	}
	
	// function that return the factorial of remainder 
	static int fact(int num) {
		int mul=1;
		for(int i=1;i<=num;i++) {
			if(num==0) {
				return 0;
			}
			if(num==1) {
				mul*=1;
			}
			
			mul*=i;
		}
		return mul;
	}

}
