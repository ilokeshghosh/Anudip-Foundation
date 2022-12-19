package Theory;

import java.util.Scanner;


public class Calculator {
	
	public  static  int addition(int a ,int b) {
		return a+b;
	}
	
	public  static  int sub(int a ,int b) {
		if(a>b) {
			return a-b;
		}
		return b-a;
	}
	
	public  static  int mul(int a ,int b) {
		return a*b;
	}
	
	public  static  int div(int a ,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		int i=0;
		
		while(true) {
			
			System.out.println("Enter any options : + , - , *, / ans 0 to exit : ");
			char op= sc.next().charAt(0);
			if(op=='0') {
				System.out.println("Exiting the calculator...!!");
				System.out.println("pew pew exited...");
				break;
			}
			int num1,num2;
			
			switch(op) {
			case '+':
				System.out.println("Enter the 1st number :");
				 num1= sc.nextInt();
				System.out.println("Enter the 2nd Number :");
				 num2= sc.nextInt();
				System.out.println("The summation of "+num1+" and "+num2+" : "+addition(num1,num2));
				
				break;
			case '-':
				System.out.println("Enter the 1st number :");
				 num1= sc.nextInt();
				System.out.println("Enter the 2nd Number :");
				num2= sc.nextInt();
				if(num1<num2) {
					System.out.println("The subtraction of "+num2+" from "+num1+" : "+sub(num1,num2));
					break;
				}
				System.out.println("The subtraction of "+num1+" from "+num2+" : "+sub(num1,num2));
				
				break;
			case '*':
				System.out.println("Enter the 1st number :");
				 num1= sc.nextInt();
				System.out.println("Enter the 2nd Number :");
				 num2= sc.nextInt();
				System.out.println("The multiplication of "+num1+" and "+num2+" : "+mul(num1,num2));
				
				break;
			case '/':
				System.out.println("Enter the 1st number :");
				 num1= sc.nextInt();
				System.out.println("Enter the 2nd Number :");
				num2= sc.nextInt();
				System.out.println("The division of "+num1+" and "+num2+" : "+sub(num1,num2));
				break;
			default:{
				System.out.println("Oops!.... you have entered wrong option....let's reEnter option ");
			}
			}
		}
		
	}

}
