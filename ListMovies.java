import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListMovies {

	public static void main(String[] args) {
		// Scanner
		Scanner scnr = new Scanner(System.in);

		// Categories Map
		HashMap<String, ArrayList<String>> categories = new HashMap<>();

		// Animated ArrayList
		ArrayList<String> animated = new ArrayList<>();

		// Drama ArrayList
		ArrayList<String> drama = new ArrayList<>();

		// Horror ArrayList
		ArrayList<String> horror = new ArrayList<>();

		// SciFi
		ArrayList<String> sciFi = new ArrayList<>();

		// Animated Movies
		MovieMethods.fillAnimatedMovies(animated);
		// System.out.println(animated);

		// Dramas
		MovieMethods.fillDramaMovies(drama);
		// System.out.println(drama);

		// Horror Movies
		MovieMethods.fillHorrorMovies(horror);
		// System.out.println(horror);

		// SciFi Movies
		MovieMethods.fillSciFiMovies(sciFi);
		// System.out.println(sciFi);

		// categories.put("Animated", animated);

		categories = MovieMethods.fillCatagory("Animated", animated, categories);

		categories = MovieMethods.fillCatagory("Horror", horror, categories);

		categories = MovieMethods.fillCatagory("Drama", drama, categories);

		categories = MovieMethods.fillCatagory("SciFi", sciFi, categories);

		System.out.println(
				"Welcome to the Movie List Application!\n\nThere are 12 movies in this list.\nWhatcategory are you interest in?");

		// Application Variables
		String userInput = "";
		String listMovies = "";

		do {
			userInput = Validator.getStringWithValidInformation(scnr,
					"The categories are: Animated, Drama, Horror, SciFi: ");

			if (userInput.equals("animated")) {

				categories.clear();
				categories = MovieMethods.fillCatagory("Animated", animated, categories);
				MovieMethods.printHashMap(categories);

			} else if (userInput.equals("drama")) {
				categories.clear();
				categories = MovieMethods.fillCatagory("Drama", drama, categories);
				MovieMethods.printHashMap(categories);

			} else if (userInput.equals("horror")) {
				categories.clear();
				categories = MovieMethods.fillCatagory("Horror", horror, categories);
				MovieMethods.printHashMap(categories);

			} else if (userInput.equals("scifi")) {
				categories.clear();
				categories = MovieMethods.fillCatagory("SciFi", sciFi, categories);
				MovieMethods.printHashMap(categories);

			}

			else {
				System.out.println("Sorry we dont have that genre. Try Again!");

			}

			System.out.println("Continue?(yes or no)");
			listMovies = Validator.YesOrNo(scnr, "");
		} while (listMovies.equals("yes"));

		if (listMovies.equals("no")) {
			System.out.println("Exiting Application");

		}

		scnr.close();
	}

}
