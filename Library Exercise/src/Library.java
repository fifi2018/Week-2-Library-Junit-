import java.util.ArrayList;

public class Library {

	ArrayList<LibraryItem> myCollection = new ArrayList<>();

	public void printList() {

		for (LibraryItem item : myCollection) {
			System.out.println(item);
		}

	}

}
