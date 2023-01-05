package bookmanagement;

public class Book {
	
	private int bookId;
	private String bookname;
	private double bookPrice;
	private String  author;
	
	
	//getter of bookId
	public int getBookId() {
		return bookId;
	}
	
	//setter of bookId
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
	//getter of bookId
	public String getBookname() {
		return bookname;
	}
	
	//setter of book Name
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	//getter of book Price
	public double getBookPrice() {
		return bookPrice;
	}
	
	//setter of book Price
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	//getter of Author
	public String getAuthor() {
		return author;
	}
	
	//setter of Author
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public Book(int bookId, String bookname, double bookPrice, String author) {
		super();
		this.bookId = bookId;
		this.bookname = bookname;
		this.bookPrice = bookPrice;
		this.author = author;
	}
	
	
	public Book() {
		super();
		
	}
	
	

}
