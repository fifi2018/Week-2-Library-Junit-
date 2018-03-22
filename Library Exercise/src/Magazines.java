
 public class Magazines extends LibraryShelf{

	//Fields/Attributes - describes object
    private String issuenum;
    public String author;
    public String brand;
    
	//Constructor - a state of object
 public Magazines(String issuenum, String author, String brand) {
	//super();
	
	this.setIssuenum(issuenum);
	this.author = author;
	this.brand = brand;
}
//Methods describes the behaviour
public void startreading()
{
	System.out.println("You are reading a magazine by " + brand + " issue number " + getIssuenum());
}

public String toString() {
	return "Magazines:" +" "+ getIssuenum() +" "+ author +" "+ brand;

}
public String getIssuenum() {
	return issuenum;
}
public void setIssuenum(String issuenum) {
	this.issuenum = issuenum;
}

}