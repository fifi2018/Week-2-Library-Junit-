package Model;

public class BlackJack
{
		 public static int blackJack(int a, int b) {
			 
			 if (a>21 && b>21) {
			 return 0; 
			 }
			 if (a > b) {
			 
			 return a;
			 
			 }
			  if (b > a) { 
		  return b;}
			  
			return 0;
		 
		      
		 }
	
}