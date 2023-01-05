package Lab;

import java.util.Scanner;

public class IsStringPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str =  sc.nextLine();
		
		String str2 = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			char ch = str.charAt(i);
			str2=str2+ch;
			
		}
		
		System.out.println("The Reversed String is : ");
		System.out.println(str2);
		
		System.out.println();
	
		if(str.equalsIgnoreCase(str2)) 
			{
			System.out.println("The String is palindrome");
		}
		else {
			System.out.println("The String is not palindrome");
		}
		

	}

}
