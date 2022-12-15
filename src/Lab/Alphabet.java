package Lab;
import java.util.Scanner;
//WAP Check whether a character is alphabet or not
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

	}
	
	
	
	



}
