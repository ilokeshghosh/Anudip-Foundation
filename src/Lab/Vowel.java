package Lab;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the character :");
		char al= sc.next().charAt(0);
		if((al=='a'|| al=='e' || al=='i' || al=='o' || al=='u') || (al=='A'|| al=='E' || al=='I' || al=='O' || al=='U')) {
			System.out.println(al+" is also vowel ");
		}
		else {
			System.out.println(al+" is consonent or not even a alphabet");
		}

	}

}
