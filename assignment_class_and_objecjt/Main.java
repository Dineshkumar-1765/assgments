package assignment_class_and_objecjt;

public class Main {

	public static void main(String[] args) {
		Book b=new Book("Dinesh_life","Dinesh",123,199,2026);
		System.out.println(b.getBook_Name()+" "+b.getAuthor()+" "+b.getBookSales_Count());
		b.setAuthor("Dineshkumar");
		Book b1=new Book("Dinesh_life","Dinesh",123,199,2026);
		System.out.println(b1.getBook_Name()+" \n"+b1.getAuthor()+"\n");
		
		Employee e=new Employee(101,"Dinesh","dinesh123gmail.com","ZOHO-Software Developert",40000);
		
		e.displayDetails();
		
		System.out.println();
		
		Flight a=new Flight(10212,"Indego",100,"chennai","DUbai",3000);
		
		a.displayFlightDetails();
		
		System.out.println();
		
		a.setTicket_Price(5000);
		
		a.displayFlightDetails();
		
		System.out.println();
		
		Movie m=new Movie("GoodBadUgly","Ajith Kumar","Adhik Ravichandran",2025,10);
		
		m.displayMovieDetail();
		
	}

}
