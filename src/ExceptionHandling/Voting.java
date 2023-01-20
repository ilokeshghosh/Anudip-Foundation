package ExceptionHandling;

import java.util.Scanner;

public class Voting {

	public static  void checkVoting(int age) throws VotingException{
		if(age>=18) {
			System.out.println("You can Vote");
		}
		else {
			throw new VotingException("Sorry you can't vote");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter you age");
		int age= sc.nextInt();
		
		 try {
			 checkVoting(age);
		 }
		 catch(VotingException e) {
//			 System.out.println(e.getMessage());
			 e.printStackTrace();
		 }
		 System.out.println("hi");
		

	}

}
