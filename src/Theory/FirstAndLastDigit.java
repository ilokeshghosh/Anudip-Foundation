package Theory;

import java.util.Scanner;

public class FirstAndLastDigit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		 int  firstDigit=0;
		int lastDigit=0;
		

		lastDigit = (number % 10);
	   
	    while (number != 0) {
	    	firstDigit = (number % 10);
	      number /= 10;
	    }
	    
	    
	    System.out.println(firstDigit);
	    System.out.println(lastDigit);

	}

}
