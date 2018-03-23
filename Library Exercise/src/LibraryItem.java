import java.util.ArrayList;

public abstract class LibraryItem {

	private String author;

	ArrayList<LibraryRunner> myCollection = new ArrayList<>();

	public String getAuthor() {
		return author;
	}
	

	public void setAuthor(String author) {
		this.author = author;
	}

}
