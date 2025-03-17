package assignment_class_and_objecjt;

public class Movie {
	
	  
	    private String movieName;
	    private String actorName;
	    private String directorName;
	    private int releaseYear;
	    private double rating;
	   
	 public   Movie(String movieName,String actorName,String directorName,int releaseYear,double rating){
	    	this.movieName=movieName;
	    	this.actorName=actorName;
	    	this.directorName=directorName;
	    	this.releaseYear=releaseYear;
	    	this.rating=rating;
	    }

		public String getMovieName() {
			return movieName;
		}

		public void setMovieName(String movieName) {
			this.movieName = movieName;
		}

		public String getActorName() {
			return actorName;
		}

		public void setActorName(String actorName) {
			this.actorName = actorName;
		}

		public String getDirectorName() {
			return directorName;
		}

		public void setDirectorName(String directorName) {
			this.directorName = directorName;
		}

		public int getReleaseYear() {
			return releaseYear;
		}

		public void setReleaseYear(int releaseYear) {
			this.releaseYear = releaseYear;
		}

		public double getRating() {
			return rating;
		}

		public void setRating(double rating) {
			this.rating = rating;
		}
	    
	    
	public 	void displayMovieDetail() {
			
			System.out.println("...Movie Details...");
			System.out.println("MovieName :"+movieName);
			System.out.println("ActorName :"+actorName);
			System.out.println("DirectorName :"+directorName);
			System.out.println("ReleaseYear :"+releaseYear);
			System.out.println("Rating :"+rating);
		}
}
