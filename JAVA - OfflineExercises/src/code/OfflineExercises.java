package code;

public class OfflineExercises {

	public static String doubleChar(String in) {

		char x, y;

		for (int i = 0; i < in.length(); i++)

		{
			if (i == in.length() - 1) {

				// check the first char against the second letter y
				x = in.charAt(i);
				y = in.charAt(i );
				if (x == y) {
							
				}
			}

//			in = in.substring(0, i + 1) + "-" + in.substring(i + 1, in.length());

		}
		return in;
		// return "";
	}// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"

	public static String getSandwich(String input)
	{
		String st = new String();
		
		char output1 = input.charAt(5);
		char output2 = input.charAt(7);
		
		input.charAt(5);
		input.charAt(7);
		//input.substring(output1, output2);

		return(input);

	}
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""

	public static boolean evenlySpaced(int a, int b, int c) {

		if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
			
			return true;
		}
		return false;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public String nTwice(String input, int a) {

		a = 0;

		return "";
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"
	
	public static boolean endsly(String input) {
		
		if (input.endsWith("ly"))
			return true;
	
		return false;
	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false

	public String stringClean(String input) {
		

		return "";
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"

	public int fibonacci(int input) {
		
		return -1;
	}
	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1

	public int bunnyEars(int input) {

	
	int bunnyears[] = { 0, 1, 2, 3, 4, 5 };
	
	  input = (input + 1);

		return -1;}
//	}
	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	public static void main(String[] args)

	{
		System.out.println(doubleChar("Hello"));
		System.out.println(getSandwich("breadjambread"));
		System.out.println(evenlySpaced(2, 9, 6));
		System.out.println(endsly("sadly"));
		//System.out.println(endsly("sadly"));
		
	}

}
