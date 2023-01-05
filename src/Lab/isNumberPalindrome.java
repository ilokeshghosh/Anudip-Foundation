package Lab;

import java.util.Scanner;

public class isNumberPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int temp=num;
		int reverse= 0;
		while(temp>0) {
			int r=temp%10;
			reverse= (reverse*10)+r;
			temp/=10;
			
		}
		
		System.out.print("The reverse number is : ");
		System.out.println(reverse);
		
		if(num==reverse) 	{
			System.out.println("The Number is palindrome");
		}
		else {
			System.out.println("The Number is not palindrome");
		}

	}

}
