import java.util.ArrayList;
import java.util.HashMap;

public class MovieMethods {

	// Fill animated movies
	public static ArrayList<String> fillAnimatedMovies(ArrayList<String> movies) {

		movies.add("Retun or Broly");
		movies.add("Full Metal Alchemist Brotherhood");
		movies.add("Return of Afro Samurai");

		// System.out.println(movies);

		return movies;

	}

	// Fill dramas
	public static ArrayList<String> fillDramaMovies(ArrayList<String> movies) {

		movies.add("MARY QUEEN OF SCOTS");
		movies.add("FIRST MAN");
		movies.add("A STAR IS BORN");

		// System.out.println(movies);

		return movies;

	}

	// Fill horror movies
	public static ArrayList<String> fillHorrorMovies(ArrayList<String> movies) {

		movies.add("Jason");
		movies.add("The Others");
		movies.add("Children Of The Khorn");

		// System.out.println(movies);

		return movies;

	}

	// Fill SciFi movies
	public static ArrayList<String> fillSciFiMovies(ArrayList<String> movies) {

		movies.add("Star Wars");
		movies.add("The Matrix");
		movies.add("Chronicals of Narnia");

		// System.out.println(movies);

		return movies;

	}

	// Fill Category Method
	public static HashMap<String, ArrayList<String>> fillCatagory(String category, ArrayList<String> movies,
			HashMap<String, ArrayList<String>> tempMap) {
//		HashMap<String, ArrayList<String>> tempMap = new HashMap<>();
		tempMap.put(category, movies);
		// System.out.println(tempMap);
		return tempMap;

	}

	public static void printHashMap(HashMap<String, ArrayList<String>> category) {
		HashMap<String, ArrayList<String>> genre = new HashMap<>();
		genre.putAll(category);

		for (ArrayList<String> movie : genre.values()) {
			for (String movies : movie) {
				System.out.println(movies);
			}

		}

	}

}
