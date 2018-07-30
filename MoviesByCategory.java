import java.util.ArrayList;
import java.util.Scanner;

public class MoviesByCategory {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Class Variables

		String userInput = "";

		String exitProgram = "";
		String quit = "";

		// Create all 10 movies Using the Movie Class as objects

		Movie movie1 = new Movie("Rush Hour", "comedy");
		Movie movie2 = new Movie("What Dreams May Come", "drama");
		Movie movie3 = new Movie("Jason", "horror");
		Movie movie4 = new Movie("Star Wars", "scifi");
		Movie movie5 = new Movie("Rush Hour 2", "comedy");
		Movie movie6 = new Movie("Napolean Dynamite", "comedy");
		Movie movie7 = new Movie("The Mummy", "horror");
		Movie movie8 = new Movie("Star Trek", "scifi");
		Movie movie9 = new Movie("City of God", "drama");
		Movie movie10 = new Movie("Do The Right Thing", "drama");
		Movie movie11 = new Movie("Gundam Wing", "animation");

		// Create Array to hold all movies

		ArrayList<Movie> movies = new ArrayList<>();

		// Add movies to the array

		movies.add(movie1);
		movies.add(movie2);
		movies.add(movie3);
		movies.add(movie4);
		movies.add(movie5);
		movies.add(movie6);
		movies.add(movie7);
		movies.add(movie8);
		movies.add(movie9);
		movies.add(movie10);
		movies.add(movie11);

		System.out.println("Welcome to the Movie List Application!");

		do {

			// Start Program
			System.out.println(
					"\nThere are 12 movies in this list.\nWhat category are you interest in? (comedy, drama, animation, horror)");

			userInput = Validator.getStringWithValidInformation(scnr, "");

			// Loop through array and list all movies by category

			for (Movie movie : movies) {

				if (movie.getCatagory().equals(userInput.toLowerCase())) {

					System.out.println(movie.getTitle());
				}
			}

			System.out.println("Continue?(yes or no)");
			quit = Validator.YesOrNo(scnr, "");

		} while (quit.toLowerCase().equals("yes"));

		System.out.println("Exiting Application");

		scnr.close();

	}
}
