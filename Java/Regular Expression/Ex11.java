// Write a Java program to check for a number at the end of a string.

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ex11 {
 
   public static void main(String[] args) {
	   
	    System.out.println(validate("abcdef"));
		System.out.println(validate("3abcdef"));
        System.out.println(validate("abcdef9"));
		System.out.println(validate("abcdef3459"));
        }

   public static String validate(String text) {
	    Pattern pattern = Pattern.compile(".*[0-9]$");
		Matcher m = pattern.matcher(text);
		
	    if (m.find())
            return "Found a match!";
        else
            return "Not matched!";
   }
}