
public class Movie {

	private String catagory;

	private String title;

	// Constructor
	public Movie(String title, String catagory) {
		super();
		this.catagory = catagory;
		this.title = title;
	}

	// Getters and Setters
	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
