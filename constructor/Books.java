package constructor;
import assignment_class_and_objecjt.Book;

public class Books {

	public static void main(String[] args) {
		Book[] bookArray = new Book[3];

        //  constructor
        bookArray[0] = new Book("Java Programming", "James Gosling", 12345, 450.75, 2020);
        bookArray[1] = new Book("Data Structures", "Mark Allen", 23456, 520.00, 2018);
        bookArray[2] = new Book("Operating Systems", "Galvin", 34567, 399.99, 2019);

       
        System.out.println("---- Book Details ----");
        for (Book book : bookArray) {
            book.displayBookDetails();
        }

        
        System.out.println("Total Book Sales Count (static): " + bookArray[0].getBookSales_Count());
    }

	

}
