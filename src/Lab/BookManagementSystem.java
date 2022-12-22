package Lab;

import java.util.Scanner;



/*
 write a program to create Book management system.
create class name Book,and perform following actions:
# Attributes:
bookId,bookName,bookPrice,authorName,library name(static),availability
# method:
createBook() will store book details.(add at least 5 books).
displayBook()will display book details
displayBookByName(): display specific book details based on bookName
borrowBook(): borrow book if book is available based on bookName,then make availability status as "not available"
 */

class Book{
	int BookId,BookPrice;
	String BookName,AuthorName;
	public static String LibraryName =" ";
	String  availability;
	
	public void createBook(int BookId,String  BookName, int BookPrice, String AuthorName, String LibraryName) {
		this.BookId=BookId;
		this.BookName=BookName;
		this.BookPrice= BookPrice;
		this.AuthorName = AuthorName;
		this.LibraryName = LibraryName;
		this.availability = "Available";
		
	}
	public void displayBook() {
		System.out.println("Book Id :"+BookId);
		System.out.print("----------------------------------------------------------------------------|\n");
		System.out.print("|");
		System.out.print("Book Name \t\t| "+BookName);

		System.out.print("\n----------------------------------------------------------------------------|\n");
		System.out.print("|");
		System.out.print("Book Price \t\t| "+BookPrice);

		System.out.print("\n----------------------------------------------------------------------------|\n");
		System.out.print("|");
		System.out.print("Author Name \t\t| "+AuthorName);

		System.out.print("\n----------------------------------------------------------------------------|\n");
		System.out.print("|");
		System.out.print("Library Name \t\t| "+LibraryName);
		
		System.out.print("\n----------------------------------------------------------------------------|\n");
		System.out.print("|");
		System.out.print("Availability Status \t| "+availability);
		
		System.out.print("\n----------------------------------------------------------------------------|\n");
		System.out.println("\n \n \n \n \n \n \n");
	}
	public void displayBookByName(String BookName) {
//		this(BookId,BookPrice,AuthorName,LibraryName,availability);
		System.out.println("The Details of \'"+BookName+"\' Book are :");
		System.out.print("----------------------------------------------------------------------------|\n");
		System.out.print("|");
//		System.out.print("Book Name \t\t| "+BookName);
//
//		System.out.print("\n----------------------------------------------------------------------------|\n");
//		System.out.print("|");
		System.out.print("Book Price \t\t| "+BookPrice);

		System.out.print("\n----------------------------------------------------------------------------|\n");
		System.out.print("|");
		System.out.print("Author Name \t\t| "+AuthorName);

		System.out.print("\n----------------------------------------------------------------------------|\n");
		System.out.print("|");
		System.out.print("Library Name \t\t| "+LibraryName);
		
		System.out.print("\n----------------------------------------------------------------------------|\n");
		System.out.print("|");
		System.out.print("Availability Status \t| "+availability);
		
		System.out.print("\n----------------------------------------------------------------------------|\n");
		System.out.println("\n \n \n \n \n \n ");
	}
	public void borrowBook(String BookName) {
		if(availability.equals("Available")) {
			System.out.print("\n----------------------------------------------------------------------------|\n");
			System.out.print("|");
			System.out.print("Your Book\t| "+BookName+"\t| is available\t");
			System.out.print("\n----------------------------------------------------------------------------|\n");
			System.out.println("\n \n \n \n \n ");
			
//			this.availability="Not Availability";
		}
		else {
			System.out.println("Book is not available");
			System.out.println();
		}
	}
	
}


public class BookManagementSystem {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = new Book();
		Book book5 = new Book();
		
		book1.createBook(101, "Don Quixote", 1200, "Miguel de Cervantes", "Kolkata");
		book2.createBook(102,"Lord of the Rings", 1500, "J.R.R. Tolkien", "Kolkata");
		book3.createBook(103,"Harry Potter and the Sorcerer's Stone", 4000, "J.K. Rowling", "Kolkata");
		book4.createBook(104, "And Then There Were None.", 8000, "Agatha Christie", "Kolkata");
		book5.createBook(105, "Alice's Adventures in Wonderland",2000, "Lewis Carroll.", "Kolkata");
		Scanner sc= new Scanner(System.in);

		while(true) {
//			int BookId,String  BookName, int BookPrice, String AuthorName, String LibraryName
			System.out.print("Menu :\n");
			System.out.print("-------------------------|\n");
			System.out.print("|");
			System.out.print("1)Display Books  ");
			System.out.print("\n-------------------------|\n");
			System.out.print("|");
			System.out.print("2)Display Book By Name");
			System.out.print("\n-------------------------|\n");
			System.out.print("|");
			System.out.print("3)Borrow Book");
			System.out.print("\n-------------------------|\n");
			System.out.print("|");
			System.out.print("4)Exit");
			System.out.print("\n-------------------------|\n");
			
			System.out.print("Your input : ");
			int op= sc.nextInt();
			System.out.println("\n \n \n \n \n ");
			
			
			
			System.out.println();
			switch(op) {
			
				
			case 1:
				
				book1.displayBook();
				book2.displayBook();
				book3.displayBook();
				book4.displayBook();
				book5.displayBook();
				break;
				
				 
			case 2:
				System.out.print("Choose Book Name  to Display Details: ");
				System.out.print("\n----------------------------------------------------------------------------|\n");
				System.out.print("|");
				System.out.print("1)"+book1.BookName);
				System.out.print("\n----------------------------------------------------------------------------|\n");
				System.out.print("|");
				System.out.print("2)"+book2.BookName);
				System.out.print("\n----------------------------------------------------------------------------|\n");
				System.out.print("|");
				System.out.print("3)"+book3.BookName);
				System.out.print("\n----------------------------------------------------------------------------|\n");
				System.out.print("|");
				System.out.print("4)"+book4.BookName);
				System.out.print("\n----------------------------------------------------------------------------|\n");
				System.out.print("|");
				System.out.print("5)"+book5.BookName);
				System.out.print("\n----------------------------------------------------------------------------|\n");
				System.out.print("Your Option : ");
				int bookNameOp= sc.nextInt();
				System.out.println("\n \n \n \n \n ");
				switch(bookNameOp) {
				case 0 :
					break;
				case 1:
					book1.displayBookByName(book1.BookName);
					break;
				case 2:
					book2.displayBookByName(book2.BookName);
					break;
				case 3:
					book3.displayBookByName(book3.BookName);
					break;
				case 4:
					book4.displayBookByName(book4.BookName);
					break;
				case 5:
					book5.displayBookByName(book5.BookName);
					break;	
				default:
					System.out.println("Please Choose a correct book name ");
				}
				break;
			case 3:
				System.out.print("Choose Book Name  to Borrow book : ");
				System.out.print("\n----------------------------------------------------------------------------|\n");
				System.out.print("|");
				System.out.print("1)"+book1.BookName);
				System.out.print("\n----------------------------------------------------------------------------|\n");
				System.out.print("|");
				System.out.print("2)"+book2.BookName);
				System.out.print("\n----------------------------------------------------------------------------|\n");
				System.out.print("|");
				System.out.print("3)"+book3.BookName);
				System.out.print("\n----------------------------------------------------------------------------|\n");
				System.out.print("|");
				System.out.print("4)"+book4.BookName);
				System.out.print("\n----------------------------------------------------------------------------|\n");
				System.out.print("|");
				System.out.print("5)"+book5.BookName);
				System.out.print("\n----------------------------------------------------------------------------|\n");
				System.out.print("Your Option : ");
				int bookNameBo= sc.nextInt();
				System.out.println("\n \n \n \n ");
				
				System.out.println();
				switch(bookNameBo) {
				case 1:
					book1.borrowBook(book1.BookName);
					break;
				case 2:
					book2.borrowBook(book2.BookName);
					break;
				case 3:
					book3.borrowBook(book3.BookName);
					break;
				case 4:
					book4.borrowBook(book4.BookName);
					break;
				case 5:
					book5.borrowBook(book5.BookName);
					break;
				default:
					System.out.println("Please Choose a correct book name ");
			}
			break;
			case 4:
				System.out.println("Exting Book Management System.......");
				System.out.println("Exited Book Management System.....................");
				System.exit(0);
			default:
				System.out.println("Please Choose Correct Option ");
				System.out.println();
		}
		
	}
	

	}

}
