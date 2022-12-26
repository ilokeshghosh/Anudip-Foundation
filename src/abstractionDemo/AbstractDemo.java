package abstractionDemo;

//we cannot create instance/object but we can create reference variable.
abstract class Bank{
	
	//abstract method- method does not have body and semicolon 
	//must be declare abstract keyword and followed by semi colon
	 abstract public void getLoanInterest();
	 
	 
	 //Concrete method- method had a body
	 public void display() {
		 System.out.println("This is a bank class.......");
	 }
}



class Sbi extends Bank{

	@Override
	public void getLoanInterest() { //abstract method called and implemented
		System.out.println("The loan interest of Sbi is 6.5%");
	}
}





class Hdfc extends Bank{

	@Override
	public void getLoanInterest() {
		System.out.println("The loan interest of Sbi is 7.5%");
		
	}
	
}



public class AbstractDemo {

	public static void main(String[] args) {
		
		Bank bank; //reference variable
		bank = new Sbi();
		bank.getLoanInterest();
		bank.display();
		
		System.out.println();
		
		Bank hdfc ;
		hdfc = new Hdfc();
		hdfc.display();
		hdfc.getLoanInterest();
		
	}

}
