package Lab;

import java.util.Scanner;

public class alpha_or_digit_or_special {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the character :");
		char al= sc.next().charAt(0);
		
		if((al>='a' && al<='z') || (al>='A' && al<='Z')) {
			System.out.println(al+" is alphabet");
		}
		else if(al>='0'&& al<='9'){
			System.out.println(al+" is a number ");
		}
		else {
			System.out.println(al+" is special character");
		}
		

	}

}
