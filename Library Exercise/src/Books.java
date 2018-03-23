
public class Books extends LibraryItem {

	// Fields/Attributes - describes object
	private int booknum;
	public String title;

	// Constructor - a state of object
	public Books(int booknum, String title, String author) {
		// super();

		this.booknum = booknum;
		this.setAuthor(author);
		this.title = title;
	}
	

	// Methods describes the behaviour
	public void startreading() {
		System.out.println("You are reading a book written by " + getAuthor() + " and it's title is " + title);
	}

	public String toString() {
		return "Books:" + " " + booknum + " " + title + " " + getAuthor();
	}
}
