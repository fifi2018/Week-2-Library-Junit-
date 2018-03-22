
public class Newspaper extends LibraryShelf {
	
		//Fields/Attributes - describes object
	    private String datepublished;
	    public String author;
	    public String brand;
	    
		//Constructor - a state of object
	 public Newspaper(String datepublished, String author, String brand) {
		super();
		this.datepublished = datepublished;
		this.author = author;
		this.brand = brand;
	}
	//Methods describes the behaviour
	public void startreading() {
		System.out.println("You are reading the newspaper " + brand + " dated " + datepublished);
	}

	public String toString() {
		return "Newspaper:" +" "+ datepublished +" "+ author +" "+ brand;

	}

	}
