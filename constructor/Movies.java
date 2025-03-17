package constructor;

import assignment_class_and_objecjt.Movie;

public class Movies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Movie[] movieArray = new Movie[3];

	        // Add movies using constructor
	        movieArray[0] = new Movie("Inception", "Leonardo DiCaprio", "Christopher Nolan", 2010, 8.8);
	        movieArray[1] = new Movie("3 Idiots", "Aamir Khan", "Rajkumar Hirani", 2009, 9.0);
	        movieArray[2] = new Movie("Avengers: Endgame", "Robert Downey Jr.", "Anthony Russo", 2019, 8.4);

	        // Display all movies
	        System.out.println("---- Movie Details ----");
	        for (Movie m : movieArray) {
	            m.displayMovieDetail();
	            System.out.println("-----------------------------");
	        }

	}

}
