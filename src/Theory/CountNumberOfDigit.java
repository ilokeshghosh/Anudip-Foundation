package Theory;

import java.util.Scanner;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in)
;		System.out.println("Enter the number  :");
		int num= sc.nextInt();
		int temp= num;
		int count =0;
		while(num>0) {
			int r= num%10;
			count++;
			num/=10;
		}
		System.out.println("The Count of Digit of "+temp+" is : "+count);
	}
	
	
}
