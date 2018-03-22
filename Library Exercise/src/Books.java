
public class Books extends LibraryShelf {

	//Fields/Attributes - describes object
    private int booknum;
    public String author;
    public String title;
    
	//Constructor - a state of object
public Books(int booknum, String title, String author) {
	//super();
	
	this.booknum = booknum;
	this.author = author;
	this.title= title;
}
//Methods describes the behaviour
public void startreading() {
	System.out.println("You are reading a book written by " + author + " and it's title is " + title);
}

public String toString() {
	return "Books:" +" "+ booknum +" "+ title +" "+ author;
}
}


