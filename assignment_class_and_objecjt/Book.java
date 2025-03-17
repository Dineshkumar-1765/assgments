package assignment_class_and_objecjt;

public class Book {
	
	private String book_Name;
	
	private String author;
	
	private  int iBSN;
	
	private double book_Price;
	
	  private int publicationYear;
	
	private static int bookSales_Count=0;
	
	 public Book(String book_Name,String author,int iBSN,double book_Price, int publicationYear){
		 
		 this.book_Name=book_Name;
		 this.author=author;
		 this.iBSN=iBSN;
		 this.book_Price=book_Price;
		 this.publicationYear=publicationYear;
		 
		 bookSales_Count+=5;
		
	}
	 //Setter block below
	 public void setBook_Name(String book_Name) {
		 this.book_Name=book_Name;
	 }
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setIBSN(int iBSN) {
		this.iBSN=iBSN;
	}
	public void setBook_Price(double book_Price) {
		this.book_Price=book_Price;
	}
	
	public void setPublicationYear(int publicationYear) {
		this.publicationYear=publicationYear;
	}
	
	//Getter block below
	
	public String getBook_Name() {
		 return book_Name;
	 }
	public String getAuthor() {
		return author;
	}
	public int getIBSN() {
		return iBSN;
	}
	public double getBook_Price() {
		return book_Price;
	}
	
	public int getPublicationYear() {
		return publicationYear;
	}
	public int getBookSales_Count() {
		return  bookSales_Count;
	}
	
	public void displayBookDetails() {
        System.out.println("Book Name: " + book_Name);
        System.out.println("Author: " + author);
        System.out.println("IBSN: " + iBSN);
        System.out.println("Price: ₹" + book_Price);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("----------------------------------------");
    }

	
}
