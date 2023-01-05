package bookmanagement;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookService bService = new BookService();
		do {
			System.out.println("Welcome to book management System : ");
			System.out.println("1) Create Book Details\n2) Get Book Details using ID\n3)Get all Book details\n4)Get Book Details By Book Name\n5)To exit\n");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("Your Option :");
			int op= sc.nextInt();
			
			switch(op) {
			case 1-> bService.createBook();
			
			case 2-> bService.getBookDetailsUsingId();
			
			case 3->bService.getAllBookDetails();
			
			case 4-> bService.getBookDetailsUsingName();
			case 5->{
				System.out.println("Thanks for using our service");
				System.exit(0);
			}
			
			default -> System.out.println("Wrong input ");
			}
			
		}while(true);
	}

}
