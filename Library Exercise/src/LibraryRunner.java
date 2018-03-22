import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.plaf.basic.BasicTabbedPaneUI;

public class LibraryRunner {

	public static void main(String[] args) {
		
		ArrayList<LibraryShelf> myCollection = new ArrayList<>();
		
		// runner class pulling data from Magazine, Books & Newspaper classes                          
				Magazines a = new Magazines("2356-01" ,"S.Smith", "Vogue"); //Issnum. Author,   brand
				Magazines a1 = new Magazines("2345-02" ,"S.Smith", "Vogue");
				
				Books b = new Books (0003 ,"50 Shades of Gray", "E.L James"); //Booknum, Title, Author
				Books b1 = new Books(0002 ,"Harry Potter", "J.K Rowling");
				Books b2 = new Books(0002 ,"Game of Thrones ", "George R.R Martin");
				
				Newspaper c = new Newspaper ("17-04-2017" ,"J.Jordan", "The Times"); //Datepublished, Author, Brand;
			    
				//Method overloading
			     a.startreading();
				 b.startreading();
				 c.startreading();
				 
				 System.out.println();
				
				//Method Overriding
				System.out.println(a.toString());
				System.out.println(b.toString());
				System.out.println(c.toString());
				
				//Adding items in the array
				myCollection.add(a);
				myCollection.add(b);
				myCollection.add(b1);
				myCollection.add(c);
				
				//removing items in array
				myCollection.remove(a);
				System.out.println();
				System.out.println("The total number of items in array is = " +myCollection.size());
				
				System.out.println();
				
				//prints all items currently in array list
				for (LibraryShelf myLibrary: myCollection) {
					System.out.println(myLibrary);
				}
	}
		
			
	private static Newspaper Newspaper(String string) {
		// TODO Auto-generated method stub
		return null;
	}	
		
	
	}


