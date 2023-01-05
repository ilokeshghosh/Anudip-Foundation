package bookmanagement;

import java.util.Scanner;

public class BookService {
	static Book  book[] = new Book[10];
	static int index =0;
	
	static Scanner sc= new Scanner(System.in);
	
	
	//create book method
	public static void createBook() {
		System.out.println("Enter Book ID : ");
		int id = sc.nextInt();
		
		sc.nextLine(); //it will consume the next line
 		
		System.out.println("Enter Book Name : ");
		String bname = sc.nextLine();
		
		
		System.out.println("Enter Author's Name");
		String author= sc.nextLine();
		
		
		System.out.println("Enter Book Price : ");
		double price = sc.nextDouble();
		
		book[index] = new Book(id, bname, price, author);
		index++;
		System.out.println("Book Details addes !!\n");
		
		
		
		
	}
	
	
	//Get all book details
	public static void getAllBookDetails() {

			for(int i=0;i<index;i++) {
				System.out.println("Book Id : "+book[i].getBookId());
				System.out.println("Book Name : "+book[i].getBookname());
				System.out.println("Book Author : "+book[i].getAuthor());
				System.out.println("Book Price : "+book[i].getBookPrice());
				System.out.println("-------------------------------------------------------------------------------");
				System.out.println();
			}
		
	}
	
	
	//Get book details using id
	public static void getBookDetailsUsingId() {
		System.out.println("Enter Book ID to search : ");
		int id= sc.nextInt();
		boolean flag = false;
		for(int i=0;i<index;i++) {
			if(id==book[i].getBookId()) {
				
				System.out.println("Book Id : "+book[i].getBookId());
				System.out.println("Book Name : "+book[i].getBookname());
				System.out.println("Book Author : "+book[i].getAuthor());
				System.out.println("Book Price : "+book[i].getBookPrice());
				System.out.println("-------------------------------------------------------------------------------");
				System.out.println();
				flag=true;
				break;
			}
			
		}
		
			if(!flag) {
				System.out.println("Book Not found");
				System.out.println();
			
		}
		
		
	}
	
	//Get book details using Book Id
	public static void getBookDetailsUsingName() {
		System.out.println("Enter Book Name to search : ");
		String str = sc.nextLine();
		
		boolean flag = false;
		sc.nextLine();
		for(int i=0;i<index;i++) {
			String c = book[i].getBookname();
//			if(str.equalsIgnoreCase(c))
			if(c==str) {
				System.out.println("Book Id : "+book[i].getBookId());
				System.out.println("Book Name : "+book[i].getBookname());
				System.out.println("Book Author : "+book[i].getAuthor());
				System.out.println("Book Price : "+book[i].getBookPrice());
				System.out.println("-------------------------------------------------------------------------------");
				System.out.println();
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Book Not found");
			System.out.println();
		
	}
	}
	
	
	
	
	
	

	
	
	
	

}
