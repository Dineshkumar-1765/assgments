package assignment_class_and_objecjt;

public class Flight {
	
		private static String airlineCode = "AI";  
		
    	private static int totalFlights = 0; 
		
		private int flightNumber;
		
		private String flightName;
		
		private int seatsAvailable;
		
		private String starting_Location;
		
		private String destination;
		
		private float ticket_Price;
		
		Flight(int flightNumber,String flightName,int seatsAvailable,String starting_Location, String destination,float ticket_Price){
			
			this.flightNumber=flightNumber;
			
			this.flightName=flightName;
			
			this.seatsAvailable=seatsAvailable;
			
			this.starting_Location=starting_Location;
			
			this.destination=destination;
			
			this.ticket_Price=ticket_Price;
			
			totalFlights++;
		}

		public int getFlightNumber() {
			return flightNumber;
		}

		public void setFlightNumber(int flightNumber) {
			this.flightNumber = flightNumber;
		}

		public String getFlightName() {
			return flightName;
		}

		public void setFlightName(String flightName) {
			this.flightName = flightName;
		}

		public int getSeatsAvailable() {
			return seatsAvailable;
		}

		public void setSeatsAvailable(int seatsAvailable) {
			this.seatsAvailable = seatsAvailable;
		}

		public String getStarting_Location() {
			return starting_Location;
		}

		public void setStarting_Location(String starting_Location) {
			this.starting_Location = starting_Location;
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public float getTicket_Price() {
			return ticket_Price;
		}

		public void setTicket_Price(float ticket_Price) {
			this.ticket_Price = ticket_Price;
		}

		public static String getAirlineCode() {
			return airlineCode;
		}

		public static int getTotalFlights() {
			return totalFlights;
		}
		
		void displayFlightDetails() {
			
			System.out.println("....Flight Details....");
			
			System.out.println("AirlineCode :"+airlineCode);
			System.out.println("TotalFlights :"+totalFlights);
			System.out.println("FlightNumber :"+flightNumber);
			System.out.println("FlightName :"+flightName);
			System.out.println("SeatsAvailable :"+seatsAvailable);
			System.out.println("Starting_Location :"+starting_Location);
			System.out.println("Destination :"+destination);
			System.out.println("Ticket_Price :"+ticket_Price);
		
		}
		
		
		
}
