	import java.util.*;
	
public class SplitString {
	
   public static void main(String args[]) {
			   
		      String Str = new String("Today is the 5th day of the week, and 3rd week of the month");
		      System.out.println("Return sentence now split by spaces :" );      
		      
		      for (String sp: Str.split(" ")) {
		         System.out.println(sp);
	}

}
}