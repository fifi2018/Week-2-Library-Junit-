
public class Newspaper extends LibraryItem {
	
		//Fields/Attributes - describes object
	    private String datepublished;
	 
	    public String brand;
	    
		//Constructor - a state of object
	 public Newspaper(String datepublished, String author, String brand) {
		super();
		this.datepublished = datepublished;
		this.setAuthor(author);
		this.brand = brand;
	}
	//Methods describes the behaviour
	 
	public void startreading() {
		System.out.println("You are reading the newspaper " + brand + " dated " + datepublished);
	}

	public String toString() {
		return "Newspaper:" +" "+ datepublished +" "+ getAuthor() +" "+ brand;

	}

	}
