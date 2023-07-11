// Write a Java program to match a string containing only upper and lowercase letters, numbers, and underscores.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ex8 {
 
   public static void main(String[] args) {
	   
	    System.out.println(validate("The quick brown fox jumps over the lazy dog."));
	    System.out.println(validate("Hi_Dream_1"));
        }

   public static String validate(String text) {
	    Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]*$");
		 Matcher m = pattern.matcher(text);
		
	   if (m.find())
                return "Found a match!";
       else
                return "Not matched!";
   }
}