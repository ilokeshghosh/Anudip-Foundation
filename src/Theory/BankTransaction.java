package Theory;

import java.util.Scanner;

public class BankTransaction {
	
	
	//Method to Withdraw amount 
	public static float withDraw(float total, float amount) {
	
		return total-amount;
		
	}
	//Method to Deposit amount 
	public static float deposit(float total, float amount) {
		return total+amount;
	}
	
	//Main function or Driver 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Let us take minimum account balance is 3000
		float total =3000;
		
		//Setting pin 
		int pin = 123,upin;
		
		//Running infinite loop for transacting infinite time
		while(true) {
			
		//Taking user input for deposit or withdrawing
		System.out.println("Options: \n 1) For Deposit \n 2) For Withdraw \n 0) To Exit");
		int op = sc.nextInt();
		
		//checking whether user want to exit or not 
		if(op==0) {
			System.out.println("Exiting...!!");
			 System.out.println("Thanks for using our service!!\n");
			break;
		}
		float amount;
		
		//Starting Switch
		switch(op) {
		
		//Case for deposit
		case 1:
			System.out.print("Enter the amount you want to Deposit in your account : ");
			amount =sc.nextFloat();
			
			//Taking pin by user input 
			System.out.println("Enter you pin before Transaction : ");
			 upin = sc.nextInt();
			 
			 //Checking for correct pin
			if(pin==upin) {
				System.out.println("Your Account balance after depositing "+amount+" is "+deposit(total,amount)); //Calling deposit method
				 System.out.println("Thanks for using our service!!\n");
				 break;
			}
			
			//Error amount if inputed pin is wrong
			else {
				System.out.println("Wrong Pin .... Access Denied");
				break;
				
			}
			
		//Case for Withdrawing
		case 2:
			System.out.print("Enter the amount you want to Withdraw in your account : ");
			 amount =sc.nextFloat();
			 
			 //Taking pin by user input 
			 System.out.println("Enter you pin before Transaction : ");
			upin = sc.nextInt();
			
			 //Checking for correct pin
				if(pin==upin) {
					//Checking Whether withdrawing amount is lower than or equal to account balance
					
					//if true do the transaction 
					 if(amount<=total) {
						 System.out.println("Your Account balance after withdrawing "+amount+" is "+withDraw(total,amount)); //Calling withdrawing method
						 System.out.println("Thanks for using our service!!\n");
						 break;
					 }
					 //if false terminate the transaction
					 else {
						 System.out.println("Insufficient Balance ");
						 System.out.println("Thanks for using our service!!\n");
						 break;
				}
			 }
				//Error amount if insert pin is wrong
				else {
					System.out.println("Wrong Pin .... Access Denied\n");
					break;
					
				}
				
				//Default : if user input wrong option
		default:
			System.out.println("Choosen Wrong option ");
			 System.out.println("Let's Try with correct with option\n");
			 
			
		}
		}
		
		
	}

}
