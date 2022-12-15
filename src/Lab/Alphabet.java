package Lab;
//1.WAP to check whether a character is alphabet or not
//2.WAP to check whether a character is a vowel or a consonant
//WAP to create a multiplication table
import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the character :");
		char al= sc.next().charAt(0);
		
		if((al>='a' && al<='z') || (al>='A' && al<='Z')) {
			System.out.println(al+" is alphabet");
		}
		else {
			System.out.println(al+" is not alphabet");
		}
//		vowel(al);
		table();
	}
	
	
	//Code to check a character vowel or not
	static void vowel(char al) {
		if((al=='a'|| al=='e' || al=='i' || al=='o' || al=='u') || (al=='A'|| al=='E' || al=='I' || al=='O' || al=='U')) {
			System.out.println(al+" is also vowel ");
		}
		else {
			System.out.println(al+" is consonent or not even alphabet");
		}
	}
	
	
	//Code to print Table
	static void table() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number  you want muliplication table  of :");
		int num= sc.nextInt();
		
		System.out.println("The muliplication table of "+num+" is ");
		for(int i=1;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+(num*i));
		}
	}

}
