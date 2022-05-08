import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieList {
	
	public static ArrayList<Movie> movieTitleList = new ArrayList<>();
	public static ArrayList<String> movieCategory = new ArrayList<>();
	public static Scanner scan = new Scanner(System.in);
	
	static boolean looped = true;
	public static String useInput;

	public static void main(String[] args) {
		
		//ArrayList<MovieList> movieList = new ArrayList<>();
		movieTitleList.add(new Movie("Citizen Kane", "drama"));
		movieTitleList.add(new Movie("The Godfather", "drama"));
		movieTitleList.add(new Movie("2001: A Space Odyssey", "scifi"));
		movieTitleList.add(new Movie("E.T. The extra-terrestrial", "scifi"));
		movieTitleList.add(new Movie("King Kong", "horror"));
		movieTitleList.add(new Movie("Snow White And The Seven Dwarfs", "animated"));
		movieTitleList.add(new Movie("The Silence Of The Lambs", "horror"));
		movieTitleList.add(new Movie("TOY STORY", "animated"));
		movieTitleList.add(new Movie("The Graduate", "drama"));
		movieTitleList.add(new Movie("A Clockwork Orange", "scifi"));
		
		
		

		System.out.println("Welcome to the Movie List Application!");
		System.out.println("There are 10 movies in this list.");
		System.out.println("The categorie are: Drama, SiFi, Animation, and Horror");
		System.out.println("What category are you interested in?");
		//useInput = scan.nextLine();
		
		for (Movie movieTitle : movieTitleList) {
			if (!movieCategory.contains(movieTitle.getCategory()))
				movieCategory.add(movieTitle.getCategory());
		}
		
		do {
			 useInput = scan.nextLine().toLowerCase();

			if (movieTitleList.contains(useInput)) {
				looped = false;
				for (Movie movieTitle : movieTitleList) {
					if (movieTitle.getCategory().equals(useInput)) {
						System.out.println(movieTitle.getTitle());
					}
				}
			} else {
				System.out.println("Try again, enter a valid genre (Anime, Action, Comedy, or Drama)");
			}

		} while (looped);
	}

}
