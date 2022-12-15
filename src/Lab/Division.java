package Lab;

import java.util.Scanner;
//WAP to check a number 
public class Division {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num= sc.nextInt();
		
		if(num%5==0 && num%11==0) {
			System.out.println("This number "+num+" is divisible by both 11 and 5");
		}
		else {
			System.out.println("This number "+num+" is neither divisiable by 11 nor 5");
			
		}
		

	}

}
