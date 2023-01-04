package ArrayTutorial;

import java.util.Scanner;

/*
 *WAP to count the no. of occurance of a character
 */
public class NumberOfOccuranceOfaCharacter {
		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			
			System.out.println("Enter the String : ");
			String str= sc.nextLine();
			
			System.out.println("The  Number of occurance of character is "+Occurance(str));
		}
		
		static public int Occurance(String str) {
			int count=0;
			System.out.println("Enter  the character  : ");
			char c= sc.next().charAt(0);
			
			for(int i=0;i<str.length();i++) {
				char ch = str.charAt(i);
				if(c==ch) {
					count ++;
				}
			}
			
			return count;
		}
}
