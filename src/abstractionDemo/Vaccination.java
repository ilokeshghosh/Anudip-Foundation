package abstractionDemo;

import java.util.Scanner;

abstract class Vaccine{
	Scanner sc = new Scanner(System.in);
	String citizen,name;
	int age;
	int price;
	
	public void firstDose() {
		sc.nextLine();
		
		System.out.println("Enter your name : ");
		name = sc.nextLine();

		System.out.println("Enter you citizenship ");
		citizen = sc.nextLine();
		
//		if(citizen==("Indian") || citizen==("INDIAN")||  citizen ==("indian")) 
		if(citizen.equalsIgnoreCase("Indian"))
		{
				System.out.println("Enter you age :");
				age = sc.nextInt();
				if(age>=18) {
					System.out.println("Enter the price : ");
					price= sc.nextInt();
					if(price==250) {
					System.out.println("First dose  vaccinated successfully ");
					}
					else {
					System.out.println("The amout should be Rs.250");
					}
				}
				else {
				System.out.println("Age must be above 18 years old");
				}
		}
		else {
			System.out.println("Vaccination is only for Indian Citizenship");
		}
		
	}
	public void secondDose() {
		System.out.println("Have you received your first Dose ? y/n");
		char c=  sc.next().charAt(0);
		if(c=='y' || c=='Y') {
			System.out.println("Has it been two months since your 1st Vaccine? y/n");
			c= sc.next().charAt(0);
			if(c=='y' || c=='Y') {
				System.out.println("Second  dose  vaccinated successfully ");
			}
			else {
				System.out.println("Please come after the completion of 2months ");
			}
		}
		else {
			System.out.println("Please receive the first dose and come again!!!!");
		}
		
	}
	
	abstract public  void booster();
	
}

class VaccinationSuccess extends Vaccine{

	@Override
	public void booster() {
		
		
	}
	
}

public class Vaccination {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VaccinationSuccess vac = new VaccinationSuccess();
		do {
		System.out.println("Welcome to Vaccination Center\n");
		System.out.print("1) First Dose\n2)Second Dose\n3)Booster\n");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1-> vac.firstDose();
		case 2->{
			vac.secondDose();
			System.out.println();
		}
		case 3->vac.booster();
		}
		}while(true);
		
	}

}
