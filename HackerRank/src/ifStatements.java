    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class ifStatements {

        public static void main(String[] args) {

        	
        	System.out.println("Please input a number from 0 - 100"); 
            Scanner sc=new Scanner(System.in);
            
            for(int i=0;i<3;i++) {
            int n =sc.nextInt();  
            
            String ans="";
            
            if(n%2==1){
              ans = "Weird";
            }
            else if (n%2==0 && n<=5) {
              ans = "Not Weird";
            	}	
            else if (n%2==0 && n<=20) {
                ans = "Weird";
              	}	
            else if (n%2==0 && n>20) {
                ans = "Not Weird";
              	}
            System.out.println(ans);
        }
        }
}