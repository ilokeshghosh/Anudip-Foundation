package ArrayTutorial;

import java.util.Scanner;

//WAP to count the no. of vowels present in a string;
//e.g Good Morning
//no. of vowels -> 4
public class CountVowels {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str= sc.nextLine();
		System.out.println("The count of vowel  in ' "+str+" ' is : "+countVowel(str));
	}
	
	public static int countVowel(String str) {
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c=='A' || c=='E' || c== 'I' || c== 'O' || c== 'U' || c=='a'  || c=='e'  || c=='i'  || c=='o'  || c=='u') {
				count ++;
			}
		}
		return count;
	}

}
