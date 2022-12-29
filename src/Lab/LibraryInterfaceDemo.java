package Lab;


//Create an interface LibraryUser with the following methods declared
interface LibraryUser{
	void registerAccount();
	void requestBook();
	
}



//Create 2 classes “KidUsers” and “AdultUser” which implements the LibraryUser interface

//Kid User class
class KidUser implements LibraryUser{
			int age;
			String bookType;
			
			
	@Override
	public void registerAccount() {
		if(age<12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		
	}

	@Override
	public void requestBook() {
		if(bookType.equalsIgnoreCase("Kids")) {
			System.out.println("Book Issued successfully, please return the book within 10 days");
			
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
		
	}

	
	
}


//Adult User class
class AdultUser implements LibraryUser{
	int age;
	String bookType;

	@Override
	public void registerAccount() {
		if(age>12) {
			System.out.println("You have successfully registered under an Adult Account");
		}
		else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
		
	}

	@Override
	public void requestBook() {
		if(bookType.equalsIgnoreCase("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
			
		}
		else {
			System.out.println("Oops, you are allowed to take only  adult Fiction books");
		}
		
	}
	
}


public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUser kid1 = new KidUser();
		KidUser kid2 = new KidUser();
		kid1.age =10;
		kid2.age =18;
		kid1.registerAccount();
		kid2.registerAccount();
		kid1.bookType = "Kids";
		kid2.bookType = "Fiction";
		kid1.requestBook();
		kid2.requestBook();
		
		System.out.println();
		AdultUser adult1= new AdultUser();
		AdultUser adult2= new AdultUser();
		adult1.age =5;
		adult2.age =23;
		adult1.registerAccount();
		adult2.registerAccount();
		adult1.bookType="Kids";
		adult2.bookType="Fiction";
		adult1.requestBook();
		adult2.requestBook();
		
		
		

	}

}
